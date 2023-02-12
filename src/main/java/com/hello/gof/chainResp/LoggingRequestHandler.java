package com.hello.gof.chainResp;

public class LoggingRequestHandler extends RequestHandler {
    public LoggingRequestHandler(RequestHandler handler) {
        super(handler);
    }
    @Override
    public void handle(Request request){
        System.out.println("로깅이 되었는가?");
        System.out.println(request);
        super.handle(request);
    }
}
