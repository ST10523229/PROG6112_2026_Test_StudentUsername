/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2test;

/**
 *
 * @author emeris
 */
public abstract class Consoles implements IConsole{
  //Data members
    private String consoleDeviceType;
  private String storeName;
  private int totalAmountSales;

    public Consoles(String consoleDeviceType, String storeName, int totalAmountSales) {
        this.consoleDeviceType = consoleDeviceType;
        this.storeName = storeName;
        this.totalAmountSales = totalAmountSales;
    }
@Override
    public String getConsoleType() {
        return consoleDeviceType;
    }
@Override
    public String getStore() {
        return storeName;
    }
@Override
    public int  getTotalSales(){
        return totalAmountSales;
    }
  
  

    
    
    
}
