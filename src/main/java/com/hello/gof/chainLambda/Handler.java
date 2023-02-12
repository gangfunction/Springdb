package com.hello.gof.chainLambda;

public interface Handler<T> {
    boolean handle(T t);
}
