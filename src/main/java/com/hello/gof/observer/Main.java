package com.hello.gof.observer;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        Actor actor1 = new Actor("gangju");
        Actor actor2 = new Actor("blackpearl");

        server.register("이북",actor1);
        server.register("이북",actor2);
        server.register("이남",actor1);
        server.sendMessage(actor1, "이북", "리더기");
        server.sendMessage(actor2, "이남", "평양냉면");
        server.unregister("이북",actor2);

    }
}
