package rpc.cxf.java;

import java.util.List;

import javax.jws.WebService;

import user.UserDO;

@WebService
public interface HelloWorldService {
	
	public String getNameById(long id);

	public List<String> getNamesByType(long type);
	
	public List<UserDO> getAllUserInfo();
}
