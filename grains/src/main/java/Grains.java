import java.math.BigInteger;

class Grains extends Exception {
    private static final String wrongSquareMessage = "square must be between 1 and 64";

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException(wrongSquareMessage);

        return BigInteger.TWO.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.ONE;
        for (int i=2; i<=64; i++)
            result = result.add(grainsOnSquare(i));

        return result;
    }

}
