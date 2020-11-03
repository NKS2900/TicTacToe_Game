package com.org;

public class BoardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, 
								{ '-', '+', '-', '+', '-' }, 
								{ ' ', '|', ' ', '|', ' ' },
								{ '-', '+', '-', '+', '-' }, 
								{ ' ', '|', ' ', '|', ' ' } };
		printGameBoard(gameBoard);
			
	}
	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}	
	}
}
