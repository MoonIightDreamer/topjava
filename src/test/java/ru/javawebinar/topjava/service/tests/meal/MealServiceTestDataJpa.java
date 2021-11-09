package ru.javawebinar.topjava.service.tests.meal;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "datajpa"})
public class MealServiceTestDataJpa extends MealServiceTest {
}
