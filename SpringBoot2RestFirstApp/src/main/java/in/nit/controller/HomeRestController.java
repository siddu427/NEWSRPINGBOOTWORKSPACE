package in.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@GetMapping("/")
	public ResponseEntity<String> show() {
		String body="First Application!";
		ResponseEntity<String> resp =
				 new ResponseEntity<String>(body, HttpStatus.OK);
		return resp;
	}

}
