package com.main;

import java.util.Scanner;

import com.UseCase.CrimeRecordedCurrentMonth;
import com.UseCase.RegisterCrimeCriminal;
import com.UseCase.RegisterCrimeRecord;
import com.UseCase.SearchCrimeBySection;
import com.UseCase.StatusMarkSolved;
import com.UseCase.StatusUnsolved;

public class Main {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("                               **  WELCOME  **    \n");
		
		System.out.println("                 ** CRIME INFORMATION MANAGEMENT SYSTEM **\n");
		
//		while(true) {
			
		System.out.println("\n");
		
		System.out.println("Enter Your Choice!!");
		
		System.out.println("1. Register Criminal ");
		
		System.out.println("2. Register Crime ");
		
		System.out.println("3. Register Criminal for Crime ");
		
		System.out.println("4. Search Criminal by criminal Id ");
		
		System.out.println("5. Search Crime by Section ");
		
		System.out.println("6. Search Criminal by Crime ");
		
		System.out.println("7. Mark As Solved Case");
		
		System.out.println("8. Mark As Unsolved Case ");
		
		System.out.println("9. Number of solved crime ");
		
		System.out.println("10. Number of unsolved crime ");
		
		System.out.println("11. Number of crimes recorded in the current month");
		
		System.out.println("0. Exit!!");

		int Choice = sc.nextInt();
		
			if(Choice==1) {
//				ResisteredCriminal.main(args);
			}
			
			else if(Choice==2) {
				RegisterCrimeRecord.main(args);
			}
		
			else if(Choice==3) {
				RegisterCrimeCriminal.main(args);
			}
			
//			else if(Choice==4) {
//				SearchCriminalbyCriminalid.main(args);
//			}
			
			else if(Choice==5) {
				SearchCrimeBySection.main(args);
			}
//			
//			else if(Choice==6) {
//				SearchCriminalByCrime.main(args);
//			}
//			
			else if(Choice==7) {
				StatusMarkSolved.main(args);
			}
			
			else if(Choice==8) {
				StatusUnsolved.main(args);
			}
			
//			else if(Choice==9) {
//				
//				NoOfSolvedCrime.main(args);
//				
//			}
//			else if(Choice==10) {
//				NoOfUnsolvedCrime.main(args);
//			}
			
			else if(Choice==11) {
				CrimeRecordedCurrentMonth.main(args);
			}
			
//			else if(Choice==0) {
//				System.out.println("THANK YOU !!");
//				break;
//			}
			
//		}
	}

}
