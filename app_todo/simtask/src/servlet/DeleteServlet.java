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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("ID"));

		Task t = new Task();
		t.setId(id);

		TaskDAO tdao = new TaskDAO();
		try {
			tdao.deleteTask(t);
		} catch (Exception e) {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
