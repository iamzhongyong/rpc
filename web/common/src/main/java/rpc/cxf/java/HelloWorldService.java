package rpc.cxf.java;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface HelloWorldService {
	
	public String getNameById(long id);

	public List<String> getNamesByType(long type);
}
