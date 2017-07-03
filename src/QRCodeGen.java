import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGen {

	public static void main(String[] args) throws Exception {
		String details = "Hi, this is Ujjawal. I live in Hyd.";
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG)
				.stream();
		File file = new File("C:\\Users\\cbit10\\Desktop\\QRCode.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(out.toByteArray());
		fos.flush();
		fos.close();
		System.out.println("QRCode successfully generated.....");

	}

}
