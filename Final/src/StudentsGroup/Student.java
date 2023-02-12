package StudentsGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int age;
    private List<Integer> marks;
    private boolean isGraduate;

    public Student(String name, String surname, int age,ArrayList<Integer> marks) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.marks = marks;
        this.isGraduate = false;
    }

    public Student(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(!isGraduate) {
            this.name = name;
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        if(!isGraduate) {
            this.surname = surname;
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(!isGraduate) {
            this.age = age;
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public List<Integer> getMarks() {
        return this.marks;
    }

    public void setMark(int index, int mark) {
        if(!isGraduate) {
            this.marks.set(index, mark);
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public void addMark(int mark) {
        if(!isGraduate) {
            this.marks.add(mark);
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }

    }

    public boolean isGraduate() {
        return this.isGraduate;
    }

    public void graduateStudent() {
        this.marks = Collections.unmodifiableList(this.marks);
        this.isGraduate = true;
    }

    @Override
    public String toString() {
        return "Student " +
                "name= " + this.name +
                ", surname= " + this.surname +
                ", age= " + this.age +
                ", marks= " + this.marks +
                ", graduate=" + this.isGraduate;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Student) obj).name) &&
                this.surname.equals(((Student) obj).surname) &&
                this.age == ((Student) obj).age &&
                this.marks.equals(((Student) obj).marks) &&
                this.isGraduate == ((Student) obj).isGraduate;
    }
}
