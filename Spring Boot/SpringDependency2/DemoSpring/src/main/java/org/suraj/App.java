package org.suraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
            //suraj
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj  =(Dev) context.getBean("dev");
//        obj.build();

    }
}
