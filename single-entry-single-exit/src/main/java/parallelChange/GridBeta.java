package parallelChange;

import java.util.Map;

public class GridBeta {
	// During refactoring - expanding phase
	
	
    private Cell[][] cells;
    private Map<Coordinate, Cell> newCells;

    public void addCell(int x, int y, Cell cell) {
    	cells[x][y] = cell;
    }
    
    public void addCell(Coordinate coordinate, Cell cell) {
    	newCells.put(coordinate, cell);
    }

    public Cell fetchCell(int x, int y) {
    	return cells[x][y];
    }

	public Cell fetchCell(Coordinate coordinate) {
		return newCells.get(coordinate);
	}
	
	public boolean isEmpty(int x, int y) {
		return cells[x][y] == null;
	}
	
	public boolean isEmpty(Coordinate coordinate) {
		return !newCells.containsKey(coordinate);
	}
 
}
