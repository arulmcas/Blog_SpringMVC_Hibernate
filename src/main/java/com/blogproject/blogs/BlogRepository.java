package com.blogproject.blogs;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.impl.blog.util.SessionUtil;

@Repository
public class BlogRepository {

	public String createBlog(Blog blog) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
					
			session.saveOrUpdate(blog);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in createBlog Repository::: "+ e);
			transaction.rollback();
		} finally {
			session.close();
		}
		return "";
	}
	
	public Blog getBlog(int blogid) {
		Blog blog = new Blog();
		Session session = SessionUtil.getSessionFactory().openSession();
		try {
			blog = (Blog) session.get(Blog.class, blogid);
		} catch (Exception e) {
			System.out.println("Exception in getBlog Repository::: "+ e);
		}
		return blog;
	}
}
