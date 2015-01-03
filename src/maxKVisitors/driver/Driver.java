/**
 * 
 */
package maxKVisitors.driver;

import maxKVisitors.adt.ADTInterface;
import maxKVisitors.adt.MyArray;
import maxKVisitors.adt.MyVector;
import maxKVisitors.util.Logger;
import maxKVisitors.visitor.MaxHeapVisitor;
import maxKVisitors.visitor.ModifiedBubbleSortVisitor;
import maxKVisitors.visitor.PopulateAdtVisitor;
import maxKVisitors.visitor.Visitor;

/**
 * @author Shreyas
 * 
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 3) {
			String fileName = args[0];
			Integer size = null;
			Integer debugValue = null;
			try {
				size = Integer.parseInt(args[1]);
				if(size <= 0){
					System.err.println("Driver.main().'k <= 0'");
					System.exit(1);
				}
				debugValue = Integer.parseInt(args[2]);
				if(debugValue < 0 || debugValue > 2) {
					System.err.println("Driver.main().InvalidDebugValue");
					System.exit(1);
				}
				Logger.DEBUG_VALUE = debugValue;
			} catch (NumberFormatException e) {
				System.err.println("Driver.main().NumberFormatException");
				System.exit(1);
			} finally {

			}
			// ADT instances
			ADTInterface myVector1 = new MyVector();
			ADTInterface myVector2 = new MyVector();
			ADTInterface myArray1 = new MyArray();
			ADTInterface myArray2 = new MyArray();
			// Populate ADTs
			Visitor populateAdt = new PopulateAdtVisitor(fileName);
			myArray1.accept(populateAdt);
			myArray2.accept(populateAdt);
			myVector1.accept(populateAdt);
			myVector2.accept(populateAdt);
			// Find K largest number using MaxHeapVisitor
			Visitor maxHeapVisitor = new MaxHeapVisitor(size);
			myArray1.accept(maxHeapVisitor);
			myVector1.accept(maxHeapVisitor);
			// Find K largest number using ModifiedBubbleSortVisitor
			Visitor bubbleSortVisitor = new ModifiedBubbleSortVisitor(size);
			myArray2.accept(bubbleSortVisitor);
			myVector2.accept(bubbleSortVisitor);
		} else {
			System.err.println("Invalid input parameters!!!");
			System.exit(1);
		}
	}

}
