package event;

import com.google.common.eventbus.Subscribe;

public class YTOEventListener {
	
	@Subscribe
	public void consign(SignEvent signEvent){
		if(signEvent.getCompanyName().equalsIgnoreCase("YTO")){
			System.out.println("YTO��������ʼ����");
			System.out.println(signEvent.getMessage());
		}
	}
	
	@Subscribe
	public void delivery(SignEvent signEvent){
		if(signEvent.getCompanyName().equalsIgnoreCase("YTO")){
			System.out.println("YTO��������ʼͶ��");
		}
	}

}
