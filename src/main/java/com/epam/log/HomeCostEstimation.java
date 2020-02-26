package com.epam.log;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomeCostEstimation {

public static final Logger logger=LogManager.getLogger(HomeCostEstimation.class);
	
	private int material_standard_id;
    
    private float house_area;  
    private boolean is_fully_automated;     
    public HomeCostEstimation(){
        int flag = 1;
        Scanner sc = new Scanner(System.in);
       // PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
       
        do {
        	 logger.info("Press 1 to use standard materials in home\n");
        	 logger.info("Press 2 to use above standard materials in home\n");
        	 logger.info("Press 3 to use high standard materials in home\n");
        	 logger.info("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    this.material_standard_id = 1;
                    logger.info("The material standard selected is standard material\n");
                    flag = 0;
                    break;
                case 2:
                    this.material_standard_id = 2;
                    logger.info("The material standard selected is above standard material\n");
                    flag = 0;
                    break;
                case 3:
                    this.material_standard_id = 3;
                    logger.info("The material standard selected is high standard material\n");
                    flag = 0;
                    break;
                default:
                	 logger.info("Wrong choice selected\n");
            }
        }while (flag==1);
        logger.info("Enter the house area = ");
        this.house_area = sc.nextFloat();
        logger.info("Press y to get fully automated features = ");
        sc.nextLine();
        char ch = sc.next().charAt(0);
        if(ch=='Y' ||ch=='y')
            this.is_fully_automated = true;
        else
            this.is_fully_automated = false;
    }
    void calculate(){
        float cost = 1;
        //PrintStream obj =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        logger.info("The calculated cost = ");
        if(this.material_standard_id==1)
            cost = 1200;
        else if(this.material_standard_id==2)
            cost = 1500;
        else if(this.material_standard_id==3)
            cost = 1800;
   
        if(this.is_fully_automated)
            cost += 700;
        logger.info(cost*this.house_area+"\n");
    }
}
