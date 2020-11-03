package com.org;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, 
								{ '-', '+', '-', '+', '-' }, 
								{ ' ', '|', ' ', '|', ' ' },
								{ '-', '+', '-', '+', '-' }, 
								{ ' ', '|', ' ', '|', ' ' } };
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose ur Symbol X-O");
		String sym=scan.nextLine();
		String play = null;
		if (sym.equals("X")) {
			 play="player";
		} else if (sym.equals("O")) {
			 play="player";
		}
		else
			System.out.println("Invalid symbol....");

		System.out.println("Enter 1-9 num: ");
		int position=scan.nextInt();
		
		
		placePlace(gameBoard,position,play);
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

	public static void placePlace(char[][] gameBoard, int pos, String user) {

		char symbol = ' ';
		if (user.equals("player")) {
			symbol = 'X';
		} else if (user.equals("cpu")) {
			symbol = 'O';
		}
		switch (pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[3][0] = symbol;
			break;
		case 8:
			gameBoard[3][2] = symbol;
			break;
		case 9:
			gameBoard[3][4] = symbol;
			break;
		default:
			break;
		}
	}
}
