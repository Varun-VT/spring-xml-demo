package com.stackroute;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

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

        XmlBeanFactory

    System.out.println(movie == movieB);
    }
}
