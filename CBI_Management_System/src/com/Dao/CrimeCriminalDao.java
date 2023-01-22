package com.Dao;

import com.AllBean.CrimaCriminal;

public interface CrimeCriminalDao {

	public String insertCrimeCriminalRecord(CrimaCriminal CrimeCriminal);
	
	public String StatusMarkAsSolved(int CriminalId, int Section) ;
	
	public String StatusMarkAsUnsolved(int CriminalId, int Section);

	public int NoOfSolvedCrime();
	
	public int NoOfUnsolvedCrime();
	
}
