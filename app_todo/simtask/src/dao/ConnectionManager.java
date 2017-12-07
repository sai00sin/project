/*
 * 総合２ 解答例	ConnectionManager.java
 *
 * Copyright(C) 2015 emBex Education Inc. All Rights Reserved.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * データベース管理クラス
 */
public class ConnectionManager {

	// URL・ユーザ名・パスワードの設定
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost/simtask?useSSL=false";
	private final static String USER = "root";
	private final static String PASSWORD = "";
	// 	コネクションインスタンスと時分自身のインスタンス
	private Connection connection = null;
	private static ConnectionManager instance = new ConnectionManager();

	/**
	 * コンストラクタ.
	 * 外部からの使用は禁止
	 * ファクトリーメソッドから呼び出される
	 */
	private ConnectionManager() { 	}
/*
 * ファクトリーメソッド
 */
	public static ConnectionManager getInstance() {
		return instance;
	}

	/**
	 * DBの接続.
	 * @return コネクション
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {
		try {
		    // JDBCドライバのロード
		    Class.forName(DRIVER_NAME);
		} catch(ClassNotFoundException e) {
		    System.out.println("ドライバがありません" + e.getMessage());
		}
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			}
		} catch (Exception e) {
			e.printStackTrace();
			connection = null;
			throw e;
		}
		return connection;
	}

	/**
	 * DBの切断.
	 */
	public void closeConnection() {
		try {
			if (connection != null) {	connection.close(); }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection = null;
		}
	}
}
