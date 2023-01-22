package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.AllBean.Crime;
import com.utility.Utility;

public class CrimeDaoImp implements CrimeDao {

	@Override
	public String insertCrimeRecord(Crime crime) {
		// TODO Auto-generated method stub
		String msg = "Not Registered!!";
		
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into CrimeInfo values(?,?,?,?,?,?,?)");
			ps.setInt(1, crime.getSection());
//			 ps.setDate(2, crime.getDate());
			 ps.setString(3, crime.getPlace());
			 ps.setString(4, crime.getDescription());
			 ps.setInt(5, crime.getVictims());
			 ps.setString(6, crime.getDetail_description());
			 ps.setString(7, crime.getSuspectedName());
			 
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 msg = "Crime Registered Successfully!!";
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
		}
		
		return msg;
	}
	
//-----------------------------------------------------------------------------------------------------
	

	@Override
	public Crime searchCrimeBySction(int section) {
		// TODO Auto-generated method stub
		Crime crime = null;
		
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from CrimeInfo where Section = ?");
			ps.setInt(1, section);
			 
			  ResultSet rs = ps.executeQuery();
			  
			  if(rs.next()) {
				  
				  int sec = rs.getInt("Section");
				  String date =  ""+rs.getDate("date");
				  String Place = rs.getString("Place");
				  String Description = rs.getString("Description");
				  int victims = rs.getInt("victims");
				  String detail_description = rs.getString("detail_description");
				  String suspectedName = rs.getString("suspectedName");
				  
				  crime = new Crime(sec, date, Place, Description, victims, detail_description, suspectedName);
				  
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return crime;
	}

	
//-----------------------------------------------------------------------------------------------------
	
	@Override
	public int NoOfCrimeRecordedCurrentMonth() {
		// TODO Auto-generated method stub
		int count = 0;
		
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT SUM(DATE_FORMAT(date, '%Y-%m-01') = DATE_FORMAT(CURRENT_DATE(), '%Y-%m-01')) Count,count(*) FROM CrimeInfo");
			ResultSet c = ps.executeQuery();
			 if(c.next()) {
			 count = c.getInt("Count");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return count;
	}

}
