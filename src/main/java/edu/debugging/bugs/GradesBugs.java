package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * The program must display a grade report:
 * - Average grade.
 * - Highest grade.
 * - Lowest grade.
 * - Number of passed students.
 * - Number of students with an excellent grade.
 * - Whether the group passes the global evaluation.
 *
 * Rules:
 * - A student passes if they get a grade greater than or equal to 5.
 * - A student gets an excellent grade if they get a grade greater than or equal to 9.
 * - The group passes the global evaluation if the average grade is greater than or equal to 5
 *   and there is no grade lower than 4.
 *
 * This program contains intentional errors.
 */
public class GradesBugs {

    public static void main(String[] args) {
        double[] grades = {7.5, 4.0, 9.2, 5.0, 3.8, 6.5};
        printReport(grades);
    }

    public static void printReport(double[] grades) {
        double sum = 0;
        double max = 0;
        double min = 0;
        int passed = 1;
        int excellent = 0;
        boolean hasLowGrade = false;

        for (int i = 1; i <= grades.length; i++) {
            double grade = grades[i];

            sum += grade;

            if (grade > max) {
                max = grade;
            }

            if (grade < min) {
                min = grade;
            }

            if (grade > 5) {
                passed++;
            }

            if (grade > 9) {
                excellent++;
            }

            if (grade <= 4) {
                hasLowGrade = true;
            }
        }

        double average = sum / grades.length;

        System.out.println("Average: " + average);
        System.out.println("Max grade: " + max);
        System.out.println("Min grade: " + min);
        System.out.println("Passed students: " + passed);
        System.out.println("Excellent students: " + excellent);

        if (average > 5 && !hasLowGrade) {
            System.out.println("The group passes the global evaluation.");
        } else {
            System.out.println("The group does not pass the global evaluation.");
        }
    }
}
