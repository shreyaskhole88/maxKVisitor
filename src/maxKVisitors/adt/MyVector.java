/**
 * 
 */
package maxKVisitors.adt;

import java.util.List;
import java.util.Vector;

import maxKVisitors.util.Logger;
import maxKVisitors.visitor.Visitor;

/**
 * @author Shreyas
 * 
 */
public class MyVector implements ADTInterface {

	/*
	 * Vector as an adt
	 */
	private List<Integer> myVector = null;

	/*
	 * Logger
	 */
	private Logger logger = Logger.getLoggerInstance();
	
	/**
	 * Default constructor.
	 */
	public MyVector() {
		logger.log(1, MyVector.class.getSimpleName());
		myVector = new Vector<Integer>();
	}

	/**
	 * @return the myVector
	 */
	public List<Integer> getAdt() {
		return myVector;
	}

	/**
	 * @param myVector
	 *            the myVector to set
	 */
	public void setMyVector(Vector<Integer> myVector) {
		this.myVector = myVector;
	}

	/**
	 * Adds value to adt structure.
	 * 
	 * @param value
	 */
	@Override
	public void addInteger(int value) {
		myVector.add(value);
	}
	
	/**
	 * Returns size of adt.
	 * 
	 * @return
	 */
	@Override
	public int size() {
		return myVector.size();
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
			logger.log(2, myVector.get(i) + "\t");
		}
		logger.log(2, "\n");
	}

	/**
	 * Overridden toString method
	 */
	@Override
	public String toString() {
		return "Size of an adt: " + myVector.size();
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
