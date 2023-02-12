package com.hello.gof.observer;

public class Actor implements  Subscriber {
    private String name;

    public Actor(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
