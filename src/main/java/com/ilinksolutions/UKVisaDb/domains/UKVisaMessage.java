package com.ilinksolutions.UKVisaDb.domains;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
public class UKVisaMessage
{
    @ApiModelProperty(notes="Record Id for the person.")
	private int id;
    @ApiModelProperty(notes="First name for the person.")
    private String firstName;
    @ApiModelProperty(notes="Last name for the person.")
    private String lastName;
    @ApiModelProperty(notes="Contact Number for the person.")
    private String contactNo;
    @ApiModelProperty(notes="Email Address for the person.")
    private String email;

    public UKVisaMessage()
    {
    }

    public UKVisaMessage(int id, String firstName, String lastName, String contactNo, String email)
    {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UKVisaMessage [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNo="
				+ contactNo + ", email=" + email + "]";
	}
	
}
