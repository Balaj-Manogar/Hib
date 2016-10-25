package org.baali.service;

import org.baali.model.User;

/**
 * Created by Balaji on 24/10/16.
 */
public interface IUserService
{
    public User findUserByName(String name);

    public void createUser(User user);
}
