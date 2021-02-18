package cl.seadragon.rsyslogclient;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		Logger logger = (Logger) LoggerFactory.getLogger("seadragon-system");

		logger.info("Initializing Spring Boot Application.");
		SpringApplication.run(WebApplication.class, args);
	}

}
