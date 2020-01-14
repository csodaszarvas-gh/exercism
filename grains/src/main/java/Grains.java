import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger base = new BigInteger("2");
        return base.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger result = new BigInteger("0");
        for (int i=1; i<=64; i++)
            result = result.add(grainsOnSquare(i));

        return result;
    }

}
