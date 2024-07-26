package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class King extends ChessPiece{

    /***/
    public King(int x, int y, ChessPiece.ChessColor color){
        super(x, y, new Sprite(color == ChessPiece.ChessColor.WHITE ? Textures.WHITE_KING : Textures.BLACK_KING), ChessPiece.ChessTypes.KING, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return true;
    }

}
