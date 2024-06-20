package boardgame;

public class Board {
	
	//diferente e row e column da class Piece
	private int rows;
	private int columns;
	//matriz de pe�as
	private Piece[][] pieces;
	
	//a class n�o retornar� a matriz inteira e sim uma pe�a por vez, por isso n�o h� get e set para ela
	public Board(int rows, int columns) {
		//defensivo
		if(rows < 1 && columns < 1 ) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		//defensivo
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	//sobrecarga - retorna a pe�a pela posi��o
	public Piece piece(Position position) {
		//defensivo
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}	
	
	//remover pe�as
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if(piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	//atribui a pe�a na posi��o informada, n�o estando mais nula
	public void placePiece(Piece piece, Position position) {
		//defensivo
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//valida se a posi��o est� dentro da dimens�o do tabuleiro
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	//valida a posi��o recebida
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	//valida se h� uma pe�a na posi��o
	public boolean thereIsAPiece(Position position) {
		//defensivo
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
