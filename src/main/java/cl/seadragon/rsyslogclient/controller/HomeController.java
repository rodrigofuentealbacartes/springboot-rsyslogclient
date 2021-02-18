package cl.seadragon.rsyslogclient.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> indexAction() {
		Logger logger = (Logger) LoggerFactory.getLogger("seadragon-system");

		logger.warn("Request received.");
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	
}
