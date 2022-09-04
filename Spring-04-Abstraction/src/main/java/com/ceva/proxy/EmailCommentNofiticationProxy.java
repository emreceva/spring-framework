package com.ceva.proxy;

import com.ceva.model.Comment;

public class EmailCommentNofiticationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment" + comment.getText());
    }
}
