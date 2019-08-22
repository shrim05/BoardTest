package kr.or.myboard.dao;

import java.util.List;

import kr.or.myboard.vo.MyBoard2VO;

public interface IBoardDao {
	public List<MyBoard2VO> selectAllBoards();
	public void insertBoard(MyBoard2VO bvo);
	public void updateReadCount(String num);
	public MyBoard2VO selectOneBoardByNum(String num);
	public void updateBoard(MyBoard2VO bvo);
	public MyBoard2VO checkPassWord(MyBoard2VO bvo);
	public void deleteBoard(String num);
	public void updateThumbsUp(String num);
	
}
