package com.bridgelab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
     static char computerLetter ;
    static void createBoard(char[] board) {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }
    static void chooseLetter(){
        System.out.println(" choose Capital Letter X and O ");
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
    static void showBoard(char[] board){
        System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
    }

}

class Main{
    static char[] board = new char[10];
    public static void main(String[] args) {
        TicTacToeGame.createBoard(board);
        TicTacToeGame.chooseLetter();
        TicTacToeGame.showBoard(board);
    }
}



