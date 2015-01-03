/**
 * 
 */
package maxKVisitors.visitor;

import maxKVisitors.adt.ADTInterface;
import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.Logger;

/**
 * @author Shreyas
 *
 */
public class PopulateAdtVisitor implements Visitor {

	/*
	 * File processor
	 */
	private String fileName = null;
	
	/*
	 * Logger
	 */
	private Logger logger = Logger.getLoggerInstance();
	
	/**
	 * @param fileProcessor
	 */
	public PopulateAdtVisitor(final String fileName) {
		logger.log(1, getClass().getSimpleName());
		this.fileName = fileName;
	}
	
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Visit method to populate an adt.
	 * 
	 * @param adt
	 */
	@Override
	public void visit(ADTInterface adt) {
		FileProcessor fileProcessor = new FileProcessor(fileName);
		Integer value = null;
		while((value = fileProcessor.nextInt()) != null) {
			adt.addInteger(value);
		}
	}
}
