package com.hello.gof.strategy;

public class Normal implements VideoImageStrategy {
    @Override
    public void Video() {
        System.out.println("Video");
    }

}
