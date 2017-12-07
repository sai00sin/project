package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	public boolean loginCheck(String name, String password) {
		boolean loginFlg = false;
		String sql = "SELECT * FROM user WHERE userid = ? AND password = ?";
		// System.out.println(userID + " " + password);
		ConnectionManager cm = ConnectionManager.getInstance();
		try(Connection con = cm.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet res = pstmt.executeQuery();
			// 結果の取得
			if(res.next()) {
				loginFlg = true;
			}
		} catch (Exception e) {
			System.out.println("処理結果：userIdとpasswordが一致しません");
			e.printStackTrace();
		}

		return loginFlg;
	}
}