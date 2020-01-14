public class PangramChecker {

    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public boolean isPangram(String input) {
        input = input.toLowerCase();

        for (char letter: alphabet) {
            if (input.indexOf(letter) == -1)
                return false;
        }
        return true;
    }

}
