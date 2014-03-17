package hessian.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HessianClient {
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("hessian-spring-client.xml");
		
		DemoSpringHessianService demoService = (DemoSpringHessianService)context.getBean("demoService");
		
		
		String str = demoService.getNameById(100);
		
		System.out.println(str);
	}

}
