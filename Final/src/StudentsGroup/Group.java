package StudentsGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    private final String tittle;
    private List<Student> students;
    private boolean isGraduated;

    public Group(String tittle, ArrayList<Student> students) {
        this.tittle = tittle;
        this.students = students;
        this.isGraduated = false;
    }

    public Group() {
        this.tittle = "";
    }

    public String getTittle() {
        return this.tittle;
    }

    public boolean getIsGraduated() {
        return isGraduated;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public Student getStudent(int position) {
        return this.students.get(position);
    }

    public void addStudent(Student newStudent) {
        if(!isGraduated) {
            this.students.add(newStudent);
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public void removeStudent(int positionInList) {
        if(!isGraduated) {
            this.students.remove(positionInList);
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public void removeStudent(Student expelledStudent) {
        if(!isGraduated) {
            this.students.remove(expelledStudent);
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    public void graduateGroup() {
        if(!isGraduated) {
            this.students = Collections.unmodifiableList(this.students);
            this.isGraduated = true;
            for(Student student : this.students) {
                student.graduateStudent();
            }
        } else {
            System.out.println("This group is graduated. Data has not been changed!");
        }
    }

    @Override
    public String toString() {
        return "Group " +
                "numberGroup= " + this.tittle +
                ", students= " + this.students;
    }

    @Override
    public boolean equals(Object obj) {
        return this.tittle.equals(((Group) obj).tittle) &&
                this.students.equals(((Group) obj).students);
    }
}
