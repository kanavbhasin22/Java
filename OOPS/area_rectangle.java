package oops;

public class area_rectangle { // class
	public int length;
	public int breadth;
	final int diag=10;
	
	public area_rectangle(int l,int b) { // class constructor
		this.length=l;
		this.breadth=b;
	}
	
	public area_rectangle() { // class constructor
		}
	
	public void set_length(int l){ // class method
		this.length=l;
	}
	
	public void set_breadth(int b) {
		this.breadth=b;
	}
	
	public int get_length() {
		return this.length;
	}
	
	public int get_breadth() {
		return this.breadth;
	}
	
	public int get_area() {
		return this.length*this.breadth;
	}
}
