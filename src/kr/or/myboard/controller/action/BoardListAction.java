package kr.or.myboard.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.myboard.dao.BoardDaoImpl;
import kr.or.myboard.dao.IBoardDao;
import kr.or.myboard.vo.MyBoard2VO;

public class BoardListAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Board/boardList.jsp";
		IBoardDao bDao = BoardDaoImpl.getInstance();
		List<MyBoard2VO> boardList = bDao.selectAllBoards();
		
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
