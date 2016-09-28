package xueshe.com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xueshe.com.dao.ClubDao;
import xueshe.com.model.Club;


@WebServlet("/BackendClubListServlet")
public class BackendClubListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BackendClubListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ClubDao cd=new ClubDao();
		ArrayList<Club> clubList=new ArrayList<Club>();
		clubList=cd.findClubsByCLname("");
		request.setAttribute("clubList", clubList);
		RequestDispatcher rd = request.getRequestDispatcher("backend/clublist.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
