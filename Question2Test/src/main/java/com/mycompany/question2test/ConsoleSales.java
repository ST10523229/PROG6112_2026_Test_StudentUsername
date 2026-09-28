/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2test;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleDeviceType, String storeName, int totalAmountSales) {
        super(consoleDeviceType, storeName, totalAmountSales);
    }

      public void printReport(){
        System.out.println("Select the beverage type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX ");
          System.out.println("3) SWITCH");
          
          System.out.println("Enter the store: Number 1 Electronics Store");
          System.out.println("Enter the total sales of PS5 consoles for Number 1 Electronics Store: 500");
        
        System.out.println("CONSOLE SALES REPORT ");
        System.out.println("************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println(" TOTAL SALES: " + getTotalSales());
        System.out.println("************************");
    }
 }  
    

