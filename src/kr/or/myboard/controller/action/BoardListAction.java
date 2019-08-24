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
import kr.or.myboard.vo.Pagination;

public class BoardListAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Board/boardList.jsp";
		IBoardDao bDao = BoardDaoImpl.getInstance();
		MyBoard2VO mv = new MyBoard2VO();
		//전체글수
		int listCnt = bDao.getPageCnt();
		int curPage = 1; 
		if(request.getParameter("curPage")==null) {
			curPage =1;
		}else {
			curPage = Integer.parseInt(request.getParameter("curPage"));
		}
		
		Pagination pagination = new Pagination(listCnt, curPage);
		mv.setStartIndex(pagination.getStartIndex());
		mv.setCntPerPage(pagination.getPageSize());
		
		List<MyBoard2VO> boardList = bDao.selectBoardsByCurPage(pagination);
		
		request.setAttribute("boardList", boardList);
		request.setAttribute("listCnt", listCnt);
		request.setAttribute("pagination", pagination);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}
}
