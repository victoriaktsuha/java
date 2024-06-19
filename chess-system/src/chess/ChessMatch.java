package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//nessa classe que terão as regras do jogo
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//nessa classe que é declarada a dimensão do tabuleiro
		board = new Board(8, 8);
		//inicia a partida
		initialSetup();
	}
	
	//retorna matriz de peças correspondente a partida
	//ChessPiece é a 'camada' de Piece que pode ser 'vista' - só a camada 'chess' deve ser vista pelo programa
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		//percorre a matriz de peças do board e para cada peça faz um downcasting para ChessPiece
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	//inicia a partida, colocando as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
