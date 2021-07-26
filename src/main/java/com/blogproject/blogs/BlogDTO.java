package com.blogproject.blogs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.blogproject.comments.Comment;

public class BlogDTO {

	private int id;
	private String blogname;
	private String question;
	private String date;
	private List<Comment> comments = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
