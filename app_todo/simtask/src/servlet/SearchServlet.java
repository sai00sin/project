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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String searchword = request.getParameter("SEARCHWORD");

		Task t = new Task();
		t.setTitle(searchword);
		t.setTask(searchword);

		TaskDAO tdao = new TaskDAO();

		List<Task> taskList = new ArrayList<Task>();
		try {
			taskList = tdao.searchTask(t);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("taskList", taskList);

		RequestDispatcher d = request.getRequestDispatcher("/jsp/search.jsp");
		d.forward(request, response);
	}

}
