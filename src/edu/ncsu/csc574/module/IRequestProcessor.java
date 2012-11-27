package edu.ncsu.csc574.module;


/**
 * This interface validates and processes request
 * @author Harsha
 *
 */
public interface IRequestProcessor {
	
	/**
	 * Why: ClientHandler.handle invokes this method
	 * This method validates request and forwards them to appropriate module. 
	 * Check if ctx is in valid state to process given request.
	 * Look up for command processor class for this command.
	 * Create an object of that class and invoke that command
	 * call cmd.process(IRequest)
	 * return IResponse
	 * @param request
	 * @return
	 */
	public IResponse process(IUserContext ctx, IRequest request) throws Exception;
	
	
	/**
	 * Why: modules supporting commands should invoke this with appropriate call back class
	 * This method registers commands with call back function.
	 * @param name
	 * @param cmd
	 */
	public void registerCommand(String cmd, Class cmdProcessor);
	
}
