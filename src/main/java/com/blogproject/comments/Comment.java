package com.blogproject.comments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import com.blogproject.blogs.Blog;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "data", nullable = false, columnDefinition="Text")
	@Type(type = "text")
	private String data;
	
	@Column(name = "parentcomment", nullable = true, columnDefinition="Text")
	@Type(type = "text")
	private String parentcomment;
	
	@Column(name = "date", nullable = false)
	private String date;

//	@ManyToOne
//	@JoinColumn(name = "blog_id")
//	private Blog blog;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

//	public Blog getBlog() {
//		return blog;
//	}
//
//	public void setBlog(Blog blog) {
//		this.blog = blog;
//	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((parentcomment == null) ? 0 : parentcomment.hashCode());
		return result;
	}

	public Comment(int id, String data, String parentcomment, String date) {
		super();
		this.id = id;
		this.data = data;
		this.parentcomment = parentcomment;
		this.date = date;
	}
	
	public Comment() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (parentcomment == null) {
			if (other.parentcomment != null)
				return false;
		} else if (!parentcomment.equals(other.parentcomment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", data:" + data + ", parentcomment:" + parentcomment + ", date:" + date + "}";
	}
	
}
