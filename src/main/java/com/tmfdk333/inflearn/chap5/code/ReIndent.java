package com.tmfdk333.inflearn.chap5.code;

public class ReIndent {
    public void rename() {
        String name = "a";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
        System.out.println("변수값: " + name);
    }
}
