package rpc.cxf.java;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ServiceConsumeClient {
	public static void main(String[] args) throws Exception{
		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(HelloWorldService.class);
        svr.setAddress(ServiceProvider.SERVICE_ADDRESS);
        HelloWorldService hw = (HelloWorldService) svr.create();
       
        String name = hw.getNameById(110);
        
        System.out.println(name);
	}

}
