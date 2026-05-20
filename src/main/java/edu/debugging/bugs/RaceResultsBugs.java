package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * The program analyzes the times of several runners:
 * - Name of the winner.
 * - Winner's time.
 * - Average time.
 * - Number of runners who finished in under 60 minutes.
 * - Number of disqualified runners.
 *
 * A runner is disqualified if their time is less than or equal to 0.
 *
 * This program contains intentional errors.
 */
public class RaceResultsBugs {

    public static void main(String[] args) {
        String[] runners = {"Anna", "Louis", "Martha", "Peter", "Lucy"};
        double[] times = {58.4, 62.1, 55.8, -1.0, 59.9};

        printResults(runners, times);
    }

    public static void printResults(String[] runners, double[] times) {
        String winner = "";
        double bestTime = 0;
        double sum = 0;
        int validRunners = 0;
        int under60 = 0;
        int disqualified = 0;

        for (int i = 0; i <= times.length; i++) {
            double time = times[i];

            if (time < 0) {
                disqualified++;
            }

            if (time > 0) {
                validRunners++;
                sum += time;

                if (time > bestTime) {
                    bestTime = time;
                    winner = runners[i];
                }

                if (time <= 60) {
                    under60++;
                }
            }
        }

        double average = sum / runners.length;

        System.out.println("Winner: " + winner);
        System.out.println("Best time: " + bestTime);
        System.out.println("Average time: " + average);
        System.out.println("Runners under 60 minutes: " + under60);
        System.out.println("Disqualified runners: " + disqualified);
    }
}
