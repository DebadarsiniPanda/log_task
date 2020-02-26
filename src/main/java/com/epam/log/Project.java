package com.epam.log;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Project {
	
	public static final Logger logger=LogManager.getLogger(Project.class);

public static void main( String[] args ) {
    Scanner sc = new Scanner(System.in);
  //  PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
    int c = 1;
    do {
        logger.info("Enter your choice \n");
        logger.info("Press 1 to calculate (Simple/Compound) Interest\n");
        logger.info("Press 2 to run House Cost Estimation\n");
        logger.info("Enter your choice = ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Interest obj1 = new Interest();
                obj1.calculate();
                break;
            case 2:
            	HomeCostEstimation obj2 = new HomeCostEstimation();
                obj2.calculate();
                break;
            default:
            	logger.info("Wrong choice\n");
        }
        logger.info("Press 0 to stop\n");
        c = sc.nextInt();
    }while (c!=0);
}

}