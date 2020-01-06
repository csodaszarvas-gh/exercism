import java.util.HashMap;

class Darts {

    private static final double OUTER_CIRCLE_RADIUS = 1;
    private static final double MIDDLE_CIRCLE_RADIUS = 5;
    private static final double INNER_CIRCLE_RADIUS = 10;

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {

        double position = Double.valueOf(Math.pow(x, 2) + Math.pow(y, 2));

        if(position > Math.pow(INNER_CIRCLE_RADIUS, 2))
            return 0;
        else if(position > Math.pow(MIDDLE_CIRCLE_RADIUS, 2))
            return 1;
        else if(position > Math.pow(OUTER_CIRCLE_RADIUS, 2))
            return 5;
        return 10;
    }

}