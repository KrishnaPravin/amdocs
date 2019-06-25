package parallelChange;

import java.util.Map;

public class GridBeta {
	// During refactoring - expanding phase
	
	
    private Cell[][] cells;
    private Map<Coordinate, Cell> newCells;
    
    public GridBeta() {
		this.cells = new Cell[10][10];
//		this.newCells = new Map<Coordinate, Cell>() {};
	}

    public void addCell(int x, int y, Cell cell) {
    	this.cells[x][y] = cell;
    }
    
    public void addCell(Coordinate coordinate, Cell cell) {
    	this.newCells.put(coordinate, cell);
    }

    public Cell fetchCell(int x, int y) {
    	return this.cells[x][y];
    }

	public Cell fetchCell(Coordinate coordinate) {
		return this.newCells.get(coordinate);
	}
	
	public boolean isEmpty(int x, int y) {
		return this.cells[x][y] == null;
	}
	
	public boolean isEmpty(Coordinate coordinate) {
		return !this.newCells.containsKey(coordinate);
	}
 
}
