package com.hello.gof.chainResp;

public class AuthRequestHandler extends RequestHandler {
    public AuthRequestHandler(RequestHandler handler) {
        super(handler);
    }
    @Override
    public void handle(Request request){
        System.out.println("인증이 되었는가?");
        System.out.println(request);
        super.handle(request);
    }
}
