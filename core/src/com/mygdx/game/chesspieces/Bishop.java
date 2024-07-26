package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Bishop extends ChessPiece{

    /***/
    public Bishop(int x, int y, ChessColor color){
        super(x, y, new Sprite(color == ChessColor.WHITE ? Textures.WHITE_BISHOP : Textures.BLACK_BISHOP), ChessTypes.BISHOP, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return false;
    }

}
