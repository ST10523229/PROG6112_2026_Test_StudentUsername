/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2test;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class Question2Test {

    public static void main(String[] args) {
 //Declarations
       String consoleDeviceType;
  String storeName;
   int totalAmountSales;
       
       Scanner input = new Scanner(System.in);
       
       //inputs
        System.out.println("Enter the console Device Type: ");
        consoleDeviceType = input.nextLine();
        System.out.println("Enter the store name: ");
        storeName = input.nextLine();
        System.out.println("Enter the total amount of sales");
        totalAmountSales = Integer.parseInt(input.nextLine());
        
        ConsoleSales reports = new ConsoleSales(consoleDeviceType, storeName, totalAmountSales);
                
                reports.printReport();
       
    }
}
