package com.company;

public class Cat extends Animal{
    private String name;
    private final String type = "Кот";
    private final int RUN_MAX = 200;
    private final double JUMP_MAX = 2.0;
    private final int SWIM_MAX = 0;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String run(int run){
        String result;
        if (run <= RUN_MAX){
            result = String.format("true: %s %s пробежал дистанцию %s м.", type, name, run);
        }
        else {
            result = String.format("false: %s %s не пробежал дистанцию %s м.", type, name, run);
        }
        return result;
    }

    public String jump(double jump){
        String result;
        if (jump <= JUMP_MAX){
            result = String.format("true: %s %s перепрыгнул препятствие высотой %s м.", type, name, jump);
        }
        else {
            result = String.format("false: %s %s не перепрыгнул препятствие высотой %s м.", type, name, jump);
        }
        return result;
    }

    public String swim(int swim){
        String result;
        if (swim <= SWIM_MAX){
            result = String.format("true: %s %s проплыл дистанцию %s м.", type, name, swim);
        }
        else {
            result = String.format("false: %s %s не проплыл дистанцию %s м.", type, name, swim);
        }
        return result;
    }
}
