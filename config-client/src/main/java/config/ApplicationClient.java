package config;

import org.hibernate.validator.internal.constraintvalidators.hv.ParameterScriptAssertValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by hzhubin15 on 2016/8/10.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ApplicationClient {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationClient.class,args);
	}
}
