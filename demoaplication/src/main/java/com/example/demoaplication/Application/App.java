package com.example.demoaplication.Application;

import GogoSpring.Myfactory;
import com.example.Interface.Interface1;
import com.example.Interface.Interface2;


public class App {


    public static void main(String[] args) {
        Interface1 MyTimeStart = new MyService();
        Object startTime1 = Myfactory.createService(MyTimeStart);

        ((Interface1) startTime1).hello1();
      // ((Interface2) startTime1).hello2();


    }
}

