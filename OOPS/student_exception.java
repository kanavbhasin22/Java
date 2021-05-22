package oops;

public class student_exception {

	public static void main(String[] args) throws Exception {
		student s1=new student();
		try {
		s1.set_age(0);
		} catch(Exception e) {
			System.out.println("Age cannot be 0");
		}
		s1.set_name("Kanav");	
	}

}
