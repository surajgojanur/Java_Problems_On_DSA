package com.SpringDependency.SpringDependency2;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void complie(){
        System.out.println("Laptop !!!");
    }
}
