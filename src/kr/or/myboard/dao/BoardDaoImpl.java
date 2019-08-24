package kr.or.myboard.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.myboard.util.SqlMapClientFactory;
import kr.or.myboard.vo.MyBoard2VO;
import kr.or.myboard.vo.Pagination;


public class BoardDaoImpl implements IBoardDao{
private SqlMapClient smc;
	
	private static BoardDaoImpl dao;
	private BoardDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static BoardDaoImpl getInstance() {
		if (dao == null) {
			dao = new BoardDaoImpl();
		}
		return dao;
	}

	@Override
	public List<MyBoard2VO> selectAllBoards() {
		List<MyBoard2VO> lbv=null;
		try {
			lbv = smc.queryForList("board.selectAllBoards");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lbv;
	}

	@Override
	public void insertBoard(MyBoard2VO bvo) {
		try{
			smc.insert("board.insertBoard",bvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateReadCount(String num) {
		try {
			smc.update("board.updateReadCount",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MyBoard2VO selectOneBoardByNum(String num) {
		MyBoard2VO bv = null;
		try {
			bv = (MyBoard2VO) smc.queryForObject("board.selectOneBoardByNum",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bv;
	}

	@Override
	public void updateBoard(MyBoard2VO bvo) {
		try {
			smc.update("board.updateBoard",bvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MyBoard2VO checkPassWord(MyBoard2VO bvo) {
		MyBoard2VO bv = null;
		try {
			bv = (MyBoard2VO) smc.queryForObject("checkPassWord",bvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bv;
	}

	@Override
	public void deleteBoard(String num) {
		try {
			smc.delete("board.deletePost",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateThumbsUp(String num) {
		try {
			smc.update("board.updateThumbsUp",num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getPageCnt() {
		int result = 0;
		try {
			result = (int) smc.queryForObject("board.getPages");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<MyBoard2VO> selectBoardsByCurPage(Pagination pagination) {
		List<MyBoard2VO> lbv = null;
		try {
		lbv = smc.queryForList("board.selectBoardsByCurPage",pagination);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lbv;
	}
}
