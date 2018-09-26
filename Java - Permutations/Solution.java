import java.util.*;


class Repeated {

	public char[] array;
	public ArrayList<Integer> repetition;

	Repeated(final int noOfElements) {

		array = new char[noOfElements];
		repetition = new ArrayList<>();
	}


	public void addRepeated() {
		int count = 1;
		Arrays.sort(array);
		for(int i = 0; i < array.length -1; i++) {

			if(array[i] == array[i+1]) {
				count++;

			} else if(count > 1) {
				repetition.add(count);
				count = 1;
			}
		}
	}

	public int getDenminator() {
		int denominator = 1;
		for(int eachCount : repetition) {
			denominator *= factorial(eachCount);
		}
		return denominator;
	}


	public int factorial(final int num) {

		int factorial = 1;
		for(int j = num; j > 0; j--) {

			factorial = factorial * j ;
		}
		return factorial;
	}
}

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string/word : ");
		String str = scan.nextLine();

		int noOfElements = str.length();
		Repeated o = new Repeated(noOfElements);

		o.array = str.toLowerCase().toCharArray();
		o.addRepeated();
		System.out.println(" \n" + str + " can have " +
		    o.factorial(noOfElements) / o.getDenminator() + " arrangements.");

	}
}