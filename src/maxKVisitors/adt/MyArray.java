/**
 * 
 */
package maxKVisitors.adt;

import java.util.ArrayList;
import java.util.List;

import maxKVisitors.util.Logger;
import maxKVisitors.visitor.Visitor;

/**
 * @author Shreyas
 * 
 */
public class MyArray implements ADTInterface {

	/*
	 * Array as an adt
	 */
	private List<Integer> myArray = null;
	
	/*
	 * Logger
	 */
	private Logger logger = Logger.getLoggerInstance();

	/**
	 * Default constructor
	 */
	public MyArray() {
		logger.log(1, MyArray.class.getSimpleName());
		myArray = new ArrayList<Integer>();
	}

	/**
	 * @return the myArray
	 */
	public List<Integer> getAdt() {
		return myArray;
	}

	/**
	 * @param myArray
	 *            the myArray to set
	 */
	public void setMyArray(List<Integer> myArray) {
		this.myArray = myArray;
	}

	/**
	 * Adds value to adt structure.
	 * 
	 * @param value
	 */
	@Override
	public void addInteger(int value) {
		myArray.add(value);
	}
	
	/**
	 * Returns size of adt.
	 * 
	 * @return
	 */
	@Override
	public int size() {
		return myArray.size();
	}

	/**
	 * Calls visitor to perform user defined task.
	 * 
	 * @param visitor
	 */
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}
	
	/**
	 * Display adt contents.
	 */
	@Override
	public void display(final int count) {
		for(int i = 0; i < count; i++){
			logger.log(2, myArray.get(i) + "\t");
		}
		logger.log(2, "\n");
	}

	/**
	 * Overridden toString method
	 */
	@Override
	public String toString() {
		return "Size of an adt: " + myArray.size();
	}

	/**
	 * Overridden hashCode method
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/**
	 * Overridden equals method
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
