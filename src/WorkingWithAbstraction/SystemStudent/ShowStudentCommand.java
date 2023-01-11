package WorkingWithAbstraction.SystemStudent;

public class ShowStudentCommand {
    private Student student;

    public ShowStudentCommand(Student student) {
        this.student = student;
    }

    public String execute() {
        return student != null ? student.toString() : null;
    }
}
