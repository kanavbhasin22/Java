package oops;

public class student {
	private String name;
	private int age;
	
	public void set_age(int n) throws Exception {
		if(age<=0) {
			throw new Exception("Age cannot be negative or 0");
		}
		this.age=n;
	}
	public void set_name(String str) throws Exception{
		if(str==null) {
			throw new Exception ("Name cannot be empty");
		}
		this.name=str;
	}
}
