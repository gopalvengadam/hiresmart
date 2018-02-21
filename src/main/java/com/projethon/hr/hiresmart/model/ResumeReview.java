package com.projethon.hr.hiresmart.model;

import java.util.Date;

public class ResumeReview {
    private String id;
    private Candidate candidate;
    private Person reviewedBy;
    private Resume resume;
    private Result result;
    private Date dateReviewed;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Person getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(Person reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Date getDateReviewed() {
		return dateReviewed;
	}
	public void setDateReviewed(Date dateReviewed) {
		this.dateReviewed = dateReviewed;
	}
    
    
}
