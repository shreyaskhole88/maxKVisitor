maxKVisitor
===========

CS542 Design Patterns
Fall 2014
PROJECT maxKVisitors README FILE

Due Date: Friday, November 21, 2014
Submission Date: Friday, November 21, 2014
Grace Period Used This Project: 0 Days
Grace Period Remaining: 0 Days
Author(s): Shreyas Khole
e-mail(s): skhole1@binghamton.edu


PURPOSE:

Use visitor design pattern to find LARGEST k ELEMENTS FROM adt using heap sort
and modified bubble sort.

Complexity:
Heap Sort: O(klogn)
bubble Sort: O(kn)

Design Pattern Followed:

Visitor Pattern: Heap Sort, Bubble Sort and Populate Adt.
Singleton: Logger

Populate the adt using PopulateAdtVisitor class which uses FileProcessor
internally.

MaxHeapVisitor creates the max heap from MyVector and MyArray and appiles heap
sort on it.

ModifiedbubbleSortVisitor sort the MyArray and MyVector using modified bubble
sort which runs k*n times.

Build.xml file has run task and it will accept k and debug as a parameter.
Input file name is specified in build.xml file as a property.

Run project using: 

ant run -Dk=4 -Ddebug=2

FILES:

Included with this project are 35 files:

1)build.xml -- to build and run the application
2)README -- instructions regarding project
3)/src -- directory which contains all the source code files(.java files) used 
		in the project.
 	/src
		/maxKVisitors
			/adt
				ADTInterface.java
				MyArray.java
				MyVector.java
			/driver
				Driver.java
			/util
				FileProcessor.java
				Logger.java
			/visitor
				MaxHeapVisitor.java
				ModifiedBubbleSortVisitor.java
				PopulateAdtVisitor.java
				Visitor.java
				

SAMPLE OUTPUT:

bingsuns2% ant run -Dk=4 -Ddebug=2
Buildfile: build.xml

jar:

run:
     [java] Heap Sort for MyArray
     [java] 10  20      50      60      11      7       8       56
     [java] Largest 'First K' Elements:
     [java] 60  56      50      20
     [java] Heap Sort for MyVector
     [java] 10  20      50      60      11      7       8       56
     [java] Largest 'First K' Elements:
     [java] 60  56      50      20
     [java] Modified Bubble Sort for MyArray
     [java] 10  20      50      60      11      7       8       56
     [java] Largest 'First K' Elements:
     [java] 60  56      50      20
     [java] Modified Bubble Sort for MyVector
     [java] 10  20      50      60      11      7       8       56
     [java] Largest 'First K' Elements:
     [java] 60  56      50      20

BUILD SUCCESSFUL
Total time: 1 second
bingsuns2%


TO COMPILE:

  extract the file: 
  			tar -xvf Shreyas_Khole_assign5.tar.gz

  Compile src code: 
  			ant compile

  

TO RUN:

  Run the program:
  			 ant run -Dk=4 -Ddebug=2
