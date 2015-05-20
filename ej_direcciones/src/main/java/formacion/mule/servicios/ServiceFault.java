package formacion.mule.servicios;

import javax.xml.ws.WebFault;

@WebFault
public class ServiceFault extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -857604944372296187L;

	public ServiceFault() {
		super();
	}

	public ServiceFault(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceFault(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceFault(String message) {
		super(message);
	}

	public ServiceFault(Throwable cause) {
		super(cause);
	}

}
