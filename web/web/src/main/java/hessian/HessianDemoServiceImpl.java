package hessian;

import java.util.ArrayList;
import java.util.List;

import user.UserDO;

public class HessianDemoServiceImpl implements HessianDemoService {

	@Override
	public String getNamesByType() {
		return "iamzhongyong" ;
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
