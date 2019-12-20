package academy.learnprogramming;

public class Main {
	public static void main(String[] args) {
		boolean thisOrThat = true;
		boolean thatOrThis = (thisOrThat) ? false : true;
		if (thatOrThis) {
			System.out.println("THAT!");
		}
		else {
			System.out.println("THIS!");
		}
		
		double bigNumber = 20.00;
		double biggerNumber = 80.00;
		double greatNumber = (bigNumber + biggerNumber) * 100.00;
		double remainderNumber = greatNumber % 40.00;
		
		boolean noRemainder = (remainderNumber == 0) ? true : false;
		System.out.println(noRemainder);
		
		if (!noRemainder) {
			System.out.println("Got some remainder");
		}
	}
}