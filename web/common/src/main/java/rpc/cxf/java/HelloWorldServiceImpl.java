package rpc.cxf.java;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import user.UserDO;


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

	@Override
	public List<UserDO> getAllUserInfo() {
		List<UserDO> rs = new ArrayList<UserDO>();
		for(int i=0 ; i<30 ; i++){
			UserDO user = new UserDO();
			user.name("iamzhongyong").sex(i).email("iamzhongyong@126.com").password("iafsdf");
			rs.add(user);
		}
		return rs;
	}
	
	
	

}
