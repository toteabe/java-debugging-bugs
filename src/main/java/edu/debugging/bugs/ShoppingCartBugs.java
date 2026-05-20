package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * El programa debe calcular el total de un carrito:
 * - El subtotal se calcula multiplicando precio por unidades.
 * - Si el subtotal es mayor o igual que 100 €, se aplica un 10 % de descuento.
 * - Si el subtotal es menor que 50 €, se añaden 4,99 € de gastos de envío.
 * - El IVA es del 21 % y se aplica después del descuento y los gastos de envío.
 * - El total final debe incluir subtotal, descuento, envío e IVA.
 *
 * Este programa contiene errores intencionados.
 */
public class ShoppingCartBugs {

    public static void main(String[] args) {
        double[] prices = {12.50, 3.25, 99.99, 5.00};
        int[] units = {2, 4, 1, 3};

        printInvoice(prices, units);
    }

    public static void printInvoice(double[] prices, int[] units) {
        double subtotal = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            subtotal += prices[i] + units[i];
        }

        double discount = 0;
        if (subtotal > 100) {
            discount = subtotal * 0.10;
        }

        double shipping = 0;
        if (subtotal > 50) {
            shipping = 4.99;
        }

        double vat = subtotal * 0.21;
        double total = subtotal - discount + shipping + vat;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Shipping: " + shipping);
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
    }
}
