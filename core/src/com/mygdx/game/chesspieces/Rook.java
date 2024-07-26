package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Rook extends ChessPiece{

    /***/
    public Rook(int x, int y, ChessColor color){
        super(x, y, new Sprite(color == ChessColor.WHITE ? Textures.WHITE_ROOK : Textures.BLACK_ROOK), ChessTypes.ROOK, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return false;
    }

}
