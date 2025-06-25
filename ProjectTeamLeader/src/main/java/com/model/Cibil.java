package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cibil {
	
	@Id
	private int cibilid;
	private int cibilScore;
	private String cibilScoreDataTime;
	private String status;
	private String cibilRemark;
	public int getCibilid() {
		return cibilid;
	}
	public void setCibilid(int cibilid) {
		this.cibilid = cibilid;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilScoreDataTime() {
		return cibilScoreDataTime;
	}
	public void setCibilScoreDataTime(String cibilScoreDataTime) {
		this.cibilScoreDataTime = cibilScoreDataTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCibilRemark() {
		return cibilRemark;
	}
	public void setCibilRemark(String cibilRemark) {
		this.cibilRemark = cibilRemark;
	}

	
}
