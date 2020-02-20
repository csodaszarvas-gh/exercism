import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Scrabble {

    private static final Map<Character, Integer> ALPHABET_SCORE;

    double seconds;

    static {
        Map<Character, Integer> temp = new HashMap();
        temp.put('A', 1);
        temp.put('B', 3);
        temp.put('C', 3);
        temp.put('D', 2);
        temp.put('E', 1);
        temp.put('F', 4);
        temp.put('G', 2);
        temp.put('H', 4);
        temp.put('I', 1);
        temp.put('J', 8);
        temp.put('K', 5);
        temp.put('L', 1);
        temp.put('M', 3);
        temp.put('N', 1);
        temp.put('O', 1);
        temp.put('P', 3);
        temp.put('Q', 10);
        temp.put('R', 1);
        temp.put('S', 1);
        temp.put('T', 1);
        temp.put('U', 1);
        temp.put('V', 4);
        temp.put('W', 4);
        temp.put('X', 8);
        temp.put('Y', 4);
        temp.put('Z', 10);
        ALPHABET_SCORE = Collections.unmodifiableMap(temp);
    }

    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int res = 0;
        for (char c : this.word.toCharArray()){
            res += ALPHABET_SCORE.get(Character.toUpperCase(c));
        }
        return res;
    }

}

