package com.malcolm.oidccheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Main class for the OIDC Client application.
 * <p>
 * This class is the entry point for the OIDC Client application.
 * <p>
 * The application is a Spring Boot application and is configured to exclude the default error handling
 * provided by Spring Boot. This is because the application has its own error handling mechanism.
 * <p>
 * The application is also configured to scan the package com.malcolm.oidccheck for components.
 * <p>
 * The application is also configured to enable configuration properties.
 * <p>
 * The main method starts the Spring Boot application.
 *
 */
@SpringBootApplication(scanBasePackages = { "com.malcolm.oidccheck"}, exclude = { ErrorMvcAutoConfiguration.class })
@EnableConfigurationProperties
public class OIDCClientApp {

	/**
	 * Main method for the OIDC Client application.
	 * <p>
	 * This method starts the Spring Boot application.
	 *
	 * @param args The command line arguments.
	 */
	public static void main( String[] args ) {
		SpringApplication.run(OIDCClientApp.class, args);
	}
}