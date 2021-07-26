package com.blogproject.blogs;

import java.util.function.Function;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

	@Autowired
	BlogRepository blogRepository;
	
	public String createBlog(BlogDTO blogDTO) {
		String id = blogRepository.createBlog(blogDataMaping.apply(blogDTO));
		return id;
	}
	
	public Blog getBlog(int blogid) {
		Blog blog = new Blog();
		blog = blogRepository.getBlog(blogid);
		return blog;
	}
	
	Function<BlogDTO, Blog> blogDataMaping = (blogDTO) -> {
		Blog blog = new Blog();
		blog.setId(blogDTO.getId());
		blog.setBlogname(blogDTO.getBlogname());
		blog.setQuestion(blogDTO.getQuestion());
		blog.setDate(blogDTO.getDate());
		blog.setComments(blogDTO.getComments());
		System.out.println(blog);
		return blog;
	};
}
