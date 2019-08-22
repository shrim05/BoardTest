package kr.or.myboard.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.myboard.dao.BoardDaoImpl;
import kr.or.myboard.dao.IBoardDao;
import kr.or.myboard.vo.MyBoard2VO;

public class BoardViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Board/boardView.jsp";
		IBoardDao bDao = BoardDaoImpl.getInstance();
		String num = request.getParameter("num");
		
		MyBoard2VO bv = bDao.selectOneBoardByNum(num);
		bDao.updateReadCount(num);
		
		request.setAttribute("board",bv);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
}
