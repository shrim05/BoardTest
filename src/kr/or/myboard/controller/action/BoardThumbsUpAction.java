package kr.or.myboard.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.myboard.dao.BoardDaoImpl;
import kr.or.myboard.dao.IBoardDao;

public class BoardThumbsUpAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IBoardDao bDao = BoardDaoImpl.getInstance();
		String num = request.getParameter("num");
		bDao.updateThumbsUp(num);
		
	}

}
