package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;


public abstract class ChessPiece {

    //Chess Types
    public enum ChessTypes {PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, EMPTY}

    //
    ChessTypes type;

    //
    Sprite sprite;
    int x, y;

    public ChessPiece(int x, int y, Sprite sprite, ChessTypes type){

    }

    /**
     *
     */
    public abstract boolean moveCheck(ChessPiece newSpot);


}
