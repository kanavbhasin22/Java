package linkedlist;

public class LinkedlList_client {

	public static void main(String[] args) throws Exception {
		Linkedlist list=new Linkedlist();
		list.display();
		list.addLast(10);
		list.addFirst(20);
		list.addLast(30);
		list.addFirst(40);
		list.display();
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list.getAt(1));
		list.removeFirst();
		list.display();
		list.removeLast();
		list.display();
		list.addLast(200);
		list.addLast(300);
		list.display();
		System.out.println(list.removeAt(3));
		list.reverseData();
		list.display();
		list.reversePointers();
		list.display();
		System.out.println(list.midnode());
		
		System.out.println(list.kth_node_from_end(3));
	}

}
