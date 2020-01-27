import java.util.regex.*;

class Acronym {

    Matcher matcher;

    Acronym(String phrase) {
        Pattern pattern = Pattern.compile("^\\p{Alpha}|(?<=[ _-])\\p{Alpha}");
        this.matcher = pattern.matcher(phrase);
    }

    String get() {
        String acronym = "";
        while (this.matcher.find()) {
            acronym += matcher.group();
        }

        return acronym.toUpperCase();
    }
}
