/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.question1test;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class Question1Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        // declaring two  and one dimensional arrays
        String[] cities = {"Cape town ", " Port Elizabeth ", " Pretoria "}; //row IS THE CITY
        String[] consoles = {" PS5 ", " XBOX ", " SWITCH "}; //col is the vehicle
        int[][] salesData = new int[cities.length][consoles.length];

        //Populate 2D ARRAY
        for (int row = 0; row < salesData.length; row++) {
            for (int col = 0; col < salesData[row].length; col++) {
                System.out.print(" Enter the number of " + consoles[col] + " sales data for " + cities[row]);
                salesData[row][col] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------");

        System.out.println("\t\t" + "PS5\t" + "XBOX\t" + "SWITCH\t");
        for (int row = 0; row < salesData[row].length; row++) {
            System.out.print(cities[row] + "\t");
            for (int col = 0; col < salesData[row].length; col++) {
                System.out.print(salesData[row][col] + "\t");

            }
            System.out.println();

        }
        System.out.println("----------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------");

        double highestTotal = 0;
        String cityWithMostSales = "";

        for (int row = 0; row < salesData.length; row++) {//row
            total = 0;
            for (int col = 0; col < salesData[row].length; col++) {//column

                total += salesData[row][col];
            }
            System.out.println(cities[row] + total);

            if (total > highestTotal) {
                highestTotal = total;

                cityWithMostSales = cities[row];
            }
        }

        System.out.println("City with the most sales: " + cityWithMostSales);
        System.out.println("___________________________________________________");

    }

}
