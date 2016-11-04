package messaging.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {

		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
	
	}
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		System.out.println("asdfasdfsasadfasdf");
		registry.addEndpoint("/gs-guide-websocket").withSockJS();
		
	}
	
	
}
