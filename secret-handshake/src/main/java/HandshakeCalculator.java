import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Integer> binary = new ArrayList<Integer>();
        List<Signal> list = new ArrayList<Signal>();

        while(number >= 1){
            binary.add(number % 2);
            number /= 2;
        }

        if(1 <= binary.size() && binary.get(0) == 1){
            list.add(Signal.WINK);
        }
        if (2 <= binary.size() && binary.get(1) == 1) {
            list.add(Signal.DOUBLE_BLINK);
        }
        if (3 <= binary.size() && binary.get(2) == 1) {
            list.add(Signal.CLOSE_YOUR_EYES);
        }
        if (4 <= binary.size() && binary.get(3) == 1) {
            list.add(Signal.JUMP);
        }
        if (5 <= binary.size() && binary.get(4) == 1) {
            Collections.reverse(list);
        }

        return list;
    }

}
