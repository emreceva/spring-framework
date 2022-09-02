package com.ceva.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CevaApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);




    }
}
