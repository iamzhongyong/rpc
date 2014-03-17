package hessian.spring.demo;

public class DemoSpringHessianSerivceImpl implements DemoSpringHessianService {

	@Override
	public String getNameById(long id) {
		return "iamzhongyong,welcome to wms system";
	}
	
	public void init(){
		System.out.println("≥ı ºªØ°£°£°£°£");
	}
}
