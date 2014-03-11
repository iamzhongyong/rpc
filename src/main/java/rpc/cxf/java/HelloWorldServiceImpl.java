package rpc.cxf.java;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


@WebService(endpointInterface="rpc.cxf.java.HelloWorldService",serviceName="helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getNameById(long id) {
		return "iamzhongyong";
	}

	@Override
	public List<String> getNamesByType(long type) {
		List<String> names = new ArrayList<String>();
		names.add("iamzhongyong");
		names.add("bixiao.zy");
		return names;
	}
	
	

}
