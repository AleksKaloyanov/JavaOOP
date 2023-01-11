package WorkingWithAbstraction.SystemStudent;

import WorkingWithAbstraction.SystemStudent.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        boolean hasToExit = false;

        while (!hasToExit) {
            String[] input = scanner.nextLine().split(" ");
            String executionResult = studentSystem.ParseCommand(input);

            hasToExit = executionResult != null && executionResult.equals("Exit");

            if (!hasToExit && executionResult != null) {
                System.out.println(executionResult);
            }
        }
    }
}
