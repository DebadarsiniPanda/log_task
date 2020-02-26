package com.epam.log;

import static java.lang.Math.pow;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	
	public static final Logger logger=LogManager.getLogger(Interest.class);
	
  	private float principal; 
    private float rate;     
    private float years;    
    
    
    public Interest(){
    	
        Scanner sc = new Scanner(System.in);
        //PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        logger.info("Enter the principal amount = ");
        this.principal = sc.nextFloat();
        logger.info("Enter the rate = ");
        this.rate = sc.nextFloat();
        logger.info("Enter the years (decimal value possible) = ");
        this.years = sc.nextFloat();
    }
  
    void simple_interest(){
        //PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        logger.info("The Simple Interest = "+((this.principal*this.rate*this.years)/100)+"\n");
    }
    
    void compound_interest() {
        //PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        logger.info("The compound interest = " + (this.principal * pow((1 + (this.rate / 100)), this.years))+"\n");
    }
    
    void calculate(){
        Scanner sc = new Scanner(System.in);
       // PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        logger.info("Press 1 to calculate simple interest \n");
        logger.info("Press 2 to calculate compound interest \n");
        logger.info("Enter your choice = ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:this.simple_interest();
                    break;
            case 2: this.compound_interest();
                    break;
            default: logger.info("Wrong choice\n");
        }
    }
}


