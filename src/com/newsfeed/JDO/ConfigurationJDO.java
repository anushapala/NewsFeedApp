package com.newsfeed.JDO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class ConfigurationJDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4291061010151187350L;
	
	@PrimaryKey
	String configID = "";
	
	String contactId = "";

	ArrayList<String> sourceList = new ArrayList<String>();
	ArrayList<String> categoryList = new ArrayList<String>();
	ArrayList<String> countryList = new ArrayList<String>();
	
	String language = "";
	
	boolean shouldRemind = false;
	
	String reminderType = "";
	
	Date configRequestedOn = new Date();
	
	Long reminderTimeMillis = 0l;
	
	

	public String getConfigID() {
		return configID;
	}

	public void setConfigID(String configID) {
		this.configID = configID;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public ArrayList<String> getSourceList() {
		return sourceList;
	}

	public void setSourceList(ArrayList<String> sourceList) {
		this.sourceList = sourceList;
	}

	public ArrayList<String> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<String> categoryList) {
		this.categoryList = categoryList;
	}

	public ArrayList<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<String> countryList) {
		this.countryList = countryList;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isShouldRemind() {
		return shouldRemind;
	}

	public void setShouldRemind(boolean shouldRemind) {
		this.shouldRemind = shouldRemind;
	}

	public String getReminderType() {
		return reminderType;
	}

	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}

	public Date getConfigRequestedOn() {
		return configRequestedOn;
	}

	public void setConfigRequestedOn(Date configRequestedOn) {
		this.configRequestedOn = configRequestedOn;
	}

	public Long getReminderTimeMillis() {
		return reminderTimeMillis;
	}

	public void setReminderTimeMillis(Long reminderTimeMillis) {
		this.reminderTimeMillis = reminderTimeMillis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
