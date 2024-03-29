package ru.alex.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.alex.crudapp.dao.UserDao;
import ru.alex.crudapp.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) { userDao.addUser(user); }

    @Override
    @Transactional
    public List<User> getListUsers() { return userDao.getListUsers(); }

    @Override
    @Transactional
    public void deleteUser(int id) { userDao.deleteUser(id); }

    @Override
    @Transactional
    public void updateUser(User user) { userDao.updateUser(user); }

    @Override
    @Transactional
    public User getUser(int id) { return userDao.getUser(id); }
}
