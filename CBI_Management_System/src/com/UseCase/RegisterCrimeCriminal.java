package com.UseCase;

import java.util.Scanner;

import com.AllBean.CrimaCriminal;
import com.Dao.CrimeCriminalDao;
import com.Dao.CrimeCriminalDaoImp;

public class RegisterCrimeCriminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Criminal Id:");
		int id = sc.nextInt();
		
		System.out.println("Enter Crime Section: ");
		int section  = sc.nextInt();
		
		System.out.println("Enter Crime Status Solved/Unsolved in (true/false): ");
		boolean Status  = sc.nextBoolean();
		
		CrimeCriminalDao c1 = new CrimeCriminalDaoImp();
		CrimaCriminal  cc1= new CrimaCriminal(id,section,Status);
		String result = c1.insertCrimeCriminalRecord(cc1);
		System.out.println(result);
	}
}
