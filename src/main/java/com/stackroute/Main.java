package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {

    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
    Movie movie = context.getBean("MovieA", Movie.class);
    System.out.println(movie.getActor().toString());

    ApplicationContext context1 = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
    Movie movieB = context.getBean("MovieA", Movie.class);

    System.out.println(movie == movieB);
    }
}
