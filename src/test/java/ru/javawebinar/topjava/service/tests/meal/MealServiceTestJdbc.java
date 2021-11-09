package ru.javawebinar.topjava.service.tests.meal;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "jdbc"})
public class MealServiceTestJdbc extends MealServiceTest{
}
