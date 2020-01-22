import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class SpaceAge {

    private static final long EARTH_YEAR_IN_SECONDS = 31557600;
    private static final Map<String, Double> EARTH_YEAR_RELATED;

    double seconds;

    static {
        Map<String, Double> temp = new HashMap();
        temp.put("mercury", 0.2408467);
        temp.put("venus", 0.61519726);
        temp.put("mars", 1.8808158);
        temp.put("jupiter", 11.862615);
        temp.put("saturn", 29.447498);
        temp.put("uranus", 84.016846);
        temp.put("neptune", 164.79132);
        EARTH_YEAR_RELATED = Collections.unmodifiableMap(temp);
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double getSecondsOnEarth() {
        return seconds / EARTH_YEAR_IN_SECONDS;
    }

    double onEarth() {
        return getSecondsOnEarth();
    }

    double onMercury() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("mercury");
    }

    double onVenus() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("venus");
    }

    double onMars() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("mars");
    }

    double onJupiter() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("jupiter");
    }

    double onSaturn() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("saturn");
    }

    double onUranus() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("uranus");
    }

    double onNeptune() {
        return getSecondsOnEarth() / EARTH_YEAR_RELATED.get("neptune");
    }

}