package com.blogproject.address;

import com.impl.blog.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddressRepository {

    public Address createAddress(Address address) {
        Session session = SessionUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(address);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception in create Address Repository::: "+ e);
        } finally {
            session.close();
        }
        return address;
    }

}
