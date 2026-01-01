package basicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 10; // to generate Fibonacci series up to this number
		System.out.println("Fibonacci Series: ");
		printFibonacciSeries(num);
	}

	public static void printFibonacciSeries(int num) {

		int first = 0, next = 1, sum = 0;

		System.out.print(first + " " + next + " ");

		for (int i = 2; i < num; i++) {
			sum = first + next;
			System.out.print(sum + " ");
			first = next;
			next = sum;
		}
	}

}
