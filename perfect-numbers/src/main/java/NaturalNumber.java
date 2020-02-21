class NaturalNumber extends Exception {

    static final String ERROR_MESSAGE = "You must supply a natural number (positive integer)";

    int number;

    NaturalNumber(int number) throws IllegalArgumentException {
        if(number <= 0)
            throw new IllegalArgumentException(ERROR_MESSAGE);
        this.number = number;
    }

    Classification getClassification() {

        int aliquotSum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                aliquotSum += i;
        }

        Classification classification;

        if (aliquotSum == number)
            classification = Classification.PERFECT;
        else if (aliquotSum > number)
            classification = Classification.ABUNDANT;
        else
            classification = Classification.DEFICIENT;

        return classification;
    }

}
