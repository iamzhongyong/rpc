package event;

import com.google.common.eventbus.Subscribe;

public class SFEventListener {
	
	@Subscribe
	public void consign(SignEvent signEvent){
		if(signEvent.getCompanyName().equalsIgnoreCase("SF")){
			System.out.println("SF。。。开始发货");
			System.out.println(signEvent.getMessage());
		}
	}
	
	@Subscribe
	public void delivery(SignEvent signEvent){
		if(signEvent.getCompanyName().equalsIgnoreCase("SF")){
			System.out.println("SF。。。开始投递");
		}
	}

}
