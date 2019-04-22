package com.example.demoaplication.Application;

import GogoSpring.MytimeStart;
import com.example.Interface.Interface1;
import com.example.Interface.Interface2;

public class MyService implements Interface1, Interface2 {
    @MytimeStart
    @Override
    public void hello1() {
        System.out.println("Hello Method 1");

    }

    @Override
    public void hello2() {
        System.out.println("Hello Method 2");
    }


}
