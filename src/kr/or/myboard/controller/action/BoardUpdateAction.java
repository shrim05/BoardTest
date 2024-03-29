package kr.or.myboard.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.myboard.dao.BoardDaoImpl;
import kr.or.myboard.dao.IBoardDao;
import kr.or.myboard.vo.MyBoard2VO;

public class BoardUpdateAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Board/boardUpdate.jsp";
		IBoardDao dDao = BoardDaoImpl.getInstance();
		MyBoard2VO  bv = new MyBoard2VO();
		bv.setName(request.getParameter("name"));
		bv.setPass(request.getParameter("pass"));
		bv.setEmail(request.getParameter("email"));
		bv.setTitle(request.getParameter("title"));
		dDao.updateBoard(bv);
		
	}

}
