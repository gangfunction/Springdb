package com.hello.gof.strategy;

public class VideoImageV1 {
    VideoImageStrategyV1 strategyV1;

    public VideoImageV1(VideoImageStrategyV1 strategyV1) {
        this.strategyV1 = strategyV1;
    }

    public void Video() {
        strategyV1.Video();
    }

}
