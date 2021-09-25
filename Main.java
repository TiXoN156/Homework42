package com.company;

public class Main {

    public static void main(String[] args) {
        Team team = new Team();
        Course course = new Course();
        course.doIt(team);
        team.getResultsWin();
//        team.getResultsAll();
    }
}
