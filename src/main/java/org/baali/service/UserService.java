package org.baali.service;

import org.baali.dao.IUserDAO;
import org.baali.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Balaji on 24/10/16.
 */
@Service("userService")
@Transactional
public class UserService implements IUserService
{
    private IUserDAO userDAO;

    @Autowired
    public UserService(IUserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    public User findUserByName(String name)
    {
        return userDAO.findUserByName(name);
    }

    public void createUser(User user)
    {
        userDAO.createUser(user);
    }


}
