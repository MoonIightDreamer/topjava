package ru.javawebinar.topjava.service.tests.user;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "jpa"})
public class UserServiceTestJpa extends UserServiceTest{
}
