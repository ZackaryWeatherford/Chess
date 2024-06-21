package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.chesspieces.ChessPiece;
import com.mygdx.game.chesspieces.EmptyPiece;

public class Board {


    SpriteBatch batch;

    //
    public static ChessPiece[][] board = new ChessPiece[8][8];


    /**
     *
     */
    public Board(){
        batch = new SpriteBatch();

    }

    /***/
    public void draw(){

    }

    /**
     *
     */
    public void setBoard(){

        //Set Rooks


        //Set Knights


        //Set Bishops


        //Set Kings


        //Set Queens


        //Set Kings




    }

    /**
     *
     */
    public boolean moviePiece(ChessPiece movingPiece, ChessPiece newSpot){

        if(!movingPiece.moveCheck(newSpot))
            return false;



        return true;
    }



}
