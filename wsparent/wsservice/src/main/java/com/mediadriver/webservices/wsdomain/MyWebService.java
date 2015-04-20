package com.mediadriver.webservices.wsdomain;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.mediadriver.webservices.wsdomain.*;

@WebService
//@WebService(targetNamespace = "http://webservices.mediadrive.com/MyWebService", serviceName = "MyWebService", portName = "MyWebServicePort", wsdlLocation = "wsdl/MyWebService.wsdl")
public class MyWebService {

	@WebMethod
	public String echo(String message)
	{
		System.out.println( "message sent " + message );
		return "echoing " + message;
	}
	
	@WebMethod
	@RequestWrapper(className="com.mediadriver.webservices.wsdomain.MyMessage")
    @ResponseWrapper(className="java.lang.String")
	public String echoMyMessage(MyMessage myMessage)
	{
		System.out.println( "message sent " + myMessage.getMessage() );
		return "echoing " + myMessage.getId() + " : " + myMessage.getMessage();
	}	
}
