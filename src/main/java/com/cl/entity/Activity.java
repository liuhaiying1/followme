package com.cl.entity;

import java.sql.Timestamp;

public class Activity {

	private Integer id;

	private String actTime;
	
	private String actTitle;
	
	private Integer actMaxPerson;
	
	private Integer actCurPerson;
	
	private String beginCity;
	
	private String gatherPlace;
	
	private Timestamp beginTime;
	
	private String actCost;
	
	private String introduction;
	
	private Integer insurance;
	
	private Integer clubID;
	
	private Integer actType;
	
	private Integer isDelete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActTime() {
		return actTime;
	}

	public void setActTime(String actTime) {
		this.actTime = actTime;
	}

	public String getActTitle() {
		return actTitle;
	}

	public void setActTitle(String actTitle) {
		this.actTitle = actTitle;
	}

	public Integer getActMaxPerson() {
		return actMaxPerson;
	}

	public void setActMaxPerson(Integer actMaxPerson) {
		this.actMaxPerson = actMaxPerson;
	}

	public Integer getActCurPerson() {
		return actCurPerson;
	}

	public void setActCurPerson(Integer actCurPerson) {
		this.actCurPerson = actCurPerson;
	}

	public String getBeginCity() {
		return beginCity;
	}

	public void setBeginCity(String beginCity) {
		this.beginCity = beginCity;
	}

	public String getGatherPlace() {
		return gatherPlace;
	}

	public void setGatherPlace(String gatherPlace) {
		this.gatherPlace = gatherPlace;
	}

	public Timestamp getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	public String getActCost() {
		return actCost;
	}

	public void setActCost(String actCost) {
		this.actCost = actCost;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getInsurance() {
		return insurance;
	}

	public void setInsurance(Integer insurance) {
		this.insurance = insurance;
	}

	public Integer getClubID() {
		return clubID;
	}

	public void setClubID(Integer clubID) {
		this.clubID = clubID;
	}

	public Integer getActType() {
		return actType;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	

}
