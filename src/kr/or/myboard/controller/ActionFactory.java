package kr.or.myboard.controller;

import kr.or.myboard.controller.action.Action;
import kr.or.myboard.controller.action.BoardListAction;
import kr.or.myboard.controller.action.BoardWriteAction;

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
		}
		return action;
	}
	
	
}
