package com.mulesoft.cxf;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class ServiceCallable implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		return new ReturnType();
	}
}
