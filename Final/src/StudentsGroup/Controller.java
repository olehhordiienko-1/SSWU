package StudentsGroup;

public class Controller {
    public static boolean addNewStudentToGroup(Group group, Student student) {
        try {
            group.getStudents().add(student);
            System.out.println(group);
            return true;
        } catch (UnsupportedOperationException exception) {
            System.out.println("[log] invalid operation, error, list may be unmodifiableList!");
        }
        System.out.println(group);
        return false;
    }
}
