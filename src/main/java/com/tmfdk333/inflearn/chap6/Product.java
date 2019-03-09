package com.tmfdk333.inflearn.chap6;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private long amount;

    @Column
    private String name;

    @Builder
    public Product(long amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
