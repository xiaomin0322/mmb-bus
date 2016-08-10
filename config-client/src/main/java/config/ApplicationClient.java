package config;

import org.hibernate.validator.internal.constraintvalidators.hv.ParameterScriptAssertValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hzhubin15 on 2016/8/10.
 */
@SpringBootApplication
public class ApplicationClient {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationClient.class,args);
	}
}
