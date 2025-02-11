package com.kitchenmate.auth.KitchenMateAuth;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@SecurityScheme(
		name = "Keycloak"
		, openIdConnectUrl = "${authServerUrl}/realms/${realm}/.well-known/openid-configuration"
		, scheme = "bearer"
		, type = SecuritySchemeType.OPENIDCONNECT
		, in = SecuritySchemeIn.HEADER
)

public class KitchenMateAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(KitchenMateAuthApplication.class, args);
	}
}
