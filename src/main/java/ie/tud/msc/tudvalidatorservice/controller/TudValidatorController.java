package ie.tud.msc.tudvalidatorservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.tud.msc.tudvalidatorservice.dto.ValidatorResponse;

@RestController
@RequestMapping("/validator")
public class TudValidatorController {
	
	@GetMapping("/ping")
    public ResponseEntity<ValidatorResponse> getBook() {
		ValidatorResponse validatorResponse = new ValidatorResponse();
		validatorResponse.setMessage("Hello World");
        return ResponseEntity.ok().body(validatorResponse);
    }

}
