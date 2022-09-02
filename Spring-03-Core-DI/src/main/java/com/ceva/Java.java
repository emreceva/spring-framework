package com.ceva;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
@AllArgsConstructor
public class Java {

    //Field Injection
    //@Autowired
    //OfficeHours officeHours;

    //Constructor Injection
    OfficeHours officeHours;
    //@Autowired
    //public Java (OfficeHours officeHours){
     //   this.officeHours = officeHours;
    //}

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
