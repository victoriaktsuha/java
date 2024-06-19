package boardgame;

public class Board {
	
	//diferente e row e column da class Piece
	private int rows;
	private int columns;
	//matriz de pe�as
	private Piece[][] pieces;
	
	//a class n�o retornar� a matriz inteira e sim uma pe�a por vez, por isso n�o h� get e set para ela
	public Board(int row, int column) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}	
	
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//sobrecarga - retorna a pe�a pela posi��o
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
