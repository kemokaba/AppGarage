package com.controller;

import com.to.Employee;
import com.to.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e1 = (Employee) context.getBean("e1");
        System.out.println(e1);
    }
}
