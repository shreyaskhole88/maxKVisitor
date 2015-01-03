/**
 * 
 */
package maxKVisitors.adt;

import java.util.List;

import maxKVisitors.visitor.Visitor;

/**
 * @author Shreyas
 *
 */
public interface ADTInterface {
	
	/**
	 * Returns adt.
	 * 
	 * @return
	 */
	public List<Integer> getAdt();
	
	/**
	 * Adds value to adt structure.
	 * 
	 * @param value
	 */
	public void addInteger(final int value);
	
	/**
	 * Calls visitor to perform user defined task.
	 * 
	 * @param visitor
	 */
	public void accept(final Visitor visitor);
	
	/**
	 * Returns size of adt.
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * Display adt contents.
	 */
	public void display(final int count);
}
