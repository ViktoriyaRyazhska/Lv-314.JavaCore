import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadFiles {

	public static byte[] readImg() throws IOException {
		
		File fnew=new File("/home/leo_smb/img.jpg");
		BufferedImage originalImage=ImageIO.read(fnew);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos );
		byte[] imageInByte=baos.toByteArray();
		return imageInByte;
		
	}
	
}
