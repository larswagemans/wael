package nl.codeforall.cannabits.gamelogic;

//position on the field
public class Cell {

    private int col;
    private int row;
    private boolean passable;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        passable = true;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setNotPassable() {
        this.passable = false;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    //move one position up on field

    public void moveUp() {
        this.row--;
    }

    public void moveDown() {
        this.row++;
    }

    public void moveLeft() {
        this.col--;
    }

    public void moveRight() {
        this.col++;
    }

    public boolean compareCells(Cell other){
        if (row == other.getRow() && col == other.getCol()) {
            return true;
        }
        return false;
    }
}

