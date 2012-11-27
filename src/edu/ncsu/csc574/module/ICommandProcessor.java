package edu.ncsu.csc574.module;



/**
 * Module supporting commands should implement this interface for each
 * type of command.
 * For eg: User Manager module should implement Login, Logout, create, delete, forgot commnads.
 * @author Harsha
 *
 */
public interface ICommandProcessor {
	/**
	 * Implement business logic for that command
	 * @param request
	 * @return
	 */
	public IResponse process(IUserContext ctx, IRequest request);
}

