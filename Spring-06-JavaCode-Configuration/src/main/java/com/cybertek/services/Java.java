package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+ (30 + extraSessions.getHours()));
    }

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

}

