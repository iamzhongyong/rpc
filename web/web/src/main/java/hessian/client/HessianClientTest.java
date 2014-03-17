package hessian.client;

import hessian.HessianDemoService;
import com.caucho.hessian.client.HessianProxyFactory;


public class HessianClientTest {
	
	public static final String SERVICE_URL = "http://localhost/demo/helloService";

	public static void main(String[] args) throws Exception{
		System.out.println("start run hessian service...");
		HessianProxyFactory factory = new HessianProxyFactory();
		HessianDemoService demoService = (HessianDemoService)factory.create(SERVICE_URL);
		String name = demoService.getNamesByType();
		System.out.println(name);
		
	}

}
