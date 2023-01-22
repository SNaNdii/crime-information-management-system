package com.Dao;

import com.AllBean.Criminal;

public interface CriminalDao {

public String insertCriminalRecord(Criminal Criminal);
	
	public Criminal searchCriminalByCriminalId(int CriminalId);
	
	public String searchcriminalbyCrime(String which_crime);
}
