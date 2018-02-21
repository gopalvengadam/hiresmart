package com.projethon.hr.hiresmart.model;
import java.util.List;

public class Candidate extends Person {

    private String id;
    private String source;
    private List<Resume> resumes;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<Resume> getResumes() {
		return resumes;
	}
	public void setResumes(List<Resume> resumes) {
		this.resumes = resumes;
	}

}
