package com.amdocs.refactoring.parallelChange;

import java.util.HashMap;
import java.util.Map;

public class GridNew {
	// After refactoring
	
	
    private Map<Coordinate, Cell> newCells;
    
    public GridNew() {
    	this.newCells = new HashMap<Coordinate, Cell>();
	}
    
    public void addCell(Coordinate coordinate, Cell cell) {
    	this.newCells.put(coordinate, cell);
    }

	public Cell fetchCell(Coordinate coordinate) {
		return this.newCells.get(coordinate);
	}
	
	public boolean isEmpty(Coordinate coordinate) {
		return !this.newCells.containsKey(coordinate);
	}
 
}
