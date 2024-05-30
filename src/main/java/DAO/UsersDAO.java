package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;
import model.User;

public class UsersDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/data/dateofbirth";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public User findByLogin(Login login) {
		User user = null;
		
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT USER_ID, USER_NAME, MAIL, PASS FROM USERS WHERE USER_ID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()) {
				String userId = rs.getString("USER_ID");
				String userName = rs.getString("USER_NAME");
				String mail = rs.getString("MAIL");
				String pass = rs.getString("PASS");
				user = new User(userId, userName, mail, pass);
			}
		} catch (SQLException e) {
				e.printStackTrace();
				return null;
		}
		return user;
	}
}
