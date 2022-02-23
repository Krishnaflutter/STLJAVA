package com.company;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Student> set = new LinkedHashSet<>();
        // this stores in the order we enter the items to set
        // HashSet stores in a random order

        set.add(new Student("Krishna",3));
        set.add(new Student("Divya",1));
        set.add(new Student("Raju",4));
        set.add(new Student("Divya",2));
        set.add(new Student("Anuj",1));

        System.out.println(set);
    }
}

class Student{
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
