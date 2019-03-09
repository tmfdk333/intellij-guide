package com.tmfdk333.inflearn.chap5.code;

public class ReturnType {
    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }
    private Integer calculate() {
        return 1;
    }
}
