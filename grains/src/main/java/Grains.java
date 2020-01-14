import java.math.BigInteger;

class Grains extends Exception {
    private static final String wrongSquareMessage = "square must be between 1 and 64";

    BigInteger grainsOnSquare(final int square) {
        if (square > 0 && square < 65){
            BigInteger base = new BigInteger("2");
            return base.pow(square-1);
        }
        else
            throw new IllegalArgumentException(wrongSquareMessage);
    }

    BigInteger grainsOnBoard() {
        BigInteger result = new BigInteger("0");
        for (int i=1; i<=64; i++)
            result = result.add(grainsOnSquare(i));

        return result;
    }

}
