package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * El programa debe mostrar un informe de calificaciones:
 * - Nota media.
 * - Nota máxima.
 * - Nota mínima.
 * - Número de aprobados.
 * - Número de sobresalientes.
 * - Si el grupo supera la evaluación global.
 *
 * Reglas:
 * - Aprueba quien obtiene una nota mayor o igual que 5.
 * - Tiene sobresaliente quien obtiene una nota mayor o igual que 9.
 * - El grupo supera la evaluación global si la media es mayor o igual que 5
 *   y no hay ninguna nota inferior a 4.
 *
 * Este programa contiene errores intencionados.
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
