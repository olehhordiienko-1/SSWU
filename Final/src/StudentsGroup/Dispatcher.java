package StudentsGroup;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        final Student first = new Student("Oleh", "Hordiienko", 19, new ArrayList<>(List.of(4, 3, 4, 5, 3, 3, 4)));
        final Student second = new Student("Klym", "Kovalenko", 18, new ArrayList<>(List.of(3, 5, 3, 4, 2, 5, 4)));
        final Student third = new Student("Arseniy", "Lypoviy", 20, new ArrayList<>(List.of(3, 3, 3, 3, 3, 3, 4)));
        final Student fourth = new Student("Daria", "Alyokhina", 19, new ArrayList<>(List.of(4, 5, 5, 5, 5, 5, 4)));
        final Student fifth = new Student("Serhii", "Ischeryakov", 18, new ArrayList<>(List.of(3, 5, 4, 5, 5, 5, 4)));
        final Student newStudent = new Student("Dmytro", "Yeremenko", 19, new ArrayList<>(List.of(3,3,3,3,3,3,3)));

        final Group group = new Group("CS34", new ArrayList<>(List.of(first, second, third, fourth, fifth)));
        group.addStudent(newStudent);
        group.removeStudent(first);
        System.out.println(group);

        group.getStudent(3).setSurname("Narizhniy");
        System.out.println(group);

        group.graduateGroup();
        group.addStudent(first);
        group.getStudent(1).setSurname("Narizhniy");
        System.out.println(group);
    }
}
