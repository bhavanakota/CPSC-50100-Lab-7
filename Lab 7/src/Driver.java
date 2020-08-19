import java.util.Arrays;
import java.util.Stack;

/*
Create a new Driver class with a main method. In this method, do the following:
1. Create an instance of an ArrayStack and a LinkedStack class.
2. Push the following int's onto the two stacks: (1,7,3,4,9,2)
3. Pop off all the elements from the stacks, displaying each int as it's removed
*/
public class Driver {

	public static void main(String[] args) {

		ArrayStack arrayS = new ArrayStack();

		LinkedStack linkedS = new LinkedStack();

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

		while (!arrayS.isEmpty()) {
			System.out.println("ArrayStack: " + arrayS.pop());
		}

		System.out.print("\n");

		while (!linkedS.isEmpty()) {
			System.out.println("LinkedStack: " + linkedS.pop());
		}

		System.out.print("\n");

		LinkedStack linkedS2 = new LinkedStack();

		linkedS2.push(1);
		linkedS2.push(7);
		linkedS2.push(3);
		linkedS2.push(4);
		linkedS2.push(9);
		linkedS2.push(2);

		linkedS2.removeBottomHalf();

		System.out.println("Removed bottom half = " + linkedS2);
	}
}
