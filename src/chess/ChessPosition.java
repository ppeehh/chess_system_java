package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
<<<<<<< HEAD
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values era from a1 to h8");
>>>>>>> d8c5dfdc5e2e986eccedff5318092c7088a3d557
		}
		this.column = column;
		this.row = row;
	}
<<<<<<< HEAD

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
=======
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
>>>>>>> d8c5dfdc5e2e986eccedff5318092c7088a3d557
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
<<<<<<< HEAD
=======
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
>>>>>>> d8c5dfdc5e2e986eccedff5318092c7088a3d557
}
