package formacion.mule.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOUtil {
	
	public static String isToString(final InputStream is) throws IOException {
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int n;
		final byte[] buffer = new byte[1024];
		while ( (n=is.read(buffer, 0, 1024))>0 ) {
			baos.write(buffer, 0, n);
		}
		return new String(baos.toByteArray(), "UTF-8");
	}

}
