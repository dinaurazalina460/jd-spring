package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private ExtraSessions extraSessions;

    //Constructor Injection
    //@autowired is not nesessary if the is only ine consturctor
    //if there are more than 1 constuctor, the annotation is required for 1 constructor
    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

//    //Setter Injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+ (25 + extraSessions.getHours()));
    }
}
