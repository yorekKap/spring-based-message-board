package messaging.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
@ComponentScan(basePackages = "messaging.system", excludeFilters = {
				@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig extends WebMvcConfigurerAdapter {

	  	@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	
	    	registry
	    		.addResourceHandler("/resources/**")
	    		.addResourceLocations("/WEB-INF/static/")
	    		.setCachePeriod(3600)
	    		.resourceChain(true)
	    		.addResolver(new PathResourceResolver());
	    	
	    }
	
}
	