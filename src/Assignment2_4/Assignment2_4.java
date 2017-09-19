package Assignment2_4; //Package declaration

import java.util.Scanner;           //importing Scanner class
public class Assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float phy,chem,math;                  //float variable declaration
		
		float avg, sum =0;                    //float variable declaration and initialization of sum variable
		Scanner  s =new Scanner(System.in);   // Scanner class initiation
		System.out.print("Enter the Name of the Student : ");
		String studentName =s.nextLine();      // String variable StudentName initialization
		
		
		System.out.print("Enter Physics Marks   : "); //It will print Enter Physics Marks   :
		phy=s.nextInt();                              //it will take marks of physics    
		
		System.out.print("Enter Chemistry Marks : "); //It will print Enter Chemistry Marks   :
		chem=s.nextInt();                             //it will take marks of chemistry   
		
		System.out.print("Enter Math marks      : "); //It will print Enter Math Marks   :
		math=s.nextInt();                             //it will take marks of math
		
		sum = phy+chem+math;                          // summation of all subjects physics, chemistry and math
		
		avg= sum/3;                                   //average marks of three subjects
		
		if (avg>70) {                                 //if condition for average greater than 70 then will execute the next statement
			System.out.println(studentName+"'s Average Marks is " +avg + " and Grade scored is A");
		}
		else if (avg>=61 && avg<=70) {                //if condition for average between 61 and  70 then will execute the next statement
			System.out.println(studentName+"'s Average Marks is " +avg + "and  Grade scored is B");
		}
		else if (avg<61){                            //if condition for average less than 61 then will execute the next statement
			System.out.println(studentName+"'s Average Marks is " +avg + "and Grade scored is C");
	
			s.close();                 // Scanner class close
			}
	}

}