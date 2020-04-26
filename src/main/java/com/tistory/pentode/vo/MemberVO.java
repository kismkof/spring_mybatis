package com.tistory.pentode.vo;

import java.util.Date;

public class MemberVO {
	private Integer seqNo;
	private Integer positionCode;
	private String memId;
	private String pw;
	private Integer pwErrCnt;
	private String name;
	private String email;
	private String statusCode;
	private Integer teamSeqNo;
	private Date regDtms;
	private Date chgDtms;
	
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public Integer getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(Integer positionCode) {
		this.positionCode = positionCode;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Integer getPwErrCnt() {
		return pwErrCnt;
	}
	public void setPwErrCnt(Integer pwErrCnt) {
		this.pwErrCnt = pwErrCnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Integer getTeamSeqNo() {
		return teamSeqNo;
	}
	public void setTeamSeqNo(Integer teamSeqNo) {
		this.teamSeqNo = teamSeqNo;
	}
	public Date getRegDtms() {
		return regDtms;
	}
	public void setRegDtms(Date regDtms) {
		this.regDtms = regDtms;
	}
	public Date getChgDtms() {
		return chgDtms;
	}
	public void setChgDtms(Date chgDtms) {
		this.chgDtms = chgDtms;
	}
}
