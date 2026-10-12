package io.github.Daniel3649;

public class TimeOfDay {
    //часы (от 0 до 23)
    private final int hours;
    //минуты (от 0 до 59)
    private final int minutes;

    public TimeOfDay(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
