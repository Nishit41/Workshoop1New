package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
     static char computerLetter ;
    static void createBoard(char[] board) {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }
    static void chooseLetter(){
        System.out.println(" choose Letter X and O ");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if(input == 'X')
        {
            computerLetter ='O';
            System.out.println("computerLetter=>"+computerLetter);
        }
        else if(input == 'O'){
         computerLetter = 'X';
            System.out.println("computerLetter"+computerLetter);
        }
    }
}

class Main{
    static char[] board = new char[10];
    public static void main(String[] args) {
        TicTacToeGame.createBoard(board);
        TicTacToeGame.chooseLetter();
    }
}



