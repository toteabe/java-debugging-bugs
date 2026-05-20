package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * El programa calcula multas por retraso en la devolución de libros.
 * Reglas:
 * - Si un libro no tiene retraso, la multa es 0 €.
 * - Cada día de retraso cuesta 0,25 €.
 * - Si el libro tiene más de 500 páginas y hay retraso, se añade una penalización fija de 2 €.
 * - Se debe mostrar la multa de cada préstamo.
 * - Se debe mostrar el total recaudado.
 * - Se debe contar cuántos libros tienen retraso.
 *
 * Este programa contiene errores intencionados.
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
