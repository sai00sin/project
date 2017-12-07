package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Task;

public class TaskDAO {

	ConnectionManager cm = ConnectionManager.getInstance();

	//public void addTask(Task t) throws Exception {
	public void addTask(Task t) throws Exception {
		String sql = "INSERT INTO simtask.task(title, task, limitdate) VALUES(?,?,?)";

		try(Connection conn = cm.getConnection();) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, t.getTitle());
			pstmt.setString(2, t.getTask());
			pstmt.setString(3, t.getLimitdate());
			pstmt.executeUpdate();

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateTask(Task t) {

		String sql = "UPDATE simtask.task SET title = ?, task = ?, limitdate = ? WHERE id = ?";

		try(Connection conn = cm.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, t.getTitle());
			pstmt.setString(2, t.getTask());
			pstmt.setString(3, t.getLimitdate());
			pstmt.setInt(4, t.getId());

			pstmt.executeUpdate();
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteTask(Task t) throws Exception {
		String sql = "DELETE FROM simtask.task WHERE id = ?";

		try(Connection conn = cm.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, t.getId());

			pstmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Task> searchTask(Task task) throws Exception {
		String sql = "SELECT * FROM simtask.task WHERE title LIKE '%" + task.getTitle() + "%' OR task LIKE '" + task.getTask() + "%'";

		List<Task> list = new ArrayList<Task>();

		try(Connection conn = cm.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				Task t = new Task();
				t.setTitle(rs.getString("title"));
				t.setTask(rs.getString("task"));
				t.setLimitdate(rs.getString("limitdate"));
				list.add(t);
			}
			System.out.println("tasklistは" + list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


	public List<Task> findAllTask() throws Exception {
		String sql = "SELECT * FROM simtask.task";

		List<Task> list = new ArrayList<Task>();

		try(Connection conn = cm.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Task t = new Task();
				t.setId(rs.getInt("id"));
				t.setTitle(rs.getString("title"));
				t.setTask(rs.getString("task"));
				t.setLimitdate(rs.getString("limitdate"));
				list.add(t);
			}
			System.out.println("tasklistは" + list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}