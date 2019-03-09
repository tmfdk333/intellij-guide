package com.tmfdk333.inflearn.chap2.special;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {
    public void copyFocus() {
        List<String> members = new ArrayList<>();

        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
    }
}
