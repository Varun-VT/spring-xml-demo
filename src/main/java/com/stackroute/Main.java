package com.stackroute;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {

    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
    Movie movie = context.getBean("herapheri", Movie.class);
    System.out.println(movie.getActor().toString());

    }
}
