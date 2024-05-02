import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Grade Calculator!");

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        // Arrays to store marks and grades
        int[] marks = new int[numOfSubjects];
        char[] grades = new char[numOfSubjects];

        // Input marks for each subject
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Assign grades based on average percentage
        for (int i = 0; i < numOfSubjects; i++) {
            if (averagePercentage >= 90) {
                grades[i] = 'A';
            } else if (averagePercentage >= 80) {
                grades[i] = 'B';
            } else if (averagePercentage >= 70) {
                grades[i] = 'C';
            } else if (averagePercentage >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        System.out.println("\nSubject-wise Grades:");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }

        scanner.close();
    }
}
