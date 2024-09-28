package org.suraj;

public class Dev {
    private Laptop laptop;
    private int age;
    public Dev(){
        System.out.println("DEV");
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }
    public Laptop setLaptop(){
        this.laptop=laptop;
    }
    public Dev(Laptop laptop){
        this.laptop=laptop;
        System.out.println("DEv 1 Con");
    }

    public void build(){
        System.out.println("Working on Spring with out SPring Boot");
        laptop.complie();
    }
}
