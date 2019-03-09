package com.tmfdk333.inflearn.chap2.special;

import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {
    public void increaseForcus() {
        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2018, 5, 14));
    }
}
