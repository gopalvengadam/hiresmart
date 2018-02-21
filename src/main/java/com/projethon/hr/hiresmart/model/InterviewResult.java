package com.projethon.hr.hiresmart.model;

import java.util.HashMap;

public class InterviewResult {
    private String id;
    private Result result;
    private HashMap<String, String> competancyNotes;
    private String notes;
    private String reason;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public HashMap<String, String> getCompetancyNotes() {
		return competancyNotes;
	}
	public void setCompetancyNotes(HashMap<String, String> competancyNotes) {
		this.competancyNotes = competancyNotes;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
    
    
}
