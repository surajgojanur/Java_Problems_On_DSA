package com.SpringDependency.SpringDependency2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Laptop laptop;

    public void Dev(Laptop laptop){
        this.laptop=laptop;
    }

    public void build(){
        laptop.complie();
        System.out.printf("Working on Basic Stuffff");
    }
}
