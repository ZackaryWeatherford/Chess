package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;

/** */
public class EmptyPiece extends ChessPiece{

    /** */
    public EmptyPiece(int x, int y){

        super(x, y, new Sprite(), ChessTypes.EMPTY);
    }

    /** */
    @Override
    public boolean moveCheck(ChessPiece newSpot) {
        return false;
    }
}
