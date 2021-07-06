package trees;
import java.util.*;
public class generic_tree {
	private class Node{
		int data;
		ArrayList<Node> children;
		Node(int data){
			this.data=data;
			this.children=new ArrayList<>();
		}
	}
	private Node root;
	private int size;
	
	generic_tree() {
		Scanner s=new Scanner(System.in);
		this.root=input(s,null,0);
		
	}
	private Node input(Scanner s,Node parent, int child) {
		if(parent==null) {
			System.out.println("Enter data for root node: ");
		}
		else {
			System.out.println("Enter the data for "+child+"th child of parent "+parent.data);
		}
		int nodedata=s.nextInt();
		Node node=new Node(nodedata);
		this.size++;
		
		System.out.println("Enter the number of children for "+ node.data);
		int children=s.nextInt();
		
		for(int i=0;i<children;i++) {
			Node childi=this.input(s, node, i);
			node.children.add(childi);
		}
		return node;
	}
	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		String str=node.data+"=>";
		for(int i=0;i<node.children.size();i++) {
			// add children data
			str=str+node.children.get(i).data +" , ";
		}
		str=str+"END";
		System.out.println(str);
		//display for all nodes
		for(int i=0;i<node.children.size();i++) {
			this.display(node.children.get(i));
		}
	}
}
