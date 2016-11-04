package messaging.system.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import messaging.system.domain.Notification;

@Controller
public class NewUserNotifierController {

	@MessageMapping("/notifyClients")
	@SendTo("/topic/notifications")
	public Notification notifyClients(){

		System.out.println();;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Notification("The new user appeared in the system");
		
	}
	
	
}
