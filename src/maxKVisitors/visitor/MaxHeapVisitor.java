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
public class MaxHeapVisitor implements Visitor {

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
	public MaxHeapVisitor(int size) {
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
	 * Visit method to find out first K elements using heap sort.
	 * 
	 * @param adt
	 */
	@Override
	public void visit(final ADTInterface adt) {
		logger.log(2, "Heap Sort for "
				+ adt.getClass().getSimpleName() + "\n");
		adt.display(adt.size());
		int k = count;
		if(k >= adt.size()){
			k = adt.size();
		}
		heapify(adt);
		int n = adt.size() - 1;
		logger.log(2, "Largest 'First K' Elements:\n");
		for (int i = n; k >= 1; i--, k--) {
			logger.log(2, adt.getAdt().get(0) + "\t");
            swap(adt,0, i);
            n = n - 1;
            createMaxHeap(adt, 0, n);
        }
		logger.log(2, "\n");
	}

	/**
	 * Heapify adt.
	 * 
	 * @param adt
	 */
	private void heapify(final ADTInterface adt){
		int n = adt.size() - 1;
		for(int i = n/2; i >= 0; i--){
			createMaxHeap(adt, i, n);
		}
	}
	
	/**
	 * create max heap.
	 * 
	 * @param adt
	 * @param i
	 * @param n
	 */
	private void createMaxHeap(final ADTInterface adt, final int i, final int n){
		int left = 2*i;
		int right = left + 1;
		int max = i;
		if(left <= n && adt.getAdt().get(left) > adt.getAdt().get(i)){
			max = left;
		} 
		if(right <= n && adt.getAdt().get(right) > adt.getAdt().get(max)){
			max = right;
		}
		
		if(max != i){
			swap(adt, i, max);
			createMaxHeap(adt, max, n);
		}
	}
	
	/**
	 * Swap integers in adt.
	 * 
	 * @param adt
	 * @param i
	 * @param j
	 */
	private void swap(final ADTInterface adt, final int i, final int j){
		int temp = adt.getAdt().get(i);
		adt.getAdt().set(i, adt.getAdt().get(j));
		adt.getAdt().set(j, temp);
	}
}
