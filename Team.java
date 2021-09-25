package com.company;

public class Team {
    public Animal[] animals = new Animal[4];
    public String[] results = new String[animals.length*3];
    String teamName = "Crazy Dogs and Cats";

    public Team() {
        animals[0] = new Dog("Шарик");
        animals[1] = new Dog("Тузик");
        animals[2] = new Cat("Барсик");
        animals[3] = new Cat("Мурзик");
    }

    public void getResultsWin(){
        System.out.println(String.format("Команда %s, прошли дистанцию:", teamName));
        for (int i = 0; i < results.length; i++){
            if (results[i].contains("true")){
                System.out.println(results[i]);
            }
        }
    }

    public void getResultsAll(){
        System.out.println(String.format("Команда %s, результаты всех участников:", teamName));
        for (int i = 0; i < results.length; i++){
            System.out.println(results[i]);
        }
    }
}
