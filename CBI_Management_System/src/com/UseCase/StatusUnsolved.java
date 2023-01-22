package com.UseCase;

import java.util.Scanner;

import com.Dao.CrimeCriminalDao;
import com.Dao.CrimeCriminalDaoImp;

public class StatusUnsolved {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CriminalId:");
		int criId = sc.nextInt();
		
		System.out.println("Enter Crime Section:");
		int section = sc.nextInt();
		
		CrimeCriminalDao c1 = new CrimeCriminalDaoImp();
		String message = c1.StatusMarkAsUnsolved(criId, section);
		System.out.println(message);
		
	}

}
