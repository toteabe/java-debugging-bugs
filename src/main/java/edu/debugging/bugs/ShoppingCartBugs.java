package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * The program must calculate the total of a shopping cart:
 * - The subtotal is calculated by multiplying price by units.
 * - If the subtotal is greater than or equal to €100, a 10% discount is applied.
 * - If the subtotal is less than €50, €4.99 shipping costs are added.
 * - VAT is 21% and is applied after the discount and shipping costs.
 * - The final total must include subtotal, discount, shipping, and VAT.
 *
 * This program contains intentional errors.
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
