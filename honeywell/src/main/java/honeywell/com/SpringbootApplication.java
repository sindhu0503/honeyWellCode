package honeywell.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("honeywell.com")
@EnableAutoConfiguration
@SpringBootApplication  
@PropertySource("classpath:application.properties")
public class SpringbootApplication {
	 
	
	 public static void main(String[] args) {
	        SpringApplication.run(SpringbootApplication.class, args);
	    }
	    
}
