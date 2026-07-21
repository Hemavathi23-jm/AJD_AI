import java.util.Scanner;

public class GradeProcessing {

    // Function 1: Calculate average
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Function 2: Determine grade
    public static String determineGrade(double average) {
        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "F";
    }

    // Function 3: Check pass/fail
    public static boolean isPassed(String grade) {
        return !grade.equals("F");
    }

    // Function 4: Generate report
    public static void generateReport(String name, int[] marks) {
        double average = calculateAverage(marks);
        String grade = determineGrade(average);
        boolean passed = isPassed(grade);

        System.out.println("\n----- Student Report -----");
        System.out.println("Name    : " + name);

        System.out.print("Marks   : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\nAverage : " + average);
        System.out.println("Grade   : " + grade);
        System.out.println("Passed  : " + passed);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        generateReport(name, marks);

        sc.close();
    }
}