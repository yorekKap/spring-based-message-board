package messaging.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	static final String messageBoard = "message-board";
	static final String notificationSystem = "notification-system";
	
	@RequestMapping(path = "/message-board")
	public String getMessageBoard(){
		return messageBoard;
	}
	
	@RequestMapping(path = "/notification-system")
	public String getNotificationSystem(){
		
		return notificationSystem;
		
	}
	
}
