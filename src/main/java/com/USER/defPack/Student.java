package com.USER.defPack;

public class Student extends Human {

    String university;

    public Student(String name, int age, String occupation, String university)  {
        super(name, age, occupation);
        this.university = university;
    }
    public Student(String name, int age, String university) {
        super(name, age);
        this.university= university;
    }

    public Student() {
        super();
    }



    @Override
    public String toString() {
        if (occupation==null && university !=null) {
            return "Student " + name + ", who is " + age + ", studies at " + university + this.hobbyToString() + "\n";
        } else if(university == null) {
            return "Student " + name + ", who is " + age + ", studies at " + occupation + this.hobbyToString()+ "\n";
        }
        else {
            return "Student " + name + ", who is " + age + ", studies at " + university + " and works at " + occupation + this.hobbyToString()+ "\n";
        }

    }

}
