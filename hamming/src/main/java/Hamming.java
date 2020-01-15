class Hamming extends Exception {

    private static final String WRONG_LENGTH = "leftStrand and rightStrand must be of equal length.";
    private static final String LEFT_STRAND_EMPTY = "left strand must not be empty.";
    private static final String RIGHT_STRAND_EMPTY = "right strand must not be empty.";

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() ^ rightStrand.isEmpty()){
            if (leftStrand.isEmpty())
                throw new IllegalArgumentException(LEFT_STRAND_EMPTY);
            else if (rightStrand.isEmpty())
                throw new IllegalArgumentException(RIGHT_STRAND_EMPTY);
        } else if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException(WRONG_LENGTH);

        this.leftStrand  = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        int result = 0;
        for (int i=0; i<this.leftStrand.length(); i++){
            if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i))
                result++;
        }

        return result;
    }
}
