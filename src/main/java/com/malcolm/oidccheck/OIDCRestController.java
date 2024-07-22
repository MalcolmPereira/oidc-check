package com.malcolm.oidccheck;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;

import java.util.Date;
import java.util.List;

/**
 * Rest Controller for the OIDC Client application.
 * <p>
 * This class uses spring security that will display all the configured OIDC Applications and allows a user to go through the OIDC Flow
 *
 */
@RestController
public class OIDCRestController {

	/**
	 * The OAuth2RegistrationProperties object.
	 */
	private final OIDCRegistrationProperties oidcRegistrationProperties;

	/**
	 * The OAuth2AuthorizedClientService object.
	 */
	private final OAuth2AuthorizedClientService authorizedClientService;

	/**
	 * Constructor for REST Controller
 	 * @param authorizedClientService Authorized Client Service
	 * @param oidcRegistrationProperties Registration Properties
	 */
	public OIDCRestController(OAuth2AuthorizedClientService authorizedClientService,OIDCRegistrationProperties oidcRegistrationProperties) {
        this.authorizedClientService = authorizedClientService;
		this.oidcRegistrationProperties = oidcRegistrationProperties;
    }

	/**
	 * OIDC Login
	 * @param principal Principal
	 * @return String of OIDC Properties
	 */
	@GetMapping("/oidc-login")
	public String login(@AuthenticationPrincipal OAuth2User principal) {
		OAuth2AuthorizedClient client = null;
		List<String> clientRegistrationIds = this.oidcRegistrationProperties.getClientRegistrationIds();
		for ( String clientID : clientRegistrationIds ) {
			client = authorizedClientService.loadAuthorizedClient(clientID,principal.getName());
			if(client != null) {
				break;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		principal.getAttributes().forEach((k, v) -> stringBuilder.append( k ).append( ":" ).append( v ).append( "<br/>" ) );
	    if (client != null) {
            stringBuilder.append("Token: ").append(client.getAccessToken().getTokenValue()).append("<br/>");
			stringBuilder.append("Token Issued At: ").append(client.getAccessToken().getIssuedAt()).append("<br/>");
			stringBuilder.append("Token Expires At: ").append(client.getAccessToken().getExpiresAt()).append("<br/>");
			if (client.getRefreshToken() != null) {
                stringBuilder.append("Refresh Token: ").append(client.getRefreshToken().getTokenValue()).append("<br/>");
				stringBuilder.append("Refresh Token Issued At: ").append(client.getRefreshToken().getIssuedAt()).append("<br/>");
				stringBuilder.append("Refresh Token Expires At: ").append(client.getRefreshToken().getExpiresAt()).append("<br/>");
            }
		}

		stringBuilder.append("Test Date: ").append(new Date()).append("<br/>");


		return stringBuilder.toString();
	}
}
