package com.ceva.proxy;

import com.ceva.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
