package com.projethon.hr.hiresmart.model;

import java.util.Date;

public class Interview {

    private String id;
    private Candidate interviewWith;
    private Person interviewedBy;
    private Date interviewedOn;
    private InterviewFormat format;
    private String notes;
    private InterviewResult result;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Candidate getInterviewWith() {
		return interviewWith;
	}
	public void setInterviewWith(Candidate interviewWith) {
		this.interviewWith = interviewWith;
	}
	public Person getInterviewedBy() {
		return interviewedBy;
	}
	public void setInterviewedBy(Person interviewedBy) {
		this.interviewedBy = interviewedBy;
	}
	public Date getInterviewedOn() {
		return interviewedOn;
	}
	public void setInterviewedOn(Date interviewedOn) {
		this.interviewedOn = interviewedOn;
	}
	public InterviewFormat getFormat() {
		return format;
	}
	public void setFormat(InterviewFormat format) {
		this.format = format;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public InterviewResult getResult() {
		return result;
	}
	public void setResult(InterviewResult result) {
		this.result = result;
	}
    
    
}
