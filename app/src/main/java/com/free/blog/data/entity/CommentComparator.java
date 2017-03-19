package com.free.blog.data.entity;

import java.util.Comparator;

/**
 * 评论列表-排序
 * 
 * @author tangqi
 * @since 2015年8月4日下午4:09:58
 */

public class CommentComparator implements Comparator<Comment> {

	@Override
	public int compare(Comment arg0, Comment arg1) {
		if (arg0.getParentId().equals(arg1.getCommentId())) {
			return 1;
		} else if (arg0.getCommentId().equals(arg1.getParentId())) {
			return -1;
		}
		return 0;
	}

}