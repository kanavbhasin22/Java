package functions;

public class add {
	public static int a=2; //Global variable

	public static void main(String[] args) {
		System.out.println(a);
		int a=add(42,64); //Local Variable
		System.out.println(a);
		System.out.println(add.a); //Accessing global variable

	}
	public static int add(int x,int y) {
		int sum=x+y;
		return sum;
	}

}
