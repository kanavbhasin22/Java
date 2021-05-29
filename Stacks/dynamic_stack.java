package stacks;

public class dynamic_stack extends stack_as_array {
	public dynamic_stack() throws Exception{
		this(defaultval);
	}
	public dynamic_stack(int cap) throws Exception{
		super(cap);
	}
	public void push(int item) throws Exception {
		if(this.size()==data.length) {
			int[] arr=new int[2*data.length];
			for(int i=0;i<this.size();i++) {
				arr[i]=this.data[i];
			}
			this.data=arr;
		}
		super.push(item);
	}

}
