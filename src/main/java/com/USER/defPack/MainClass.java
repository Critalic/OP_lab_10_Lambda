package com.USER.defPack;

import java.util.Comparator;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        Comparator<Human> nameComparator = (Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0);
        Comparator<Human> reverseComparator = nameComparator.reversed();
        Comparator<Human> ageComparatorComparator = nameComparator.thenComparing((Human o1, Human o2) -> o1.age - o2.age);
        Comparator<Human> nullsFirstComparator = Comparator.nullsFirst((Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0));
        Comparator<Human> nullsLastComparator = Comparator.nullsLast((Human o1, Human o2) -> o1.name.charAt(0) - o2.name.charAt(0));

        TreeSet<Human> people = new TreeSet<>( ageComparatorComparator); // change comparator here

        Student ivan = new Student("Ivan", 19, "KPI");
        Human petro = new Human("Petro", 34,  "NAU");
        Student pedro = new Student();
        Student serhiy = new Student("Serhiy", 18, "LNU");
        Student nobody = null;

        people.add(ivan);
        people.add(pedro);
        people.add(petro);
//        people.add(nobody);
        people.add(serhiy);
        System.out.println(people);
    }


}
