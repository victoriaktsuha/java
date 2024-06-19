package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//imprime o tabuleiro com as peças
		UI.printBoard(chessMatch.getPieces());

	}
}
