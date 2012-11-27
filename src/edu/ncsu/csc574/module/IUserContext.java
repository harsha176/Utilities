package edu.ncsu.csc574.module;

/**
 * This interface captures users context like username, state, ip and # of failed attempts
 * @author Harsha
 *
 */
public interface IUserContext {
	public String getUsername();
	
	public String getDomainName();
	
	public boolean isLoggedIn();
	
	public String getIPAddress();
}
