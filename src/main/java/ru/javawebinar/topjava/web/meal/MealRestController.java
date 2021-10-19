package ru.javawebinar.topjava.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.service.MealService;
import static ru.javawebinar.topjava.web.SecurityUtil.authUserId;

import java.util.Collection;

@Controller
public class MealRestController {

    @Autowired
    private MealService service;

    public Collection<Meal> getAll() {
        return service.getAll();
    }

    public Meal get(int mealId) {
        return service.get(mealId, authUserId());
    }

    public Meal create(Meal meal) {
        return service.create(meal, authUserId());
    }

    public void delete(int id) {
        service.delete(id, authUserId());
    }

    public void update(Meal meal) {
        service.update(meal, authUserId());
    }
}