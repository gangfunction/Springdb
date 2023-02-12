package com.hello.gof.templateMethod;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    protected abstract int getAnswer(int answer,int  line);

    private final String path;
    public FileProcessor(String path) {
        this.path = path;
    }
    public final int process(){
        try(
            BufferedReader reader = new BufferedReader(new FileReader(path))) {
                int answer = 0;
                String line;
                while((line =reader.readLine())!=null){
                    answer = getAnswer(answer, Integer.parseInt(line));
                }
                return answer;
            }
         catch (IOException e){
                throw new IllegalArgumentException(e);
        }
    }
}
