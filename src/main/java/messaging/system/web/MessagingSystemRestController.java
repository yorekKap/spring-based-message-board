package messaging.system.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import messaging.system.domain.Message;

@RestController
public class MessagingSystemRestController {

	List<Message> messages = new ArrayList<>();
	
	@RequestMapping(path = "/getMessages", method = RequestMethod.GET)
	public ResponseEntity<List<Message>> getMessages(){
		
		System.out.println("getMessages is called");
	
		if(messages.isEmpty())
			return new ResponseEntity<List<Message>>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Message>>(messages, HttpStatus.OK);
	}
	
	
	@RequestMapping(path = "/addMessage", method = RequestMethod.POST)
	public ResponseEntity<Void> addMessage(@RequestBody Message message){
		System.out.println("addMessage is called");
		messages.add(0, message);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	
}
