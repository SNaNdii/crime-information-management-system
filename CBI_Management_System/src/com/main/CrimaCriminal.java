package com.main;

public class CrimaCriminal {
	
	private int CriminalId;
	private int Section;
	private boolean Status;
	
	public CrimaCriminal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CrimaCriminal(int criminalId, int section, boolean status) {
		super();
		CriminalId = criminalId;
		Section = section;
		Status = status;
	}
	
	public int getCriminalId() {
		return CriminalId;
	}
	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}
	
	public int getSection() {
		return Section;
	}
	public void setSection(int section) {
		Section = section;
	}
	
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "CrimaCriminal [CriminalId=" + CriminalId + ", Section=" + Section + ", Status=" + Status + "]";
	}
	
}
