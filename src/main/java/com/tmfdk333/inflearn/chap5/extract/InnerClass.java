package com.tmfdk333.inflearn.chap5.extract;

import com.tmfdk333.inflearn.chap5.code.Team;

public class InnerClass {
    public void moveInnerClass() {
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }
}
