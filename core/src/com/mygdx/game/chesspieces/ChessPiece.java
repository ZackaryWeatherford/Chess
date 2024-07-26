package com.mygdx.game.chesspieces;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameBoard;

public abstract class ChessPiece {

    //
    public enum ChessTypes {PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING}
    public enum ChessColor {BLACK, WHITE}

    //
    int x, y;
    Sprite sprite;
    ChessTypes chessType;
    ChessColor color;

    /**
     *
     * */
    public ChessPiece(int x, int y, Sprite sprite, ChessTypes chessType, ChessColor color){
        this.x = x;
        this.y = y;
        this.sprite = sprite;
        this.chessType = chessType;
        this.color = color;
        sprite.setPosition(x * GameBoard.squareLength, y * GameBoard.squareLength);
    }

    /**
     * */
    public void draw(SpriteBatch batch, float scale){
        batch.draw(sprite, sprite.getX(), sprite.getY(), sprite.getWidth() * scale, sprite.getHeight() * scale);
    }

    /**
     *
     * */
    public abstract boolean validMove(ChessPiece[][] board);


}
