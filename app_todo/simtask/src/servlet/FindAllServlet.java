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
 * Servlet implementation class FindAll
 */
@WebServlet("/findAll")
public class FindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskDAO tdao = new TaskDAO();
		List<Task> taskList = new ArrayList<Task>();
		try {
			taskList = tdao.findAllTask();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("taskList", taskList);

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/menu.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
