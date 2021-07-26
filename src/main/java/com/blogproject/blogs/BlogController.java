package com.blogproject.blogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogproject.comments.Comment;

@RestController
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@ResponseBody
	@RequestMapping("/getblog")
	public void getBlog() {
		Blog blog= blogService.getBlog(1);
		System.out.println(blog);
	}
	
	@ResponseBody
	@RequestMapping("/createblog")
	public void saveBlog(@RequestBody BlogDTO blogDTO) {
		String id = blogService.createBlog(blogDTO);
	}
}
