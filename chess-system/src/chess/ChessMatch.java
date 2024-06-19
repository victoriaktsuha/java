package chess;

import boardgame.Board;

//nessa classe que ter�o as regras do jogo
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//nessa classe que � delcarada a dimens�o do tabuleiro
		board = new Board(8, 8);
	}
	
	//retorna matriz de pe�as correspondente a partida
	//ChessPiece � a 'camada' de Piece que pode ser 'vista' - s� a camada 'chess' deve ser vista pelo programa
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		//percorre a matriz de pe�as do board e para cada pe�a faz um downcasting para ChessPiece
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
