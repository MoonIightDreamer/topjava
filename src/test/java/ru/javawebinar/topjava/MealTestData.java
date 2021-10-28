package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {
    public static final int USER_ID = START_SEQ;

    public static final int ADMIN_ID = START_SEQ + 1;

    public static final int MEAL_START_SEQ = START_SEQ + 2;

    public static final List<Meal> userMeals = Arrays.asList(
            new Meal(MEAL_START_SEQ + 3,
                    LocalDateTime.of(2021, Month.APRIL, 27, 17, 25),
                    "Lunch", 1100),
            new Meal(MEAL_START_SEQ + 2,
                    LocalDateTime.of(2021, Month.MARCH, 12, 10, 30),
                    "Breakfast", 640)
    );

    public static final List<Meal> adminMeals = Arrays.asList(
            new Meal(MEAL_START_SEQ + 1,
                    LocalDateTime.of(2020, Month.NOVEMBER, 12, 17, 30),
                    "Lunch", 1100),
            new Meal(MEAL_START_SEQ,
                    LocalDateTime.of(2020, Month.DECEMBER, 19, 10, 0),
                    "Breakfast", 420)
    );

    public static Meal getNew() {
        return new Meal(null, LocalDateTime.of(2020, Month.NOVEMBER, 12, 17, 30), "", 0);
    }

    public static Meal getUpdated() {
        Meal updated = new Meal(userMeals.get(1));
        updated.setDateTime(LocalDateTime.of(2020, Month.NOVEMBER, 12, 17, 30));
        updated.setDescription("updated description");
        updated.setCalories(100);
        return updated;
    }

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).isEqualTo(expected);
    }
}
