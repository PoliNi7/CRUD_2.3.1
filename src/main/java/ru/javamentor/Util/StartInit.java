package ru.javamentor.Util;

import org.springframework.stereotype.Component;
import ru.javamentor.model.User;
import ru.javamentor.service.UserServiceImpl;

import javax.annotation.PostConstruct;

@Component
public class StartInit {
    UserServiceImpl userService;

    public StartInit(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void ks() {
        userService.addUser(new User("Name", "LN", "@mail"));
        userService.addUser(new User("Name2", "LN2", "2@mail"));
        userService.addUser(new User("Name3", "LN3", "3@mail"));
    }
}
