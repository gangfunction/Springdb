package com.hello.gof.chainResp;

public class PrintRequestHandler extends RequestHandler {
    public PrintRequestHandler(RequestHandler handler) {
        super(handler);
    }
    @Override
    public void handle(Request request){
        System.out.println("출력이 되었는가?");
        System.out.println(request);
        super.handle(request);
    }
}
