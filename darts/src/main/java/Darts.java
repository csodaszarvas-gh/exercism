import java.util.HashMap;

class Darts {

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {

        HashMap<String, Integer> scores = new HashMap();
        scores.put("good", 1);
        scores.put("soso", 5);
        scores.put("bad", 10);

        double scoreFromPlayer = Double.valueOf(Math.pow(x, 2) + Math.pow(y, 2));

        if(scoreFromPlayer > Double.valueOf(Math.pow(scores.get("bad"), 2)))
            return 0;
        if(scoreFromPlayer > Double.valueOf(Math.pow(scores.get("soso"), 2)))
            return 1;
        if(scoreFromPlayer > Double.valueOf(Math.pow(scores.get("good"), 2)))
            return 5;
        return 10;
    }

}