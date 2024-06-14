package boardgame;

public class Piece {
	
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
	
	
}
