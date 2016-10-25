package org.baali.main;

import org.baali.model.User;
import org.baali.model.UserRole;
import org.baali.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Balaji on 24/10/16.
 */
public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        IUserService userService = context.getBean("userService", IUserService.class);

        System.out.println("From User Service: " + userService.findUserByName("user"));

        User user2 = new User();
        user2.setUserName("user22");
        user2.setPassword("user22");

        UserRole r = new UserRole();
        //r.setUserId(user2.getId());
        r.setRole("dummy22");

        r.setUser(user2);


        user2.getRoles().add(r);
        userService.createUser(user2);
    }
}
