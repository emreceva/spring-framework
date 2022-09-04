package com.ceva.repository;

import com.ceva.model.Comment;
import com.ceva.proxy.CommentNotificationProxy;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment" + comment.getText());
    }
}
