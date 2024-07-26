package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Pawn extends ChessPiece{

    /***/
    public Pawn(int x, int y, ChessColor color){
        super(x, y, new Sprite(color == ChessColor.WHITE ? Textures.WHITE_PAWN : Textures.BLACK_PAWN), ChessTypes.PAWN, color);
    }

    /***/
    @Override
    public boolean validMove(ChessPiece[][] board) {
        return false;
    }
}
