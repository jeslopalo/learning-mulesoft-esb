package formacion.mule;

import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.api.client.OperationOptions;
import org.mule.tck.junit4.FunctionalTestCase;

import formacion.mule.util.IOUtil;

public class TestGetPaises extends FunctionalTestCase {
	
	public final static long TIMEOUT_SECS = 600; 

	public TestGetPaises() {
		System.setProperty("mule.test.timeoutSecs", Long.toString(TIMEOUT_SECS, 10));
		System.setProperty("mule.verbose.exceptions", "true");
	}

	@Override
	protected String getConfigResources() {
		return "ej_clientes.xml,ej_direcciones.xml";
	}
	
	@Test
	public void testsGetPaises_0_10() throws Exception {
		
		final MuleClient cli = muleContext.getClient();
		final MuleMessage mm = cli.send("http://localhost:8081/cliente/pais?numPagina=0&tamPagina=10", 
				new DefaultMuleMessage(null, muleContext), 
				new OperationOptions() {
			@Override
			public Long getResponseTimeout() {
				return TIMEOUT_SECS*1000;
			}
		});
		final String resp = IOUtil.isToString((InputStream)mm.getPayload());
		System.out.println(resp);
		Assert.assertTrue("Total no válido!", resp.indexOf(",\"total\":249,")>0);
	}
	
}
