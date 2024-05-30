package model;

import java.io.Serializable;
import java.sql.Date;

public class DateOfBirth implements Serializable {
	private Date dateOfBirth;
	private String dateOfBirthId;
	private String registerName;
	private String userId;
	
	public DateOfBirth() {}
	public DateOfBirth(Date dateOfBirth, String dateOfBirthId, String registerName, String userId) {
		this.dateOfBirth = dateOfBirth;
		this.dateOfBirthId = dateOfBirthId;
		this.registerName = registerName;
		this.userId = userId;
	}
	
	public Date getDateOfBirth() { return dateOfBirth; }
	public String getDateOfBirthId() { return dateOfBirthId; }
	public String getRegisterName() { return registerName; }
	public String getUserId() { return userId; }
}
