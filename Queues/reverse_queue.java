package queues;
import java.util.*;
public class reverse_queue {

	public static void main(String[] args) {
		dy_queue q=new dy_queue();
		for(int i=1;i<=5;i++) {
			q.enqueue(i);
		}
		q.display();
		reverse(q);
		q.display();
	}
	public static void reverse(dy_queue q) {
		if(q.isEmpty()) {
			return;
		}
		int element=q.dequeue();
		reverse(q);
		q.enqueue(element);
	}
}
