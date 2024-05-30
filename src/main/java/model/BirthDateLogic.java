package model;

import java.sql.Date;
import java.time.LocalDate;

public class BirthDateLogic {
	public Date calcJhsGraduate(Date dateOfBirth) {
		LocalDate date = dateOfBirth.toLocalDate();
		LocalDate jhsGraduate_localdate = date.plusYears(16);
		if (jhsGraduate_localdate.getMonthValue() == 4 && jhsGraduate_localdate.getDayOfMonth() == 1) {
			
			Date jhsGraduate = java.sql.Date.valueOf(jhsGraduate_localdate);
			return jhsGraduate;
		}
		return null;
	}
}
