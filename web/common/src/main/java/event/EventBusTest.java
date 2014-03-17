package event;

import java.util.Date;

import com.google.common.eventbus.EventBus;

public class EventBusTest {

	public static void main(String[] args) {
		EventBus bus = new EventBus("iamzhongyong");
		
		SFEventListener sf = new SFEventListener();
		YTOEventListener yto = new YTOEventListener();
		bus.register(sf);
		bus.register(yto);
		
		
		SignEvent sign1 = new SignEvent("SF","±ÈÐÜ°¡",new Date());
		bus.post(sign1);
		
		SignEvent sign2 = new SignEvent("YTO","ÄãÃÃµÄ",new Date());
		bus.post(sign2);
		
		
		
	}
}
