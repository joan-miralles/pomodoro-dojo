package es.joanmiralles.kata.pomodoro.boundary;

import es.joanmiralles.kata.pomodoro.entity.Pomodoro;
import es.joanmiralles.kata.pomodoro.entity.PomodoroStatus;

public class PomodoroHandler {

    public void start(Pomodoro pomodoro) {
        pomodoro.start();
    }
}