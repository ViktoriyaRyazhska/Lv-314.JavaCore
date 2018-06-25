import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.RandomStringUtils;

public class Cript {

	private static String[] generated_key = new String[Key.getKey().length];
	private static SecretKeySpec secretKeySpec_AES;
	private static PublicKey publicKey_RSA;
	private static PrivateKey privateKey_RSA;

	public static PublicKey getPublicKey_RSA() {
		return publicKey_RSA;
	}

	public static void setPublicKey_RSA(PublicKey publicKey_RSA) {
		Cript.publicKey_RSA = publicKey_RSA;
	}

	public static PrivateKey getPrivateKey_RSA() {
		return privateKey_RSA;
	}

	public static void setPrivateKey_RSA(PrivateKey privateKey_RSA) {
		Cript.privateKey_RSA = privateKey_RSA;
	}

	public static SecretKeySpec getSecretKeySpec_AES() {
		return secretKeySpec_AES;
	}

	public static void setSecretKeySpec_AES(SecretKeySpec secretKeySpec_AES) {
		Cript.secretKeySpec_AES = secretKeySpec_AES;
	}

	public static String getPublicKey_RSA_toString() {
		return Base64.getEncoder().encodeToString(publicKey_RSA.getEncoded());
	}

	public static String getPrivateKey_RSA_toString() {
		return Base64.getEncoder().encodeToString(privateKey_RSA.getEncoded());
	}

	public static String getSecretKeySpec_AES_toString() {
		return Base64.getEncoder().encodeToString(secretKeySpec_AES.getEncoded());
	}

	public static String encrypt_whis_setting(String input_string, boolean use_keys, boolean use_AES, boolean use_RSA,
			String keys) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException { // зазшифрувати з налаштуваннями
		StringBuilder data_sb = new StringBuilder();
		String[] keys_arr = keys.split("\n");
		if (use_keys) {
			data_sb.append(encrypt(input_string, keys_arr));
		}
		if (use_AES) {
			if (!use_keys) {
				data_sb.append(encrypt_AES(input_string, secretKeySpec_AES));
			} else {
				String tmp = data_sb.toString();
				data_sb.delete(0, data_sb.length());
				data_sb.append(encrypt_AES(tmp, secretKeySpec_AES));
			}
		}
		if (use_RSA) {
			if (getPublicKey_RSA_toString().length() > 3) {
				if (!use_keys && !use_AES) {
					data_sb.append(encrypt_RSA(input_string));
				} else {
					String tmp = data_sb.toString();
					data_sb.delete(0, data_sb.length());
					data_sb.append(encrypt_RSA(tmp));
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"You didn't selected public key for RSA");
			}

		}
		// for(int i=0; i<keys_arr.length; i++) {
		// System.out.println("Key №"+i+" |"+keys_arr[i]);
		// }
		// System.out.println("******************");

		return data_sb.toString();
	}

	public static String decrypt_whis_setting(String input_string, boolean use_keys, boolean use_AES, boolean use_RSA, String keys)
			throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException,
			BadPaddingException { // розшифрувати з налаштуваннями
		StringBuilder data_sb = new StringBuilder();
		String[] keys_arr = keys.split("\n");
		if (use_RSA) {
			if (getPrivateKey_RSA_toString().length() > 3) {
				data_sb.append(decrypt_RSA(input_string));
			}
			else {
				JOptionPane.showMessageDialog(null,"You didn't selected private key for RSA");
			}
		}
		if (use_AES) {	
			if (!use_RSA) {
				data_sb.append(decrypt_AES(input_string, secretKeySpec_AES));
			} else {
				String tmp = data_sb.toString();
				data_sb.delete(0, data_sb.length());
				data_sb.append(decrypt_AES(tmp, secretKeySpec_AES));;
			}
			
		}
		if (use_keys) { // /!!!
			if (!use_RSA && !use_AES) {
				data_sb.append(decrypt(input_string, keys_arr));
			} else {
				String tmp = data_sb.toString();
				data_sb.delete(0, data_sb.length());
				data_sb.append(decrypt(tmp, keys_arr));
			}
		}
		// for(int i=0; i<keys_arr.length; i++) {
		// System.out.println("Key №"+i+" |"+keys_arr[i]);
		// }
		// System.out.println("******************");

		return data_sb.toString();
	}

	public static Boolean check_selected_key(StringBuilder sb) {
		boolean bool = true;
		if (((sb.length() + 1) % 7) != 0) {
			bool = false;
		}
		for (int i = 6; i < sb.length(); i += 7) {
			if (sb.charAt(i) != 0x0A) {
				bool = false;
				// System.out.println(sb.charAt(i));
			}
		}
		return bool ? true : false;
	}

	public static String sout_byte_arr(byte[] byte_arr) {
		StringBuilder outputData = new StringBuilder("");
		for (byte b : byte_arr) {
			outputData.append(b);
		}
		return outputData.toString();
	}

	public static String[] getGenerated_key() {
		return generated_key;
	}

	public static String get_entered_generated_key() {
		generate_key();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < generated_key.length; i++) {
			sb.append(generated_key[i]);
			if (i < generated_key.length - 1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	public static void generate_key() {
		for (int i = 0; i < Key.getKey().length; i++) {
			// generated_key[i]=(RandomStringUtils.randomAscii(6));
			generated_key[i] = (RandomStringUtils.randomGraph(6));
		}
	}

	public static void create_keys_RSA(boolean generate_bool, boolean public_key_bool, boolean private_key_bool,
			String input_Public_key, String input_Private_key) {
		KeyFactory kf;
		if (generate_bool) {
			KeyPairGenerator pairGenerator;
			try {
				pairGenerator = KeyPairGenerator.getInstance("RSA");
				KeyPair keyPair = pairGenerator.generateKeyPair();
				publicKey_RSA = keyPair.getPublic();
				privateKey_RSA = keyPair.getPrivate();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		} else {
			if (public_key_bool) {
				byte[] decoded_public_key_byte = Base64.getDecoder().decode(input_Public_key);
				try {
					kf = KeyFactory.getInstance("RSA");
					publicKey_RSA = kf.generatePublic(new X509EncodedKeySpec(decoded_public_key_byte));
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				} catch (InvalidKeySpecException e) {
					e.printStackTrace();
				}

			}
			if (private_key_bool) {
				byte[] decoded_private_key_byte = Base64.getDecoder().decode(input_Private_key);
				try {
					kf = KeyFactory.getInstance("RSA");
					privateKey_RSA = kf.generatePrivate(new PKCS8EncodedKeySpec(decoded_private_key_byte));
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				} catch (InvalidKeySpecException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public static String encrypt_RSA(String input_string) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey_RSA);
		return DatatypeConverter.printHexBinary(cipher.doFinal(input_string.getBytes()));
	}

	public static String decrypt_RSA(String input_s) throws IllegalBlockSizeException, BadPaddingException,
			InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
		byte[] input_bytes = DatatypeConverter.parseHexBinary(input_s);
		Cipher decryptCipher = Cipher.getInstance("RSA");
		decryptCipher.init(Cipher.DECRYPT_MODE, privateKey_RSA);
		byte[] decryptedBytes = decryptCipher.doFinal(input_bytes);
		StringBuilder outputData = new StringBuilder("");
		for (byte b : decryptedBytes) {
			outputData.append((char) b);
		}
		return outputData.toString();
	}

	public static void create_key_AES(boolean generate_bool, int keySize, String input_key)
			throws NoSuchAlgorithmException {
		if (generate_bool) {
			KeyGenerator kGen = KeyGenerator.getInstance("AES");
			kGen.init(keySize);
			SecretKey key = kGen.generateKey();
			secretKeySpec_AES = (SecretKeySpec) key;
		} else {
			SecretKeySpec key = new SecretKeySpec(input_key.getBytes(), "AES");
			secretKeySpec_AES = key;
		}
	}

	public static String encrypt_AES(String input_string, SecretKeySpec key) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return DatatypeConverter.printHexBinary(cipher.doFinal(input_string.getBytes()));

	}

	public static String decrypt_AES(String input_s, SecretKeySpec key) throws InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		byte[] input_bytes = DatatypeConverter.parseHexBinary(input_s);
		Cipher decryptCipher = Cipher.getInstance("AES");
		decryptCipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decryptedBytes = decryptCipher.doFinal(input_bytes);
		StringBuilder outputData = new StringBuilder("");
		for (byte b : decryptedBytes) {
			outputData.append((char) b);
		}
		return outputData.toString();

		// Cipher decryptCipher = Cipher.getInstance("AES");
		// decryptCipher.init(Cipher.DECRYPT_MODE, key);
		// byte[] decryptedBytes = decryptCipher.doFinal(encripted_AES_arr);
		// StringBuilder outputData = new StringBuilder("");
		// for(byte b : decryptedBytes) {
		// outputData.append((char)b);
		// }
		// return outputData.toString();
	}

	public static String encrypt(String input_string, String[] key) { // зашифрувати
		StringBuilder sb_text = new StringBuilder(input_string);
		StringBuilder text_output = new StringBuilder();

		for (int i = 0; i < sb_text.length(); i++) {
			for (int k = 0; k < Symbols.getSymbols().length; k++) {
				if (sb_text.charAt(i) == Symbols.getSymbols()[k]) {
					// System.out.println(Key.getKey()[k]);
					text_output.append(key[k]);
					break;
				}
			}
		}
		// return "Hv?0F:"+text_output.toString();
		return text_output.toString();
		// return text_output.toString()+Symbols.getSymbols().length+"| key -
		// "+Key.getKey().length;
	}

	public static String decrypt(String input_string, String[] key) { // розшифрувати
		StringBuilder sb_text = new StringBuilder(input_string);
		StringBuilder text_output = new StringBuilder();

		for (int i = 0; i < sb_text.length(); i += 6) {
			for (int k = 0; k < key.length; k++) {
				if (sb_text.substring(i, i + 6).equals(key[k])) {
					// System.out.println(Symbols.getSymbols()[k]);
					text_output.append(Symbols.getSymbols()[k]);
					break;
				}
			}
		}
		return text_output.toString();
	}

}
