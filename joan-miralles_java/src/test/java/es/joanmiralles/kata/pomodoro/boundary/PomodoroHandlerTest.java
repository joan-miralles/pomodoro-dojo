package es.joanmiralles.kata.pomodoro.boundary;

import es.joanmiralles.kata.pomodoro.entity.Pomodoro;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;

public class PomodoroHandlerTest {

    @Test
    public void when_pomodoro_starts_countdown_starts() throws InterruptedException {
        Pomodoro pomodoro = new Pomodoro();
        PomodoroHandler handler = new PomodoroHandler();
        handler.start(pomodoro);
        Thread.sleep(1100);
        assertThat(pomodoro.getLeftDurationInSeconds(), lessThan(Pomodoro.DEFAULT_POMODORO_DURATION_IN_SECONDS));
    }
}