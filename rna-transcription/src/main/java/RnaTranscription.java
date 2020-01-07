import java.util.Map;

class RnaTranscription {

    private final static Map<Character, Character> MAP = Map.of('T', 'A', 'G', 'C', 'C', 'G', 'A', 'U');

    String transcribe(String dnaStrand) {

        String result = "";
        for (int i=0; i<dnaStrand.length(); i++){
            result += MAP.get(dnaStrand.charAt(i));
        }

        return result;
    }
}