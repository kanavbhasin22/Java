package oops;

public class perimeter_rectangle extends area_rectangle {
	final int diag=20;
	public int get_perimeter() {
		return 2*(this.length + this.breadth);
	}

}
