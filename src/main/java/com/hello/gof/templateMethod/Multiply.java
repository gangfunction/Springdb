package com.hello.gof.templateMethod;

public class Multiply extends FileProcessor{
    public Multiply(String path) {
        super(path);
    }
    @Override
    protected int getAnswer(int result, int line){
        return result * line;
    }
}
