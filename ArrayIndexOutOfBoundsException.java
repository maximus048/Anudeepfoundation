/
1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]


Code:

package Practice;

public class ExceptionHandling {


	public static void main(String[] args) {

		int[] numbers = {10, 20, 30};

		System.out.println("Attempting to access array elements...");

		try {
			for (int i = 0; i <= numbers.length; i++) {
				System.out.println("Index " + i + ": " + numbers[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("\nCaught the Error: " + e.getMessage());
			System.err.println("Logic Error: You tried to access index " + numbers.length + 
					" in an array of size " + numbers.length);
		}
	}
}


Output:
Attempting to access array elements...
Index 0: 10
Index 1: 20
Index 2: 30

Caught the Error: Index 3 out of bounds for length 3
Logic Error: You tried to access index 3 in an array of size 3

*/