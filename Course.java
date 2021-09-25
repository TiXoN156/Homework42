package com.company;

public class Course {
double[] needDoIt = new double[]{300.0, 0.5, 8.0};

    public Course() {
    }

    public void doIt(Team team){
        for (int i = 0; i < team.animals.length; i++){
            team.results[i* needDoIt.length] = team.animals[i].run((int) needDoIt[0]);
            team.results[i* needDoIt.length+1] = team.animals[i].jump(needDoIt[1]);
            team.results[i* needDoIt.length+2] = team.animals[i].swim((int) needDoIt[2]);
        }
    }
}
