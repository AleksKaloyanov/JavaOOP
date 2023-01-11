package WorkingWithAbstraction.SystemStudent;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByNames;

    public StudentSystem() {
        this.studentsByNames = new HashMap<>();
    }

    public Map<String, Student> getStudentsByNames() {
        return this.studentsByNames;
    }

    public String ParseCommand(String[] args) {
        String cmd = args[0];

        String result = null;

        if (cmd.equals("Create")) {
            Student student = CreateStudentCommand.createStudent(args);
            studentsByNames.putIfAbsent(student.getName(), student);
        } else if (cmd.equals("Show")) {
            ShowStudentCommand showStudentCommand = new ShowStudentCommand(studentsByNames.get(args[1]));
            result = showStudentCommand.execute();
        } else {
            result = new ExitCommand().execute();
        }

        return result;
    }
}
