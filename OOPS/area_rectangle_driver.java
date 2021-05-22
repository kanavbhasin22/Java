package oops;

public class area_rectangle_driver {

	public static void main(String[] args) {
		area_rectangle rect= new area_rectangle(6,8);  //parent reference parent instance 
		area_rectangle rect_2=new perimeter_rectangle(); // parent reference child instance
		perimeter_rectangle rect_3=new perimeter_rectangle(); // child reference child instance
		
		square_area square= new square_area();
		
		square.set_side(10);
		
		System.out.println(square.get_area());
		
		rect_2.set_length(5);
		rect_2.set_breadth(2);
		
		rect_3.set_length(10);
		rect_3.set_breadth(20);
		
		System.out.println(rect.get_length());
		System.out.println(rect.get_breadth());
		System.out.println(rect.get_area());
		
		System.out.println(rect_2.get_length());
		System.out.println(rect_2.get_breadth());
		System.out.println(rect_2.get_area());
		System.out.println(rect_2.diag); // parent variable resolved by reference
		System.out.println(((perimeter_rectangle)rect_2).diag); // type cast to access child variable
		System.out.println(((perimeter_rectangle)rect_2).get_perimeter()); //type cast to access child function
		
		System.out.println(rect_3.get_length());
		System.out.println(rect_3.get_breadth());
		System.out.println(rect_3.get_area());
		System.out.println(rect_3.get_perimeter());
		System.out.println(rect_3.diag); // child variable resolved by reference
		System.out.println(((area_rectangle)rect_3).diag); // type cast to access parent variable
		// Cannot type cast function
	}

}
