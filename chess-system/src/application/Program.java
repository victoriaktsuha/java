package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//imprime o tabuleiro com as pe�as
		UI.printBoard(chessMatch.getPieces());

	}
}
