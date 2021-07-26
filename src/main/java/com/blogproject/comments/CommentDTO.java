package com.blogproject.comments;

import com.blogproject.blogs.Blog;

public class CommentDTO {

	private int id;
	private String data;
	private String parentcomment;
	private String date;
	private Blog blog;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getParentcomment() {
		return parentcomment;
	}
	public void setParentcomment(String parentcomment) {
		this.parentcomment = parentcomment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	
}
