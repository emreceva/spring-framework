package com.ceva.repository;

import com.ceva.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
