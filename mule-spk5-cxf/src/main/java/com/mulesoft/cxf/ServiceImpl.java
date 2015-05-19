package com.mulesoft.cxf;

public class ServiceImpl implements Service {

	@Override
	public ReturnType method(Integer i, String a) { 
		return new ReturnType();
	}

}
