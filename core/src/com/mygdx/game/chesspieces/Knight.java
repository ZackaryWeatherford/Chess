package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Knight extends ChessPiece{

    /***/
    public Knight(int x, int y, ChessColor color){
        super(x, y, new Sprite(color == ChessColor.WHITE ? Textures.WHITE_KNIGHT : Textures.BLACK_KNIGHT), ChessTypes.KNIGHT, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return false;
    }

}
