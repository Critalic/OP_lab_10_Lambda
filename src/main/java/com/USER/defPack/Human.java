package com.USER.defPack;

public class Human {

    String name;
    int age;
    String occupation;
    String hobby;

    public Human(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Human() {
        name = "Some name";
        age = 2;
        occupation = "some interesting organization";
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;

    }
    public void setHobby() {
        this.hobby = "some fascinating ACTIVITY";
    }

    public String hobbyToString () {
        if(hobby !=null) {
            return "\nHis/her hobby is " + this.getHobby();
        }
        else return "\nHe/she doesn't have a hobby";
    }

    public String getHobby() {
        if(hobby == null) setHobby();
        return hobby;
    }

    @Override
    public String toString() {

        return "Human " + name + ", who is " + age + ", works at/in " + occupation + this.hobbyToString() + "\n";

    }

}