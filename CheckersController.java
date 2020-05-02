package com.company;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import com.company.CheckersView;
public class CheckersController<notification> implements MouseListener {
    CheckersModel model;
    CheckersView view;
    CheckersModel boardState;


    //ArrayList<Move> requestedMoves;
    boolean gameIsHappening;
    int currPlayer;
    Move[] possibleMoves;
    int currRow, currCol;
    int currMove = 0; //start for going over requestedMoves at 0
    public CheckersController(CheckersModel model, CheckersView view) {
        this.model = model;
        this.view = view;
    }
    public void startGame() {
        boardState.createBoard();
        gameIsHappening = true;
        currPlayer = CheckersModel.RED;
        possibleMoves = boardState.currentPossibleMoves(CheckersModel.RED);
        System.out.println("possibleMoves count is: " + possibleMoves.length);
        currRow = -1;


    }
    public void mousePressed(MouseEvent e) {
        int col = (e.getX() - 2) / 30;
        int row = (e.getY() - 2) / 30;
        System.out.println(row + ", " + col);
        //squareClicked(row, col);}
        //@Override
    }
    public void squareClicked(int row, int col) {

        // If the selected row/column has a piece AND
        // is one of the fromRow and fromCol of the possibleMoves
        // then update the currRow and currCol and repaint()
        for (Move move: possibleMoves) {
            if(move.fromRow == row && move.fromCol == col) {
                currRow = row;
                currCol = col;

                return;
            }
        }



        for(Move move: possibleMoves) {
            if(move.fromRow == currRow && move.fromCol == currCol &&
                    move.toRow == row && move.toCol == col) {
               
                return;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {


    }

    //@Override
    public void mouseEntered(MouseEvent e) {


    }

    //@Override
    public void mouseExited(MouseEvent e) {


    }

   // @Override
    public void mouseClicked(MouseEvent e) {


    }
}