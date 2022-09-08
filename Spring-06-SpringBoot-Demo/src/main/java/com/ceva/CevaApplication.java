package com.ceva;

import com.ceva.model.Comment;
import com.ceva.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CevaApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(CevaApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);



    }

}
