package ru.geekbrains.java2;

public class Cat implements RunAble {

    private String name;
    private int runAbility;
    private int jumpAbility;

    public Cat() {
        this.name = "Пушистик";
        this.runAbility= 200;
        this.jumpAbility = 3;
    }
    public Cat(String name, int runAbility, int jumpAbility) {
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    public void run(int h) {
        System.out.println("Кот "+ name +" пробежал"+ h +" метров" );
    }

    public void jump(int h) {
        System.out.println("Кот "+ name +" прыгнул на "+ h +" метров");
    }

    public String getName () {
        return this.name;
    }

    public int getRunAbility () {
        return this.runAbility;
    }

    public int getJumpAbility () {
        return this.jumpAbility;
    }

}
