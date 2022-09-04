package com.ceva.repository;

import com.ceva.model.Comment;
import com.ceva.proxy.CommentNotificationProxy;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment" + comment.getText());
    }
}
