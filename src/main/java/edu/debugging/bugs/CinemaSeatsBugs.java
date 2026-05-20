package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * The program represents a cinema room using a matrix:
 * - '.' means a free seat.
 * - 'X' means an occupied seat.
 * - Rows and columns are entered starting from 1.
 * - The room has 4 rows and 5 columns.
 * - The program must reserve valid seats and reject out-of-range reservations.
 * - It must also count how many seats remain free.
 *
 * This program contains intentional errors.
 */
public class CinemaSeatsBugs {

    public static void main(String[] args) {
        char[][] seats = createRoom(4, 5);

        reserve(seats, 1, 1);
        reserve(seats, 2, 3);
        reserve(seats, 4, 5);
        reserve(seats, 5, 1);

        printRoom(seats);

        System.out.println("Free seats: " + countFreeSeats(seats));
    }

    public static char[][] createRoom(int rows, int cols) {
        char[][] seats = new char[rows][cols];

        for (int r = 0; r <= seats.length; r++) {
            for (int c = 0; c < seats[0].length; c++) {
                seats[r][c] = '.';
            }
        }

        return seats;
    }

    public static boolean reserve(char[][] seats, int row, int col) {
        if (row < 1 || row > seats[0].length || col < 1 || col > seats.length) {
            System.out.println("Invalid seat: row " + row + ", col " + col);
            return false;
        }

        int r = col - 1;
        int c = row - 1;

        if (seats[r][c] == 'X') {
            System.out.println("Seat already reserved.");
            return false;
        }

        seats[r][c] = 'X';
        return true;
    }

    public static int countFreeSeats(char[][] seats) {
        int free = 0;

        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c] == 'X') {
                    free++;
                }
            }
        }

        return free;
    }

    public static void printRoom(char[][] seats) {
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                System.out.print(seats[c][r] + " ");
            }
            System.out.println();
        }
    }
}
