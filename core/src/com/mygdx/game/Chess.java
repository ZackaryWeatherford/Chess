package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class Chess extends ApplicationAdapter {

	/**
	 *  Things To-Do
	 *  - Finished Drawings
	 *	- Finish Valid Move Method for each Piece
	 *  - Finish MovePiece
	 *  - Implement LegalMoveHighlighter
	 *
	 *    */

	int width, height;
	GameBoard board;

	public Chess(int width, int height){
		this.width = width;
		this.height = height;
	}

	@Override
	public void create () {
		board = new GameBoard(width, height);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		board.draw();
	}
	
	@Override
	public void dispose () {

	}
}
