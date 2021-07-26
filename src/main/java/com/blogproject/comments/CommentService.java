package com.blogproject.comments;

import java.util.List;
import java.util.function.Function;

import com.blogproject.blogs.Blog;
import com.blogproject.blogs.BlogService;

public class CommentService {

	CommentRepository commentRepository = new CommentRepository();
	BlogService blogService = new BlogService();
	
	public String createComment(CommentDTO commentDTO, int blogid) {
		Blog blog = blogService.getBlog(blogid);
		commentDTO.setBlog(blog);
		String id = commentRepository.createComment(commentDataMapping.apply(commentDTO));
		return id;
	}
	
	public List<Comment> getCommentByBlogId(int blogid, int parentid) {
		List<Comment> comments = commentRepository.getCommentList(blogid, parentid);
		return comments;
	}

	Function<CommentDTO, Comment> commentDataMapping = (commentDTO) -> {
		Comment comment = new Comment();
		comment.setData(commentDTO.getData());
		comment.setDate(commentDTO.getDate());
		comment.setParentcomment(commentDTO.getParentcomment());
		return comment;
	};
}
