package com.ceva;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Selenium {
    public void getHours(){
        System.out.println("Weekly teaching hours : " + 150);
    }
}
