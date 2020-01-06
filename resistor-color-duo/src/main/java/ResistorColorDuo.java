import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        String[] colorsChoices = {
                "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white"
        };

        String result = "";
        for(String color : colors){
            if(result.length() < 2)
                result += Arrays.asList(colorsChoices).indexOf(color);
        }

        return Integer.parseInt(result);
    }
}