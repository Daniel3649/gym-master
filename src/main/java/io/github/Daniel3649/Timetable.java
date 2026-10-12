package io.github.Daniel3649;

import java.util.List;
import java.util.Map;

public class Timetable {
    private Map<DayOfWeek, Map<TimeOfDay, List<TrainingSession>>> timetable;

    public void addNewTrainingSession(TrainingSession trainingSession) {
        //сохраняем занятие в расписании
    }

    public Map<TimeOfDay, List<TrainingSession>> getTrainingSessionsForDay(DayOfWeek dayOfWeek) {
        //как реализовать, тоже непонятно, но сложность должна быть О(1)
        return null;
    }

    public List<TrainingSession> getTrainingSessionsForDayAndTime(DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
        //как реализовать, тоже непонятно, но сложность должна быть О(1)
        return null;
    }
}
