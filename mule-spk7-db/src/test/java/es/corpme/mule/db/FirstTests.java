package es.corpme.mule.db;

import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.api.client.OperationOptions;
import org.mule.tck.junit4.FunctionalTestCase;

public class FirstTests extends FunctionalTestCase {

	public static long TIMEOUT_SECS= 600l;
	
	public FirstTests() {
		//System.setProperty("mule.test.timeoutSecs",  Long.toString(TIMEOUT_SECS, 10));
		//System.setProperty("mule.verbose.exceptions", "true");
	}
	
	@Override
	protected String getConfigResources() { 
		return "mule-spk7-db.xml";
	}

	@Test
	public void test1() throws Exception {
		// runFlow(flowName, payload)
		// final MuleClient client= muleContext.getClient();
		final MuleClient client= muleContext.getClient();
		
		final MuleMessage message= new DefaultMuleMessage("", muleContext);
		
		
		final MuleMessage resultMessage= client.send("http://localhost:8081/testdb", message, new OperationOptions() {
			
			@Override
			public Long getResponseTimeout() {
				return TIMEOUT_SECS * 1000;
			}
		});
		
		System.out.println(resultMessage.getPayloadAsString());
	}
}
