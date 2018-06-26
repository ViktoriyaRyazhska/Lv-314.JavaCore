import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.xml.bind.DatatypeConverter;

public class ReadFiles {

	public static String readImg(String address) throws IOException {
		File fnew=new File(address);
		BufferedImage originalImage=ImageIO.read(fnew);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos );
		return DatatypeConverter.printHexBinary(baos.toByteArray());
	}
	
	public static void saveImg(String intut_data) {
		JFileChooser fileChooser = new JFileChooser();
		byte [] bytes = DatatypeConverter.parseHexBinary(intut_data);
		if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
		 InputStream in = new ByteArrayInputStream(bytes);
	        BufferedImage bImageFromConvert;
			try {
				bImageFromConvert = ImageIO.read(in);
				ImageIO.write(bImageFromConvert, "jpg", new File(
						fileChooser.getSelectedFile().getPath()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
//	public byte[] extractBytes (String ImageName) throws IOException {
//		 // open image
//		 File imgPath = new File(ImageName);
//		 BufferedImage bufferedImage = ImageIO.read(imgPath);
//
//		 // get DataBufferBytes from Raster
//		 WritableRaster raster = bufferedImage .getRaster();
//		 DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
//
//		 return ( data.getData() );
//		}
	
}
