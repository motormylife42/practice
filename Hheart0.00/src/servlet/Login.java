package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		//UTF-8を利用

		String id =request.getParameter("id");
		String pass =request.getParameter("pass");
		//idとpassにリクエストパラメータを代入。

		User user = new User(id,pass);
		//userにidとpassを代入。

		LoginLogic loginlogic = new LoginLogic();
		boolean isLogin = loginlogic.execute(user);
		//loginlogicを作って、 boolean型のisLoginにtrue,falseを代入。

		if(isLogin) {
			HttpSession session = request.getSession();
				//sessionスコープを sessionに保存。
				session.setAttribute("loginUser", user);
				//loginUser型でuserを保存
		}
	RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	dispatcher.forward(request, response);
			//forward to Login
	}
}
