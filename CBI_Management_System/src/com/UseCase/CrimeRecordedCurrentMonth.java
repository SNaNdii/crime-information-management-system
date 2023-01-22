package com.UseCase;

import com.Dao.CrimeDao;
import com.Dao.CrimeDaoImp;

public class CrimeRecordedCurrentMonth {
	
	public static void main(String[] args) {
		
CrimeDao CD = new CrimeDaoImp();
		
		int c = CD.NoOfCrimeRecordedCurrentMonth();
		System.out.println("Number of crimes recorded in the current month: "+c);
		
	}

}
