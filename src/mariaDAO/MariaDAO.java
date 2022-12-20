package mariaDAO;


// 2022. 12. 20 이창현
// DAO DB연동 및 Insert 프로그램


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mariaDTO.MariaDTO;
import java.sql.*;

public class MariaDAO {

	String DRIVER = "org.mariadb.jdbc.Driver";
	String URL = "jdbc:mariadb://localhost:3306/assignment";
	String USER = "root";
	String PWD = "1";

	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public void connDB() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.print("DB 연결 성공!!!");
		} catch (Exception e) {
		}
	}

	public boolean insert(MariaDTO DTO) {
		System.out.print("Insert 성공!!");
		int flag = 0;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("INSERT INTO policy3 VALUES(" + "'경제지수'" + ",1,2,3,4,5,6)");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		MariaDAO t1 = new MariaDAO();
		t1.connDB();
		t1.insert(null);
	}
}
