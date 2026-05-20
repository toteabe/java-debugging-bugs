package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * El programa analiza los tiempos de varios corredores:
 * - Nombre del ganador.
 * - Tiempo del ganador.
 * - Tiempo medio.
 * - Número de corredores que han terminado en menos de 60 minutos.
 * - Número de corredores descalificados.
 *
 * Un corredor está descalificado si su tiempo es menor o igual que 0.
 *
 * Este programa contiene errores intencionados.
 */
public class RaceResultsBugs {

    public static void main(String[] args) {
        String[] runners = {"Ana", "Luis", "Marta", "Pedro", "Lucía"};
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
