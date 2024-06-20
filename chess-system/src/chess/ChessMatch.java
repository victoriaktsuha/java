package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//nessa classe que ter�o as regras do jogo
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//nessa classe que � declarada a dimens�o do tabuleiro
		board = new Board(8, 8);
		//inicia a partida
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//inicia a partida, colocando as pe�as no tabuleiro
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
