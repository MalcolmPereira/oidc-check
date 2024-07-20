package com.malcolm.oidccheck;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class is used to read the configuration properties from the application.yml file.
 * The properties are read into a map of OIDCClientRegistrationProperties objects.
 * The map is keyed by the client registration id.
 */
@Component
@ConfigurationProperties(prefix = "spring.security.oauth2.client")
public class OIDCRegistrationProperties {

	/**
	 * The map of client registration properties.
	 */
	private Map<String, OIDCClientRegistrationProperties> registration;

	/**
	 * Get the map of client registration properties.
	 * @return the map of client registration properties.
	 */
	public Map< String, OIDCClientRegistrationProperties > getRegistration() {
		return registration;
	}

	/**
	 * Set the map of client registration properties.
	 * @param registration the map of client registration properties.
	 */
	public void setRegistration( Map< String, OIDCClientRegistrationProperties > registration ) {

		this.registration = registration;
	}

	/**
	 * Get the list of client registration ids.
	 * @return the list of client registration ids.
	 */
	public List< String > getClientRegistrationIds() {
		return this.getRegistration().values().stream().map( OIDCClientRegistrationProperties::getIdpName ).collect( Collectors.toList() );
	}
}
