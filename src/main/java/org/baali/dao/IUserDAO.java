package org.baali.dao;

import org.baali.model.User;

/**
 * Created by Balaji on 24/10/16.
 */
public interface IUserDAO
{
    public User findUserByName(String name);

    public void createUser(User user);
}
