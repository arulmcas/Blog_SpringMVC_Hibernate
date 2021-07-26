package com.blogproject.comments;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.impl.blog.util.SessionUtil;

public class CommentRepository {

	public String createComment(Comment comment) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
					
			session.save(comment);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in createComment Repository::: "+ e);
			transaction.rollback();
		} finally {
			session.close();
		}
		return comment.getId()+"";
	}
	
	public List<Comment> getCommentList(int blogid, int parentid) {
		List<Comment> comments = new ArrayList<>();
		Session session = SessionUtil.getSessionFactory().openSession();
		StringBuilder query = new StringBuilder();
		try {
			query.append("from Comment");
			if(blogid != 0) {
				query.append(" where blog_id=").append(blogid);
				if(parentid != 0) {
					query.append(" and parentcomment = ").append(parentid);
				} else {
					query.append(" and parentcomment = ").append("''");
				}
			}
			comments = session.createQuery(query.toString()).list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in createComment Repository::: "+ e);
		} finally {
			session.close();
		}
		return comments;
	}
}
