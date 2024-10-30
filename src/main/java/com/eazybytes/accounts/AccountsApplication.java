package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // ENABLES AUDITING OF APP WITH HELP OF AUDITING COMPONENT
@OpenAPIDefinition(
		info =@Info(
				title = "Accounts microservice REST API Documentation",
				description = "EazyBank Accounts ms REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Shubham Kumar",
						email = "abc@xyz.com",
						url = "www.google.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "www.google.com"
				)
			),
		externalDocs = @ExternalDocumentation(
				description = "Descripyion for Accounts MS",
				url = "https://springdoc.org/#getting-started"
		)
		)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
