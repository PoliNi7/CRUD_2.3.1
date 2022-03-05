package ru.javamentor.service;

import ru.javamentor.model.User;
import java.util.List;

public interface UserService {
    List<User> getListUsers();
    User getUser(long id);
    void addUser(User user);
    void updateUser(User newUser);
    void deleteUser(long id);
}
