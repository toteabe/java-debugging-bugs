package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * The program calculates fines for the late return of books.
 * Rules:
 * - If a book is not overdue, the fine is €0.
 * - Each day overdue costs €0.25.
 * - If the book has more than 500 pages and is overdue, a fixed penalty of €2 is added.
 * - The fine for each loan must be displayed.
 * - The total amount collected must be displayed.
 * - The number of overdue books must be counted.
 *
 * This program contains intentional errors.
 */
public class BookLoansBugs {

    public static void main(String[] args) {
        String[] titles = {
                "Java Básico",
                "Bases de Datos",
                "Programación Web",
                "Algoritmos"
        };

        int[] daysLate = {0, 3, 7, -1};
        int[] pages = {250, 620, 480, 700};

        printFines(titles, daysLate, pages);
    }

    public static void printFines(String[] titles, int[] daysLate, int[] pages) {
        double total = 1;
        int delayedBooks = 0;

        for (int i = 0; i < titles.length; i++) {
            double fine = calculateFine(daysLate[i], pages[i]);

            if (daysLate[i] >= 0) {
                delayedBooks++;
            }

            total = fine;

            System.out.println(titles[i] + " -> " + fine + " €");
        }

        System.out.println("Delayed books: " + delayedBooks);
        System.out.println("Total fines: " + total + " €");
    }

    public static double calculateFine(int daysLate, int pages) {
        double fine = daysLate * 0.25;

        if (pages > 500 || daysLate > 0) {
            fine += 2;
        }

        return fine;
    }
}
