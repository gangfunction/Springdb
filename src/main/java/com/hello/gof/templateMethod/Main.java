package com.hello.gof.templateMethod;

public class Main {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int answer= fileProcessor.process();
        System.out.println(answer);
    }
}
