package com.blogproject.comments;

import java.util.Date;
import java.util.List;

public class CommentController {

	CommentService commentService = new CommentService();
	
	public static void main(String args[]) {
		CommentController commentController = new CommentController();
//		commentController.createComment();
		commentController.getCommentList();
	}
	
	public CommentDTO createComment() {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setData("2 types of exception");
		commentDTO.setDate(new Date()+"");
		commentDTO.setParentcomment("exception");
		String id = commentService.createComment(commentDTO,1);
		commentDTO.setId(Integer.parseInt(id));
		return commentDTO;
	}
	
	public void getCommentList() {
		 List<Comment> comments = commentService.getCommentByBlogId(2,6); 
		 comments.forEach(comment -> System.out.println(comment));
	}
}
