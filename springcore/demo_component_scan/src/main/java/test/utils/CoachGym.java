package test.utils;
import org.springframework.stereotype.Component;

@Component
public class CoachGym implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Workout 15minutes !";
    }
}
