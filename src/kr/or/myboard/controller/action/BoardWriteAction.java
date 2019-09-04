package kr.or.myboard.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.myboard.dao.BoardDaoImpl;
import kr.or.myboard.dao.IBoardDao;
import kr.or.myboard.vo.MyBoard2VO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Board/boardWrtie.jsp";
		IBoardDao dDao = BoardDaoImpl.getInstance();
		MyBoard2VO bvo = new MyBoard2VO();
		bvo.setTitle(request.getParameter("title"));
		
		dDao.insertBoard(bvo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
