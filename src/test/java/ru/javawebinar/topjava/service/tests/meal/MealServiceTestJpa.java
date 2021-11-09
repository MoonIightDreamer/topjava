package ru.javawebinar.topjava.service.tests.meal;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "jpa"})
public class MealServiceTestJpa extends MealServiceTest{
}
