import java.util.ArrayList;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		ArrayList<Integer> numbers = intToArrayList(numberToCheck);

		int result = 0;
		for(int number : numbers){
			result += Math.pow(number, numbers.size());
		}

		return result == numberToCheck;
	}

	ArrayList<Integer> intToArrayList(int number){
		ArrayList<Integer> numbers = new ArrayList();
		do {
			numbers.add(number % 10);
			number/=10;
		} while (number > 0);

		return numbers;
	}

}
