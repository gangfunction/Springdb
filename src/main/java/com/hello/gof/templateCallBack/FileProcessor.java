package com.hello.gof.templateCallBack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private final String path;

    public FileProcessor(String path) {
        this.path = path;
    }
    public int process(Operator operator){
        try(
            BufferedReader reader = new BufferedReader(new FileReader(path))) {
                int answer = 0;
                String line;
                while((line =reader.readLine())!=null){
                    answer = operator.getAnswer(answer, Integer.parseInt(line));
                }
                return answer;
            }
         catch (IOException e){
                throw new IllegalArgumentException(e);
        }
    }

}
