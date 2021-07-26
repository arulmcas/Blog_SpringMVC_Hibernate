package com.blogproject.users;

import com.blogproject.address.Address;
import com.impl.blog.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {

    public User createUser(User user) {
        Session session = SessionUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception in create User Repository::: "+ e);
        } finally {
            session.close();
        }
        return user;
    }

}
