package com.tmfdk333.inflearn.chap5.extract;

import java.util.List;

public class Method {
    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    private void print(String s) {
        if("tmfdk333".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }
        public long getPrice() {
            return price;
        }
        public List<String> getAuthors() {
            return authors;
        }
    }
}
