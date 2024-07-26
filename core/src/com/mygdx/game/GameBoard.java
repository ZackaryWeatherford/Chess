package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.chesspieces.*;

public class GameBoard {

    private static int WIDTH, HEIGHT;

    //
    public static SpriteBatch batch;

    //
    public static ChessPiece[][] board = new ChessPiece[8][8];

    //
    private static ChessPiece.ChessColor playersTurn = ChessPiece.ChessColor.WHITE;

    //
    public static boolean whiteAtBottom = true;

    //
    Sprite boardSprite;

    public static float scale;

    public static float squareLength;


    /***/
    public GameBoard(int width, int height){
        WIDTH = width;
        HEIGHT = height;


        batch = new SpriteBatch();
        boardSprite = new Sprite(Textures.GAME_BOARD);
        scale = WIDTH / boardSprite.getWidth();
        squareLength = (boardSprite.getWidth() / 8) * scale;

        initBoard();
    }

    /***/
    public void draw() {

        batch.begin();
        boardSprite.draw(batch);
        batch.draw(boardSprite, boardSprite.getX(), boardSprite.getY(), boardSprite.getWidth() * scale, boardSprite.getHeight() * scale);
        for (ChessPiece[] row : board)
            for (ChessPiece piece : row)
                if(piece != null)
                    piece.draw(batch, scale);

        batch.end();

    }

    /***/
    public void initBoard(){

        int whiteY = whiteAtBottom ? 0 : 7;
        int blackY = whiteAtBottom ? 7 : 0;

        //Init white pawns
        for(int i = 0; i < 8; i++){
            board[whiteAtBottom ? 1 : 6][i] = new Pawn(i, whiteAtBottom ? 1 : 6, ChessPiece.ChessColor.WHITE);
        }

        //Init black pawns
        for(int i = 0; i < 8; i++){
            board[whiteAtBottom ? 6 : 1][i] = new Pawn(i, whiteAtBottom ? 6 : 1, ChessPiece.ChessColor.BLACK);
        }

        //Init Rooks
        board[whiteY][0] = new Rook(0, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][0] = new Rook(0, blackY, ChessPiece.ChessColor.BLACK);

        board[whiteY][7] = new Rook(7, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][7] = new Rook(7, blackY, ChessPiece.ChessColor.BLACK);

        //Init Knights
        board[whiteY][1] = new Knight(1, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][1] = new Knight(1, blackY, ChessPiece.ChessColor.BLACK);

        board[whiteY][6] = new Knight(6, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][6] = new Knight(6, blackY, ChessPiece.ChessColor.BLACK);

        //Init Bishops
        board[whiteY][2] = new Bishop(2, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][2] = new Bishop(2, blackY, ChessPiece.ChessColor.BLACK);

        board[whiteY][5] = new Bishop(5, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][5] = new Bishop(5, blackY, ChessPiece.ChessColor.BLACK);

        //Init Queens
        board[whiteY][3] = new Queen(3, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][3] = new Queen(3, blackY, ChessPiece.ChessColor.BLACK);

        //Init Kings
        board[whiteY][4] = new King(4, whiteY, ChessPiece.ChessColor.WHITE);
        board[blackY][4] = new King(4, blackY, ChessPiece.ChessColor.BLACK);

    }

    /***/
    public void movePiece(ChessPiece movingPiece, ChessPiece newSpot){

    }

    public static int getWidth(){
        return WIDTH;
    }

    public static int getHeight(){
        return HEIGHT;
    }


}
