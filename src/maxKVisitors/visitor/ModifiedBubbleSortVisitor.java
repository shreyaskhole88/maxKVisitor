/**
 * 
 */
package maxKVisitors.visitor;

import maxKVisitors.adt.ADTInterface;
import maxKVisitors.util.Logger;

/**
 * @author Shreyas
 * 
 */
public class ModifiedBubbleSortVisitor implements Visitor {

	/*
	 * largest K elements
	 */
	private int count = 0;

	/*
	 * Logger
	 */
	private Logger logger = Logger.getLoggerInstance();

	/**
	 * Constructor using fields
	 * 
	 * @param largestElemSize
	 */
	public ModifiedBubbleSortVisitor(int size) {
		logger.log(1, getClass().getSimpleName());
		this.count = size;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Visit method to find out first K elements
	 * 
	 * @param adt
	 */
	@Override
	public void visit(ADTInterface adt) {
		logger.log(2, "Modified Bubble Sort for "
				+ adt.getClass().getSimpleName() + "\n");
		adt.display(adt.size());
		int k = count;
		if(k >= adt.size()){
			k = adt.size();
		}
		int temp;
		for (int i = 0; i < k; i++) {
			for (int j = adt.size() - 1; j > i; j--) {
				if (adt.getAdt().get(j) > adt.getAdt().get(j - 1)) {
					temp = adt.getAdt().get(j);
					adt.getAdt().set(j, adt.getAdt().get(j - 1));
					adt.getAdt().set(j - 1, temp);
				}
			}
		}
		logger.log(2, "Largest 'First K' Elements:\n");
		adt.display(k);
	}
}
