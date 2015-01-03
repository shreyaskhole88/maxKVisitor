/**
 * 
 */
package maxKVisitors.util;

/**
 * @author Shreyas
 *
 */
public class Logger {
	
	/*
	 * Logger
	 */
	private static Logger logger = null;
	
	/*
	 * Debug value
	 */
	public static int DEBUG_VALUE = 0;
	
	/**
	 * Private constructor for singleton
	 */
	private Logger(){
		
	}
	
	/**
	 * Static method for returning logger instance.
	 * 
	 * @return
	 */
	public static Logger getLoggerInstance(){
		if(logger == null){
			logger = new Logger();
		}
		return logger;
	}
	
	/**
	 * Logging scheme.
	 * 
	 * @param debugValue
	 * @param message
	 */
	public void log(final int debugValue, final String message){
		if(DEBUG_VALUE == debugValue && DEBUG_VALUE == 1){
			System.out.println("Constructor:" + message);
		} else if(DEBUG_VALUE == debugValue && DEBUG_VALUE == 2){
			System.out.print(message);
		} else if (DEBUG_VALUE == debugValue && DEBUG_VALUE == 0) {
			
		}
	}
}
