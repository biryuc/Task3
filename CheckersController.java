package com.company;


import java.awt.event.MouseEvent;
import java.util.Scanner;
import com.company.CheckersView;
public class CheckersController {
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

        //repaint();
    }
    //@Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    //@Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    //@Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

   // @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}