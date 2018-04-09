package com.rcsit.zf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fun on 2018/4/8.
 */
public class TestAutoWire {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TextEditor textEditor = (TextEditor)context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
