package kr.or.myboard.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.myboard.util.SqlMapClientFactory;
import kr.or.myboard.vo.MyBoard2VO;


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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReadCount(String num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyBoard2VO selectOneBoardByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(MyBoard2VO bvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyBoard2VO checkPassWord(MyBoard2VO bvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBoard(String num) {
		// TODO Auto-generated method stub
		
	}
}
