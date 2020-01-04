class Leap {

    boolean isLeapYear(int year) {
        boolean result = false;

        if(year % 400 == 0)
            result = true;
        else if(year % 100 == 0)
            result = false;
        else if(year % 4 == 0)
            result = true;

        return result;
    }

}
