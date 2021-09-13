/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String state;
        double final_amount, tax = 0, order_amount;
        final double tax_rate = 0.055f;

        System.out.print("What is the order amount? ");
        order_amount = user_input.nextInt();
        System.out.print("What is the state? ");
        state = user_input.next();

        final_amount=order_amount;

        if (state.equals("WI"))
        {
            tax = order_amount * tax_rate;
            final_amount = order_amount + tax;
        }

        System.out.println(String.format("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f", order_amount, tax, final_amount ));
    }
}
