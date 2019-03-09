package com.tmfdk333.inflearn.chap6;

import lombok.Getter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ConditionalBreakTest {
    @Test
    public void 조건으로_Break() {
        List<Book> books = Arrays.asList(
                new Book("토비의스프링"),
                new Book("자바 ORM 표준 JPA 프로그래밍"),
                new Book("클라우드 네이티브 자바")
        );

        for (Book book : books) {
            System.out.println(book.title);
        }
    }

    @Getter
    public static class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }
    }
}
