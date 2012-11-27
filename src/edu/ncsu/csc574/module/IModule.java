package edu.ncsu.csc574.module;

public interface IModule {
	public IRequestProcessor getRequestProcessorInstance();
	public String getName();
}
