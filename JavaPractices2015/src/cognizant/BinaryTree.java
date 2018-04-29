package cognizant;

//Java implementation to find leaf count of a given Binary tree

/* Class containing left and right child of current 
node and key value*/
class Node {

  int data;
  Node left, right,parent;

  public Node(int item) {
      data = item;
      parent=left = right = null;
      
  }
}

public class BinaryTree {

  //Root of the Binary Tree
  Node root;
   
  /* Function to get the count of leaf nodes in a binary tree*/
  int getLeafCount() {
      return getLeafCount(root);
  }

  int getLeafCount(Node node) {
      if (node == null) {
          return 0;
      }
      if (node.left == null && node.right == null) {
          return 1;
      } else {
          return getLeafCount(node.left) + getLeafCount(node.right);
      }
  }
  int getSumOfLeftLeaf(){
	 return getSumOfLeftLeaf(root);
  }
 int getSumOfLeftLeaf(Node node){
	 if(node == null){
		  return 0;
	  }
	  if(node.left==null && node.left.data< node.parent.data){
		  return node.left.data;
	  }
	  else{
		  return 0;
		  
	  }
 }
  
  /* Driver program to test above functions */
  public static void main(String args[]) {
      BinaryTree tree = new BinaryTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);      
      tree.root.right = new Node(3);
      tree.root.left.parent=tree.root;
      tree.root.right.parent=tree.root;
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      tree.root.left.left.parent=tree.root.left;
      tree.root.left.right.parent=tree.root.left;
      /* get leaf count of the abve tree */
      System.out.println("The leaf count of binary tree is : " + tree.getLeafCount());
      System.out.println("The left leaf Sum of binary tree is : " + tree.getSumOfLeftLeaf());
  }
}
