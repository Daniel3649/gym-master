package io.github.Daniel3649;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TimeOfDay other = (TimeOfDay) o;
        return hours == other.hours && minutes == other.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes);
    }
}
