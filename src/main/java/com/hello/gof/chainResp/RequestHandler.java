package com.hello.gof.chainResp;

public abstract class RequestHandler {
    private RequestHandler Handler;
    public RequestHandler(RequestHandler handler) {
        this.Handler = handler;
    }
    public void handle(Request request){
        if(Handler != null){
            Handler.handle(request);
        }
    }
}
