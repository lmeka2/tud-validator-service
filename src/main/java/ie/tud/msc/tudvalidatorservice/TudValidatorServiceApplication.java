package ie.tud.msc.tudvalidatorservice;

import ie.tud.msc.tudvalidatorservice.dto.TudEmployee;
import ie.tud.msc.tudvalidatorservice.dto.ValidatorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
@Slf4j
public class TudValidatorServiceApplication {


	public static void main(String[] args) {
		FunctionalSpringApplication.run(TudValidatorServiceApplication.class, args);
	}


	public void eventProducer(ValidatorResponse validatorResponse) {

			Message<String> o = MessageBuilder
					.withPayload(validatorResponse.getMessage())
					.build();
	}


	@Bean
	public Function<TudEmployee, ValidatorResponse> reverseString() {
		return (tudEmployee) -> {

			ValidatorResponse validatorResponse = new ValidatorResponse();
			validatorResponse.setMessage("Hello "+ tudEmployee.getName());
			this.eventProducer(validatorResponse);
			return validatorResponse;
		};
	}

}
