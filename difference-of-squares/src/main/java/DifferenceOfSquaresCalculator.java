class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int result = 0;
        for (;input>0; input--){
            result += input;
        }
        return (int)Math.pow(result, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int result = 0;
        for (;input>0; input--){
            result += (int)Math.pow(input, 2);
        }
        return result;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
