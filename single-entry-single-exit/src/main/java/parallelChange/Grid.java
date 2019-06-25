package parallelChange;

public class Grid {
	// Before refactoring
	
	
    private Cell[][] cells;
    
    public Grid() {
		this.cells = new Cell[10][10];
	}

    public void addCell(int x, int y, Cell cell) {
      this.cells[x][y] = cell;
    }

    public Cell fetchCell(int x, int y) {
      
      return this.cells[x][y];
    }

    public boolean isEmpty(int x, int y) {
      return this.cells[x][y] == null;
    }
 
}
