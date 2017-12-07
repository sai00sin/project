package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TaskDAO;
import entity.Task;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/add.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("TITLE");
		String task = request.getParameter("TASK");
		String limitdate = request.getParameter("LIMITDATE");

		System.out.println(title);
		System.out.println(task);
		System.out.println(limitdate);

		Task t = new Task();
		t.setTitle(title);
		t.setTask(task);
		t.setLimitdate(limitdate);

		TaskDAO tdao = new TaskDAO();
		try {
			tdao.addTask(t);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		List<Task> taskList = new ArrayList<Task>();
		try {
			taskList = tdao.findAllTask();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("taskList", taskList);

		RequestDispatcher d = request.getRequestDispatcher("/jsp/menu.jsp");
		d.forward(request, response);

	}
}
