package com.sonar;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		var choice=0;
		var select=0;
		var scan= new Scanner(System.in);
		var logger = Logger.getLogger(Main.class.getName());
		
		     do{
		    	 logger.info("1.Create an Employee \n2.Display all Employees \n3.Display employees by Designation \n4.Raise the salaries of all Employees \n5.Raise salary by ID \n6.Delete employee by ID \n7.Exit \nEnter your choice");
		       choice=scan.nextInt();
		       if(choice==7) break;
		       switch(choice){
		       case 1: do { logger.info("You would like to create \n1.Manager \n2.Clerk \n3.Programmer \n4.Quit");
		               select=scan.nextInt();
		              if(select==4) break;
		              logger.info("Enter name");
		              String name=scan.next();
		              logger.info("Enter age");
		              var age=scan.nextInt();
		              switch(select) {
		              case 1 :   Employee m=new Manager(name,age);
		                         m.create();
		                         break;
		              case 2:    Employee c= new Clerk(name,age);
		                         c.create();
		                         break;
		              case 3 :   Employee p= new Programmer(name,age);
		                         p.create();
		                         break;
		              default:   logger.info("Invalid selection!");
		              }
		            }while(select!=4);
		             break;
		     case 2:     new JdbcConnection().display();
		                  break;
		     case 3:     new JdbcConnection().displayByDesignation();
		    	         break;
		     case 4:    (new Clerk()).raiseSalary();
		                 logger.info("Salaries Raised\n");
		                  break;
		     case 5:    new JdbcConnection().raiseById();
		                logger.info("Salary raised..!");
		                 break;
		     case 6:    new JdbcConnection().deleteEmployee();
		          
		                logger.info("Employee details Deleted permanently");
		                break;
		      default: logger.info("Invalid Choice!");
		     }                    
	   }while(choice!=7);
		     scan.close();
	
  }

}