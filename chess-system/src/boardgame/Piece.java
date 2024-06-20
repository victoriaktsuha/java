package boardgame;

public abstract class Piece {
	
	//protected - somente classes do mesmo pacote e subclasses podem acessar
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	//hook methods - faz 'gancho' com a subclasse 
	//template method - implementação padrão de um método que depende de um método abstrato
	public abstract boolean[][] possibleMoves();
	
	//implementação padrão concreta que depende de um método abstrato
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//implementação padrão concreta que depende de um método abstrato
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
