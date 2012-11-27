package edu.ncsu.csc574.module;

import java.util.HashMap;
import edu.ncsu.csc574.module.ICommandProcessor;
import edu.ncsu.csc574.module.IRequest;
import edu.ncsu.csc574.module.IRequestProcessor;
import edu.ncsu.csc574.module.IResponse;
import edu.ncsu.csc574.module.IUserContext;

public class BasicRequestProcessor implements IRequestProcessor {

	protected static IRequestProcessor instance = null;
	private HashMap<String, Class> commandLookUpTable;

	public BasicRequestProcessor() {
		commandLookUpTable = new HashMap<String, Class>();
	}

	/**
	 * Email processing logic
	 */
	@Override
	public IResponse process(IUserContext ctx, IRequest request)
			throws Exception {
		Class cmdProcessorClass = commandLookUpTable.get(request
				.getCommand());

		if (cmdProcessorClass == null) {
			System.out.println("No processor registered for command: "
					+ request.getCommand());
			// TODO: return default response
			return null;
		}

		ICommandProcessor cmd = (ICommandProcessor) cmdProcessorClass.newInstance();
		return cmd.process(ctx, request);
	}

	@Override
	public void registerCommand(String name, Class cmd) {
		commandLookUpTable.put(name, cmd);	
	}

	public static IRequestProcessor getInstance() {
		if (instance == null) {
			instance = new BasicRequestProcessor();
		}
		return instance;
	}

}
