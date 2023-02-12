package com.hello.gof.templateCallBack;


public class Main {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int answer= fileProcessor.process(Integer::sum);
        System.out.println(answer);
    }
}
