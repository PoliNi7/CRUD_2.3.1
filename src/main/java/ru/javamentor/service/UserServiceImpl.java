package ru.javamentor.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.dao.UserDao;
import ru.javamentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl {

    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getListUsers(){
        return userDao.getListUsers();
    }

    public User getUser(long id) {
        return userDao.getUser(id);
    }
    @Transactional
    public void addUser(User user){
        userDao.addUser(user);
    }
    @Transactional
    public void updateUser(User newUser){
        userDao.updateUser(newUser);
    }
    @Transactional
    public void deleteUser(Long id){
        userDao.deleteUser(id);
    }
}
