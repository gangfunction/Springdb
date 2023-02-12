package com.hello.gof.strategy;

public class Main {
    public static void main(String[] args){
        //파라미터로 주입하였을때 전략패턴
        VideoImage videoImage = new VideoImage();
        videoImage.Video(new Normal());
        videoImage.Video(() -> System.out.println("wow"));

        //생성자로 주입했을때 전략패턴
        VideoImageV1 videoImageV1 = new VideoImageV1(new NormalV1());
        videoImageV1.Video();
        VideoImageV1 wow2 = new VideoImageV1(() -> System.out.println("wow2"));
        wow2.Video();

    }
}
