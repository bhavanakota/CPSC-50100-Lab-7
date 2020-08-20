import java.util.Arrays;
import java.util.Stack;

/*
Exercise 1
Create a new Driver class with a main method. In this method, do the following:
1. Create an instance of an ArrayStack and a LinkedStack class.
2. Push the following int's onto the two stacks: (1,7,3,4,9,2)
3. Pop off all the elements from the stacks, displaying each int as it's removed

Exercise 2
Modify the LinkedStack class to include a new method called removeBottomHalf, 
which removes the half of elements sitting at the bottom of the stack.
Test the method using the Driver program.
What is the time complexity of this method?
*/
public class Driver {

	public static void main(String[] args) {

		// Creating the ArrayStack and LinkedStack
		ArrayStack arrayS = new ArrayStack();

		LinkedStack linkedS = new LinkedStack();

		// Pushing the values into each stack 
		arrayS.push(1);
		arrayS.push(7);
		arrayS.push(3);
		arrayS.push(4);
		arrayS.push(9);
		arrayS.push(2);

		linkedS.push(1);
		linkedS.push(7);
		linkedS.push(3);
		linkedS.push(4);
		linkedS.push(9);
		linkedS.push(2);

		// Until the array is empty, keep popping off the values and print each value
		while (!arrayS.isEmpty()) {
			System.out.println("ArrayStack: " + arrayS.pop());
		}

		System.out.print("\n");

		while (!linkedS.isEmpty()) {
			System.out.println("LinkedStack: " + linkedS.pop());
		}

		System.out.print("\n");

		// Creating a new LinkedStack for exercise 2 
		LinkedStack linkedS2 = new LinkedStack();

		linkedS2.push(1);
		linkedS2.push(7);
		linkedS2.push(3);
		linkedS2.push(4);
		linkedS2.push(9);
		linkedS2.push(2);

		// This connects to the removeBottomHalf method from the LinkedStack class 
		linkedS2.removeBottomHalf();

		// Printing out the remaining elements
		System.out.println("After removing bottom half = " + linkedS2);
	}
}
