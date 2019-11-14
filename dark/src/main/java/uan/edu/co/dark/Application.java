package uan.edu.co.dark;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder
			application) {
	return application.sources(Application.class);
	}
	
    public static void main( String[] args )
    {	    	
    	SpringApplication.run(Application.class, args);    	   	
    }
}
