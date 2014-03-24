import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.nsoft.utils.JpegReader;


public class CMYK2RGBConverter extends Thread {
	
	private static final String srcDirPath = System.getProperty("user.dir") + "/cmyk";
	private static final String dstDirPath = System.getProperty("user.dir") + "/rgb";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int count;
		File srcDir = new File(srcDirPath);
		File dstDir = new File(dstDirPath);
		if (!dstDir.exists())
			dstDir.mkdirs();
		
		File[] f = srcDir.listFiles();
		for (int i=0; i<f.length; i++)
		if (f[i].getName().contains(".jpg") || f[i].getName().contains(".jpeg")){
			System.out.println(f[i].getName());
			try {

				JpegReader jpgReader = new JpegReader();

				BufferedImage bufferedImage = jpgReader.readImage(f[i]);

				ImageIO.write(bufferedImage, "jpg", new File(dstDir+"/"+f[i].getName()));

				//            Utils.slog("Converted JPEG file: " + (i++));

			} catch (Exception e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}
		}
	}
	
	public static void main(String args[]){
		new CMYK2RGBConverter().start();
	}
}
