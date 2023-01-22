package com.Dao;

import com.AllBean.Crime;

public interface CrimeDao {
	
public String insertCrimeRecord(Crime crime);
	
	public Crime searchCrimeBySction(int section);
	
	public int NoOfCrimeRecordedCurrentMonth();

}
