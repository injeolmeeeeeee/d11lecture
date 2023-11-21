package sg.edu.nus.iss.d11lecture;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D11lectureApplication {
	//References:
	// ./mvwn spring-boot:run -Dspring-boot.run.arguments="--port=4000"
	// ./mvwn spring-boot:run -Dspring-boot.run.arguments="--port=5000"

	public static void main(String[] args) {
		// SpringApplication.run(D11lectureApplication.class, args);

		SpringApplication app = new SpringApplication(D11lectureApplication.class);
		
		String port = "8080";
		ApplicationArguments argOptions = new DefaultApplicationArguments(args);

		if (argOptions.containsOption("port")) {
			port = argOptions.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

		System.out.println("my first SpringBoot application started");
	}

}
