package com.enterprisearchitecture.codereview;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Requester implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "CWS ID")
	private java.lang.String cwsID;
	@org.kie.api.definition.type.Label(value = "Email")
	private java.lang.String emailID;
	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Contact Number")
	private java.lang.String contactNumber;

	public Requester() {
	}

	public java.lang.String getCwsID() {
		return this.cwsID;
	}

	public void setCwsID(java.lang.String cwsID) {
		this.cwsID = cwsID;
	}

	public java.lang.String getEmailID() {
		return this.emailID;
	}

	public void setEmailID(java.lang.String emailID) {
		this.emailID = emailID;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(java.lang.String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Requester(java.lang.String cwsID, java.lang.String emailID,
			java.lang.String name, java.lang.String contactNumber) {
		this.cwsID = cwsID;
		this.emailID = emailID;
		this.name = name;
		this.contactNumber = contactNumber;
	}

}