package parallelChange;

public class Grid {
	// Before refactoring
	
	
    private Cell[][] cells;

    public void addCell(int x, int y, Cell cell) {
      cells[x][y] = cell;
    }

    public Cell fetchCell(int x, int y) {
      return cells[x][y];
    }

    public boolean isEmpty(int x, int y) {
      return cells[x][y] == null;
    }
 
}
