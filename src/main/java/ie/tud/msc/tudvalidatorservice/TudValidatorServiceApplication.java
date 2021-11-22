package ie.tud.msc.tudvalidatorservice;

import ie.tud.msc.tudvalidatorservice.dto.TudEmployee;
import ie.tud.msc.tudvalidatorservice.dto.ValidatorResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Function;

@SpringBootApplication
public class TudValidatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TudValidatorServiceApplication.class, args);
	}

	@Bean
	public Function<TudEmployee, ValidatorResponse> reverseString() {

		return tudEmployee -> {
			ValidatorResponse validatorResponse = new ValidatorResponse();
			validatorResponse.setMessage("Hello " + tudEmployee.getName());
			return validatorResponse;

		};

	}

}
