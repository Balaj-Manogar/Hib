package org.baali.dao;

import org.baali.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Balaji on 24/10/16.
 */

@Repository
public class UserDAO implements IUserDAO
{

    private SessionFactory sessionFactory;

    @Autowired
    public UserDAO(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public User findUserByName(String name)
    {
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("userName", name)).uniqueResult();
    }

    public void createUser(User user)
    {
        sessionFactory.getCurrentSession().persist(user);
        System.out.println("Created Successfully: " + user);
    }
}
