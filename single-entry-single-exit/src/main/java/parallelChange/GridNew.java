package parallelChange;

import java.util.Map;

public class GridNew {
	// After refactoring
	
	
    private Map<Coordinate, Cell> newCells;
    
    public void addCell(Coordinate coordinate, Cell cell) {
    	newCells.put(coordinate, cell);
    }

	public Cell fetchCell(Coordinate coordinate) {
		return newCells.get(coordinate);
	}
	
	public boolean isEmpty(Coordinate coordinate) {
		return !newCells.containsKey(coordinate);
	}
 
}
