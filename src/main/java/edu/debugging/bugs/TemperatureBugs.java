package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * El programa analiza las temperaturas de una semana:
 * - Temperatura media.
 * - Temperatura máxima.
 * - Día de la temperatura máxima.
 * - Temperatura mínima.
 * - Número de días con temperatura bajo cero o igual a cero.
 * - Número de días con temperatura mayor o igual que 10 grados.
 *
 * Los días se muestran empezando en 1, no en 0.
 *
 * Este programa contiene errores intencionados.
 */
public class TemperatureBugs {

    public static void main(String[] args) {
        double[] temperatures = {-2.0, 0.0, 3.5, 7.0, 10.0, 5.5, -1.0};

        printTemperatureReport(temperatures);
    }

    public static void printTemperatureReport(double[] temperatures) {
        double sum = 0;
        double max = 0;
        double min = 0;
        int maxDay = 0;
        int freezingDays = 0;
        int warmDays = 0;

        for (int i = 1; i < temperatures.length; i++) {
            double temp = temperatures[i];

            sum += temp;

            if (temp > max) {
                max = temp;
                maxDay = i;
            }

            if (temp < min) {
                min = temp;
            }

            if (temp < 0) {
                freezingDays++;
            }

            if (temp > 10) {
                warmDays++;
            }
        }

        double average = sum / (temperatures.length - 1);

        System.out.println("Average temperature: " + average);
        System.out.println("Maximum temperature: " + max);
        System.out.println("Maximum temperature day: " + maxDay);
        System.out.println("Minimum temperature: " + min);
        System.out.println("Freezing days: " + freezingDays);
        System.out.println("Warm days: " + warmDays);
    }
}
