package com.springinaction.knights.test;

import com.springinaction.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
