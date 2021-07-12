package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // protected permite somente as classes do mesmo pacote e as subclasses de Piece acessarem o atributo
    protected Board getBoard() {
        return board;
    }
}
