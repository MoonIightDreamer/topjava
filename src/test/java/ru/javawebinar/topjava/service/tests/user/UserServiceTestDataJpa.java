package ru.javawebinar.topjava.service.tests.user;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"hsqldb", "datajpa"})
public class UserServiceTestDataJpa extends UserServiceTest{
}
