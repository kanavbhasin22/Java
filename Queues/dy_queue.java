package queues;

public class dy_queue extends queue_circular_array{
	
	public void enqueue(int item){
		if(isFull()) {
		int[] na=new int[2*arr.length];
		for(int i=0;i<this.size();i++) {
			int idx=(i+this.front)%this.arr.length;
			na[i]=arr[idx];
		}
		arr=na;
		front=0;
	}
	super.enqueue(item);
}
}