package rpc.cxf.java;


import javax.xml.ws.Endpoint;

public class ServiceProvider {
	
	public static final String SERVICE_ADDRESS = "http://localhost:8099/helloWorldService";
	
	public static void main(String[] args)  throws Exception{
		   System.out.println("web service start");
           HelloWorldService implementor= new HelloWorldServiceImpl();
           Endpoint.publish(SERVICE_ADDRESS, implementor);
           System.out.println("web service started");
           Thread.sleep(50000);
           
	}
}
