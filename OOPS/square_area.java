package oops;

public class square_area extends area_rectangle {
	private int side;
	
	public void set_side(int s) {
		this.side=s;
	}
	
	@Override
	public int get_area() {
		return side*side;
	}
}
