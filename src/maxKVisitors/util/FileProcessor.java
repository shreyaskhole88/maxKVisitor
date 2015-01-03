/**
 * 
 */
package maxKVisitors.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Shreyas
 * 
 */
public class FileProcessor {

	/*
	 * File Name
	 */
	private String fileName = null;

	/*
	 * Buffered Reader
	 */
	private BufferedReader bufferedReader = null;
	
	/*
	 * Logger
	 */
	private Logger logger = Logger.getLoggerInstance();

	/**
	 * @param fileName
	 */
	public FileProcessor(final String fileName) {
		logger.log(1, getClass().getSimpleName());
		this.fileName = fileName;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.err
					.println("FileProcessor:FileProcessor():FileNotFoundException");
			System.exit(1);
		} finally {

		}
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
	 * @return the bufferedReader
	 */
	public BufferedReader getBufferedReader() {
		return bufferedReader;
	}

	/**
	 * @param bufferedReader the bufferedReader to set
	 */
	public void setBufferedReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	/**
	 * Read next integer from file.
	 * 
	 * @return
	 */
	public Integer nextInt() {
		Integer value = null;
		String readLine = null;
		try {
			readLine = bufferedReader.readLine();
			if(readLine != null){
				value = Integer.parseInt(readLine);
			}
		} catch (NumberFormatException e) {
			System.err
					.println("FileProcessor.nextInt():NumberFormatException");
			System.exit(1);
		} catch (IOException e) {
			System.err
					.println("FileProcessor.nextInt():IOException");
			System.exit(1);
		} finally {

		}
		return value;
	}

}
