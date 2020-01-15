class Hamming extends Exception {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand == "" ^ rightStrand == ""){
            if (leftStrand == "")
                throw new IllegalArgumentException("left strand must not be empty.");
            else if (rightStrand == "")
                throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.leftStrand  = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        if(this.leftStrand == "" && this.rightStrand == "") return 0;

        int result = 0;
        for (int i=0; i<this.leftStrand.length(); i++){
            if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i))
                result++;
        }

        return result;
    }
}
