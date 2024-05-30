package model;

import java.io.Serializable;
import java.sql.Date;

public class BirthDate implements Serializable {
	private Date dateOfBirth;
	private Date jhsGraduate;
	private Date hsAdmission;
	private Date hsGraduate;
	private Date univAdmission;
	private Date univGraduate;
	
	public BirthDate() {}
	public BirthDate(Date dateOfBirth, Date jhsGraduate, Date hsAdmission, Date hsGraduate, Date univAdmission, Date univGraduate) {
		this.dateOfBirth = dateOfBirth;
		this.jhsGraduate = jhsGraduate;
		this.hsAdmission = hsAdmission;
		this.hsGraduate = hsGraduate;
		this.univAdmission = univAdmission;
		this.univGraduate = univGraduate;
	}
	
	public Date getDateOfBirth() { return dateOfBirth; }
	public Date getJhsGraduate() { return jhsGraduate; }
	public Date getHsAdmission() { return hsAdmission; }
	public Date getHsGraduate() { return hsGraduate; }
	public Date getUnivAdmission() { return univAdmission; }
	public Date getUnivGraduate() { return univGraduate; }
	
}
