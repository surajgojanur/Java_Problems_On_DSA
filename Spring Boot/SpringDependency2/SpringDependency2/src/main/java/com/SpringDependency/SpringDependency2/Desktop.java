package com.SpringDependency.SpringDependency2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void complie(){
        System.out.println("Laptop !!! Desktop ");
    }
}
