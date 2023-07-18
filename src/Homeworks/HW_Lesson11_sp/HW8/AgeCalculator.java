package Homeworks.HW_Lesson11_sp.HW8;

import java.time.Duration;
import java.time.LocalDateTime;

/*Спроектуйте та розробіть метод, який визначає, скільки часу пройшло із заданої дати.
За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».*/

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2003, 8, 22, 1, 25);

        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(birthday, currentTime);

        long years = duration.toDays() / 365;
        long months = (duration.toDays() % 365) / 30;
        long days = (duration.toDays() % 365) % 30;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        String result = String.format("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин та %d секунд",
                years, months, days, hours, minutes, seconds);

        System.out.println(result);
    }
}
