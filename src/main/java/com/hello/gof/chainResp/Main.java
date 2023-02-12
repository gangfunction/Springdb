package com.hello.gof.chainResp;

public class Main {
    private RequestHandler requestHandler;

    public Main(RequestHandler requestHandler) {
        this.requestHandler=requestHandler;
    }
    public void doWork(){
        Request request= new Request("오우");
        requestHandler.handle(request);

    }
    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Main main = new Main(chain);
        main.doWork();


    }
}
