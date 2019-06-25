package parallelChange;

public class Parent {

	public static void main(String[] args) {
		Grid grid = new Grid();
		
		// Before refactoring
		grid.addCell(0, 0, new Cell("Cell 0, 0"));
		grid.addCell(0, 1, new Cell("Cell 0, 1"));
		grid.addCell(1, 0, new Cell("Cell 1, 0"));
		grid.addCell(1, 1, new Cell("Cell 1, 1"));
		
		System.out.println(grid.fetchCell(1, 1).cellData);
		System.out.println(grid.fetchCell(1, 0).cellData);
		
		
		// After refactoring
		GridNew newGrid = new GridNew();
		
		Coordinate coordinate00 = new Coordinate(0, 0);
		Coordinate coordinate01 = new Coordinate(0, 1);
		Coordinate coordinate10 = new Coordinate(1, 0);
		Coordinate coordinat11 = new Coordinate(1, 1);

		newGrid.addCell(coordinate00, new Cell("Cell 0, 0"));
		newGrid.addCell(coordinate01, new Cell("Cell 0, 1"));
		newGrid.addCell(coordinate10, new Cell("Cell 1, 0"));
		newGrid.addCell(coordinat11, new Cell("Cell 1, 1"));
		
		System.out.println(newGrid.fetchCell(coordinate00).cellData);
		System.out.println(newGrid.fetchCell(coordinate01).cellData);
	}

}
