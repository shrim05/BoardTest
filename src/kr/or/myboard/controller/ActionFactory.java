package kr.or.myboard.controller;

import kr.or.myboard.controller.action.Action;
import kr.or.myboard.controller.action.BoardListAction;
import kr.or.myboard.controller.action.BoardUpdateAction;
import kr.or.myboard.controller.action.BoardViewAction;
import kr.or.myboard.controller.action.BoardWriteAction;
import kr.or.myboard.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance;
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		if(instance==null) {
			instance = new ActionFactory();
		}
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("board_list")) {
			action = new BoardListAction();
		}else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		}else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		}else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		}
		
		return action;
	}
	
	
}
