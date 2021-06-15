package linkedlist;

public class Linkedlist {
	private class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	protected int size;
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public void display() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void addLast(int item) {
		Node nn=new Node();
		nn.data=item;
		nn.next=null;
		
		if(this.size>=1) {
			this.tail.next=nn;
		}
		
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			this.tail=nn;
			this.size++;
		}
	}
	public void addFirst(int item) {
		Node nn=new Node();
		nn.data=item;
		nn.next=null;
		
		if(this.size>=1) {
			nn.next=head;
		}
		
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			this.head=nn; 
			this.size++;
		}
	}
	public int getFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}
	public int getLast() throws Exception{
		if(this.size==0) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}
	public int getAt(int index) throws Exception{
		if(this.size==0) {
			throw new Exception("List is empty");
		}
		if(index<0 || index>=this.size) {
			throw new Exception("Invalid Index");
		} 
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	private Node getNodeAt(int index) throws Exception{
		if(this.size==0) {
			throw new Exception("List is empty");
		}
		if(index<0 || index>=this.size) {
			throw new Exception("Invalid Index");
		} 
		Node temp=head;
		for(int i=0;i<=index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public void addAt(int item,int idx) throws Exception {
		if(idx<0 || idx>size) {
			throw new Exception("Invalid Index");
		}
		if(idx==0) {
			addFirst(item);
		}
		else if (idx==this.size) {
			addLast(item);
		}
		else {
			Node nn= new Node();
			nn.data=item;
			nn.next=null;
			
			Node nm1=getNodeAt(idx-1);
			Node np1=nm1.next;
			
			nm1.next=nn;
			nn.next=np1;
			
			this.size++;
		}
	}
	public int removeFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LinkedList empty");
		}
		int rv=this.head.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else {
			this.head=this.head.next;
			size--;
		}
		return rv;
	}
	public int removeLast() throws Exception{
		if(this.size==0) {
			throw new Exception("Empty list");
		}
		int rv=this.tail.data;
		
		if(size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		else {
			Node sm2=getNodeAt(this.size-2);
			this.tail=sm2;
			this.tail.next=null;
			this.size--;
		}
		return rv;
	}
	public int removeAt(int idx) throws Exception{
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid index");
		}
		else if(this.size==0) {
			throw new Exception("List full");
		}
		if(idx==0) {
			return removeFirst();
		}
		else if(idx==this.size-1) {
			return removeLast();
		}
		else {
			Node nm1=getNodeAt(idx-1);
			Node nn=nm1.next;
			Node np1=nn.next;
			
			nm1.next=np1;
			this.size--;
			return nn.data;
		}
	}
	
	public void reverseData() throws Exception {
		int left=0;
		int right=this.size-1;
		
		while(left<right) {
			Node ln=getNodeAt(left);
			Node rn=getNodeAt(right);
			
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
			
			left++;
			right--;
		}
	}
	public void reversePointers() {
		Node prev=this.head;
		Node curr=prev.next;
		
		while(curr!=null) {
			Node ahead=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=ahead;
		}
		Node t=this.head;
		this.head=this.tail;
		this.tail=t;
		
		this.tail.next=null;
	} 
	public int midnode() {
		Node slow=this.head;
		Node fast=this.head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	public int kth_node_from_end(int k) throws Exception{
		if(k<=0 || k>this.size) {
			throw new Exception("Invalid index");
		}
		Node slow=this.head;
		Node fast=this.head;
		
		for(int i=1;i<=k;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
	}
}
