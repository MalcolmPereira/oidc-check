package com.malcolm.oidccheck;

/**
 * This class is used to hold the properties that are used to register a client with an Identity Provider.
 * The properties are read from the application.properties file.
 */
public class OIDCClientRegistrationProperties {

	/**
	 * The name of the Identity Provider.
	 */
	private String idpName;

	/**
	 * The name of the client.
	 */
	private String clientName;

	/**
	 * The client id.
	 */
	private String clientId;

	/**
	 * The client secret.
	 */
	private String clientSecret;

	/**
	 * Authorization Grant Type
	 */
	private String authorizationGrantType;

	/**
	 * Client Authentication Method
	 */
	private String  clientAuthenticationMethod;

	/**
	 * The redirect URI.
	 */
	private String redirectUri;

	/**
	 * The scope.
	 */
	private String scope;

	/**
	 * Get the name of the Identity Provider.
	 * @return IDP Name
	 */
	public String getIdpName() {

		return idpName;
	}

	/**
	 * Set the name of the Identity Provider.
	 * @param idpName IDP Name
	 */
	public void setIdpName( String idpName ) {

		this.idpName = idpName;
	}

	/**
	 * Get the name of the client.
	 * @return clientName
	 */
	public String getClientName() {

		return clientName;
	}

	/**
	 * Set the name of the client.
	 * @param clientName Client Name
	 */
	public void setClientName( String clientName ) {

		this.clientName = clientName;
	}

	/**
	 * Get the client id.
	 * @return clientId
	 */
	public String getClientId() {

		return clientId;
	}

	/**
	 * Set the client id.
	 * @param clientId Client Id
	 */
	public void setClientId( String clientId ) {

		this.clientId = clientId;
	}

	/**
	 * Get the client secret.
	 * @return clientSecret
	 */
	public String getClientSecret() {

		return clientSecret;
	}

	/**
	 * Set the client secret.
	 * @param clientSecret Client Secret
	 */
	public void setClientSecret( String clientSecret ) {

		this.clientSecret = clientSecret;
	}

	/**
	 * Get Authorization Grant Type
	 * @return authorizationGrantType Authorization Grant Type
	 */
	public String getAuthorizationGrantType() {
		return authorizationGrantType;
	}

	/**
	 * Set Authorization Grant Type
	 * @param authorizationGrantType  Authorization Grant Type
	 */
	public void setAuthorizationGrantType(final String authorizationGrantType) {
		this.authorizationGrantType = authorizationGrantType;
	}

	/**
	 * Get Client Authentication Method
	 * @return clientAuthenticationMethod Client Authentication Method
	 */
	public String getClientAuthenticationMethod() {
		return clientAuthenticationMethod;
	}

	/**
	 * Set Client Authentication Method
	 * @param clientAuthenticationMethod Client Authentication Method
	 */
	public void setClientAuthenticationMethod(final String clientAuthenticationMethod) {
		this.clientAuthenticationMethod = clientAuthenticationMethod;
	}

	/**
	 * Get the redirect URI.
	 * @return redirectUri
	 */
	public String getRedirectUri() {

		return redirectUri;
	}

	/**
	 * Set the redirect URI.
	 * @param redirectUri Redirect URI
	 */
	public void setRedirectUri( String redirectUri ) {

		this.redirectUri = redirectUri;
	}

	/**
	 * Get the scope.
	 * @return scope
	 */
	public String getScope() {

		return scope;
	}

	/**
	 * Set the scope.
	 * @param scope Scope
	 */
	public void setScope( String scope ) {

		this.scope = scope;
	}
}
