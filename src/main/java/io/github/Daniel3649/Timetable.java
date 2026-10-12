package io.github.Daniel3649;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class Timetable {
    private final Map<DayOfWeek, Map<TimeOfDay, List<TrainingSession>>> timetable;
    private static final Comparator<TimeOfDay> TIME_OF_DAY_COMPARATOR =
            Comparator.comparingInt(TimeOfDay::getHours)
                    .thenComparingInt(TimeOfDay::getMinutes);

    public Timetable() {
        timetable = new EnumMap<>(DayOfWeek.class);

        for (DayOfWeek day : DayOfWeek.values()) {
            timetable.put(day, new TreeMap<>(TIME_OF_DAY_COMPARATOR));
        }
    }

    public void addNewTrainingSession(TrainingSession trainingSession) {
        DayOfWeek dayOfWeekAddedTraining = trainingSession.getDayOfWeek();
        TimeOfDay timeOfDayAddedTraining = trainingSession.getTimeOfDay();

        Map<TimeOfDay, List<TrainingSession>> trainingsByDayOfWeek = timetable.get(dayOfWeekAddedTraining);
        trainingsByDayOfWeek
                .computeIfAbsent(timeOfDayAddedTraining, _ -> new ArrayList<>())
                .add(trainingSession);
    }

    public Map<TimeOfDay, List<TrainingSession>> getTrainingSessionsForDay(DayOfWeek dayOfWeek) {
        return timetable.get(dayOfWeek);
    }

    public List<TrainingSession> getTrainingSessionsForDayAndTime(DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
        return timetable.get(dayOfWeek).getOrDefault(timeOfDay, new ArrayList<>());
    }
}
