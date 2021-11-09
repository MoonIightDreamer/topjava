package ru.javawebinar.topjava.service.tests.user;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "jdbc"})
public class UserServiceTestJdbc extends UserServiceTest{
}
