package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//recebe e imprime a matriz de peças
		UI.printBoard(chessMatch.getPieces());

	}

}
