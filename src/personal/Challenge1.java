package personal;

public class Challenge1 {

	public static void main(String[] args) {

		/*
		 * Count to 100 with every loop type
		 * 1) for
		 * 2) while or do...while
		 */

        /*
         * For loop:
         *

        for (int counter = 0; counter <= 100; counter += 1) {
            System.out.println(counter);
        }

        /*
         * While loop:
         *

        int counter = 0;
		while (counter < 100) {
			System.out.println(counter);
			counter = counter + 1;
		}

		  * Do-While Loop:
		  *

        int counter = 0;
        do {
			System.out.println(counter);
			counter = counter +2;
		}
		while (counter < 100);
		}

		 *Looping through arrays
		 *
		*//* Count using an array
		int x[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for (int aX : x) System.out.println(aX);}
		*/

		/*
		#########Old code before IDE suggestion swapped########

		for (int index = 0; index < x.length ; index++){
			System.out.println(x[index]);
		}
		*/

		// Looping arrays with while loop
		/*
		int x[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int index = 0;
		while (index < x.length) {
			System.out.println(x[index]);
			index++;
		}
	}
		*
		*  Fibonacci sequence
		*/


		int fnSize = 15;
		int[] fibNum = new int[fnSize];
		fibNum[0] = 0;
		fibNum[1] = 1;

		for (int i = 2; i < fnSize - 1; i++) {
			fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
		}
		for (int i = 0; i < fnSize - 1; i++) {
			System.out.println(fibNum[i] + " ");
		}
	}
	}
	/* Call fib a different way 
	int fib = 0;
	int fib= 1;

	int fib(int n, int []memoFib){
		if (n <= 0) {
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else if (memoFib[n]){
			memoFib = fib(n-1) + fib(n-2)
		}
		return memoFib[n];
	}
	*/


