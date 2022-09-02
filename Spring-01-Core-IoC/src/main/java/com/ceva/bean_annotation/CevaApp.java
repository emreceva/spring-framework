package com.ceva.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CevaApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

      //  PartTimeMentor pt = container.getBean("p2", PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        ft.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);



    }
}
