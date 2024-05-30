package test;

import DAO.UsersDAO;
import model.Login;
import model.User;

public class UsersDAOTest {
	public static void main(String[] args) {
		testFindByLoginOK();
		testFindByLoginNG();
		
	}
	
	public static void testFindByLoginOK() {
		Login login = new Login("minato", "1234");
		UsersDAO dao = new UsersDAO();
		User result = dao.findByLogin(login);
		if(result != null &&
				result.getUserId().equals("minato") &&
				result.getPass().equals("1234") &&
				result.getMail().equals("yusuke.minato@miyabilink.jp") &&
				result.getUserName().equals("湊　雄輔")) {
			System.out.println("testFindByLoginOK:成功しました");
		} else {
			System.out.println("testFindByLoginOK:失敗しました");
		}
	}
	public static void testFindByLoginNG() {
		Login login = new Login("minato", "12345");
		UsersDAO dao = new UsersDAO();
		User result = dao.findByLogin(login);
		if(result == null) {
			System.out.println("testFindByLoginNG:成功しました");
		} else {
			System.out.println("testfindByLoginNG:失敗しました");
		}
	}
}
