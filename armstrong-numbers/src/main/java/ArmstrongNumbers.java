import java.util.ArrayList;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		if(numberToCheck == 0)
			return true;

		ArrayList<Integer> numbers = intToArrayList(numberToCheck);

		int result = 0;
		for(int i=0; i < numbers.size(); i++){
			result += Math.pow(numbers.get(i), numbers.size());
		}

		if(result == numberToCheck)
			return true;

		return false;
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
