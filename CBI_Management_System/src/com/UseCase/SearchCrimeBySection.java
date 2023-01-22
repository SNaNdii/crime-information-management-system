package com.UseCase;

import java.util.Scanner;

import com.AllBean.Crime;
import com.Dao.CrimeDao;
import com.Dao.CrimeDaoImp;

public class SearchCrimeBySection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Crime Section :");
		int section = sc.nextInt();
		
		CrimeDao CD = new CrimeDaoImp();
		Crime crime = null;
		crime = CD.searchCrimeBySction(section);
		System.out.println(crime);
		
	}
	
}
