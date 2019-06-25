package parallelChange;

public class Parent {

	public static void main(String[] args) {
		Grid grid = new Grid();
		
		// Before refactoring
		grid.addCell(0, 0, new Cell("0,0"));
		grid.addCell(0, 1, new Cell("0, 1"));
		grid.addCell(0, 0, new Cell("1,0"));
		grid.addCell(0, 1, new Cell("1, 1"));
		
		System.out.println(grid.fetchCell(1, 1).cellData);
		System.out.println(grid.fetchCell(1, 0).cellData);
	}

}
