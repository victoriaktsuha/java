package boardgame;

public class Board {
	
	//diferente e row e column da class Piece
	private int rows;
	private int columns;
	//matriz de peças
	private Piece[][] pieces;
	
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
	
	//a class não retornará a matriz inteira e sim uma peça por vez, por isso não há get e set para ela
	
}
