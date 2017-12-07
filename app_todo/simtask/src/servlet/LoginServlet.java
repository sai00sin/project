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
import javax.servlet.http.HttpSession;

import dao.TaskDAO;
import dao.UserDAO;
import entity.Task;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// エンコーディングの指定
		request.setCharacterEncoding("UTF-8");

		// リクエストパラメーターの取得
		String action = request.getParameter("ACTION");
		String name = request.getParameter("USERID");
		String password = request.getParameter("PASSWORD");
		String url = null; // 転送先URL
		// System.out.println(action + " " + userId + " " + password);

		//--------- ACTIONによる条件分岐 ---------//
		//--------- ACTION = "ログイン"の場合 ---------
		if("ログイン".equals(action)) {
			UserDAO dao = new UserDAO();
			boolean loginFlg = false;
			loginFlg = dao.loginCheck(name, password);
			System.out.println("loginFlg = " + loginFlg);
			if(loginFlg) { // ログインOK
				TaskDAO tdao = new TaskDAO();
				List<Task> taskList = new ArrayList<Task>();
				try {
					taskList = tdao.findAllTask();
				} catch (Exception e) {
					e.printStackTrace();
				}

				request.setAttribute("taskList", taskList);

				url = "/jsp/menu.jsp";
			} else { // ログインNG
				url = "/loginfailure.html";
			}
			HttpSession session = request.getSession();
			session.setAttribute("loginFlg", loginFlg);
			//--------- ACTION = "ログイン画面へ"の場合 ---------
		} else if("ログイン画面へ".equals(action)) {
			url = "/login.html";
			//--------- ACTION = "ログアウト"の場合 ---------
		} else if("ログアウト".equals(action)) {
			HttpSession session = request.getSession();
			session.removeAttribute("loginFlg");
			session.invalidate();
			url = "/logout.html";
		}

		// 転送先の指定
		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}
}