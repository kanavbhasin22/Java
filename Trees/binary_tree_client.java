package trees;

public class binary_tree_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_tree tree= new binary_tree();
		tree.display();
		System.out.println(tree.height(tree.root));
		tree.postOrder();
		tree.preOrder();
		tree.levelOrder();
		System.out.println(tree.isBST());
		System.out.println(tree.diameter());
		System.out.println(tree.sum_leaf());
	}
}
