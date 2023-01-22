package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.AllBean.CrimaCriminal;
import com.utility.Utility;

public class CrimeCriminalDaoImp implements CrimeCriminalDao {

	@Override
	public String insertCrimeCriminalRecord(CrimaCriminal CrimeCriminal) {
		// TODO Auto-generated method stub
		String msg = "Not Registered!!";
		
		try(Connection conn = Utility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Crime_CriminalInfo(CriminalId,Section,Status) values(?,?,?)");
			ps.setInt(1, CrimeCriminal.getCriminalId());
			ps.setInt(2, CrimeCriminal.getSection());
			 ps.setBoolean(3, CrimeCriminal.isStatus());
			 
			 int x = ps.executeUpdate();
			 if(x>0) {
				 msg = "Criminal Crime Registered Successfully!!";
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
		}
		return msg;
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String StatusMarkAsSolved(int CriminalId, int Section){
		// TODO Auto-generated method stub
		String msg = "";
		Connection conn = Utility.provideConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("update Crime_CriminalInfo set Status = 1 where CriminalId = ? AND Section = ?");
			ps.setInt(1, CriminalId);
			 ps.setInt(2, Section);
			 
			 
			 int x = ps.executeUpdate();
			 if(x>0) {
				 msg = "Crime Update As Solved";
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
		}
		
		return msg;
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------


	@Override
	public String StatusMarkAsUnsolved(int CriminalId, int Section) {
		// TODO Auto-generated method stub
		String msg = "";
		
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("update Crime_CriminalInfo set Status = 0 where CriminalId = ? AND Section = ?");
			ps.setInt(1, CriminalId);
			 ps.setInt(2, Section);
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 msg = "Crime Update As Unsolved";
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 e.getMessage();
		}
		
		return msg;
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------


	@Override
	public int NoOfSolvedCrime() {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select COUNT(*) Count from Crime_CriminalInfo where Status = 1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------


	@Override
	public int NoOfUnsolvedCrime() {
		// TODO Auto-generated method stub
		
		int count = 0;
		try(Connection conn = Utility.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select COUNT(*) Count from Crime_CriminalInfo where Status = 0");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
