package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie2", Movie.class);
        Movie movie2=(Movie)applicationContext.getBean("movie3", Movie.class);

        System.out.println(movie.getActor());
        System.out.println(movie2.getActor());

        ApplicationContext context = movie.getApplicationContext();
        Movie m= (Movie)context.getBean("movie2");
        System.out.println(m.getActor().toString());

        Movie m2=(Movie) Movie.getBeanFactory().getBean("movie3");
        System.out.println(m2.getActor().toString());

        ((ConfigurableApplicationContext)applicationContext).close();


    }
}
