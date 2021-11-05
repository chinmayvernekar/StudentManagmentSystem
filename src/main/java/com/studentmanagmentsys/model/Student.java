package com.studentmanagmentsys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sid;
	private String sFirstName;
	private String sLastName;
	private String sAge;
	private String sContactNumber;
	private String sAddress;

	/**
	 * 
	 */
	protected Student() {
		super();
	}

	/**
	 * @param sid
	 * @param sFirstName
	 * @param sLastName
	 * @param sAge
	 * @param sContactNumber
	 * @param sAddress
	 */
	protected Student(Long sid, String sFirstName, String sLastName, String sAge, String sContactNumber, String sAddress) {
		super();
		this.sid = sid;
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sAge = sAge;
		this.sContactNumber = sContactNumber;
		this.sAddress = sAddress;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getsAge() {
		return sAge;
	}

	public void setsAge(String sAge) {
		this.sAge = sAge;
	}

	public String getsContactNumber() {
		return sContactNumber;
	}

	public void setsContactNumber(String sContactNumber) {
		this.sContactNumber = sContactNumber;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

}
