import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final long GIGASECOND = 1000000000;

    LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGASECOND);
    }

}
