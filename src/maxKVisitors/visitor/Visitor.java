/**
 * 
 */
package maxKVisitors.visitor;

import maxKVisitors.adt.ADTInterface;

/**
 * @author Shreyas
 *
 */
public interface Visitor {

	/**
	 * Visit method
	 * 
	 * @param adt
	 */
	public void visit(final ADTInterface adt);
}
