package edu.ncsu.csc574.module;

import java.util.HashMap;

public interface IRequest {
	public String getCommand();
	public HashMap<String, String> getHeaders();
	public byte[] getBody();
	
	public String getRawRequest();
}
