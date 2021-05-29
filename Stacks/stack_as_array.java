package stacks;

public class stack_as_array {
	protected int[] data;
	protected int top;
	
	public static final int defaultval=10;
	
	public stack_as_array() throws Exception {
		this(defaultval);
	}
	
	public stack_as_array(int n) throws Exception {
		if(n<1) {
			throw new Exception("Invalid Capacity");
		}
		this.data=new int[n];
		this.top=-1;
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void push(int val) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception ("Stack is full");
		}
		this.top++;
		this.data[this.top]=val;
	}
	
	public int pop() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		int val=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return val;		
	}
	public int top() throws Exception{
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		int val=this.data[this.top];
		return val;
	}
	public void display() {
		for(int i=this.top;i>=0;i--) {
			System.out.println(this.data[i]);
		}
		System.out.println("END");
	}
}
