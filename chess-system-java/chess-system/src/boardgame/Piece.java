package boardgame;

public abstract class Piece {
	
	//acessivel apenas para classes do mesmo pacote e subclasses
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//para indicar que inicialmente não há nenhuma peça no tabuleiro
		position = null; // ou não incluir nada; null é default
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//hook method - metodo que faz um 'gancho' com a subclasse
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
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
