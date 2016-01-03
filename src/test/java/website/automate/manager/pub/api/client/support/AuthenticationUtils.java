package website.automate.manager.pub.api.client.support;

import website.automate.manager.pub.api.client.model.Authentication;

public final class AuthenticationUtils {

	private static Authentication DEFAULT = Authentication.of("test@automate.website", "secr3t");
	
	private AuthenticationUtils(){
		throw new AssertionError();
	}
	
	public static Authentication getIntegrationTestAccountPrincipal(){
		return DEFAULT;
	}
}
