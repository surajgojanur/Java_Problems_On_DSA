package org.suraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    ApplicationContext context = new ClassPathXmlApplicationContext();
    Dev obj  = context.getBean(Dev.class);
    obj.build();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
