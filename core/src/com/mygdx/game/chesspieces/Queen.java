package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Queen extends ChessPiece{

    /***/
    public Queen(int x, int y, ChessColor color){
        super(x, y, new Sprite(color == ChessColor.WHITE ? Textures.WHITE_QUEEN : Textures.BLACK_QUEEN), ChessTypes.QUEEN, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return false;
    }

}
