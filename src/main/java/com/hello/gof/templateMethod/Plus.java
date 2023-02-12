package com.hello.gof.templateMethod;

public class Plus extends FileProcessor{
    public Plus(String path) {
        super(path);
    }
    @Override
    protected int getAnswer(int result, int line){
        return result + line;
    }

}
