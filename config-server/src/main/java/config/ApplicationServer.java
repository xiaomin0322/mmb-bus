package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by hzhubin15 on 2016/8/10.
 */
@EnableConfigServer
@SpringBootApplication
public class ApplicationServer {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer.class, args);
	}
}
