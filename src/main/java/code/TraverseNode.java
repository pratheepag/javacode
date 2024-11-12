package code;

class BinaryNode {

	public String data;
	public BinaryNode leftNode;
	public BinaryNode rightNode;
	public BinaryNode(String x){
		data = x;
		leftNode = null;
		rightNode = null;
	}
	public void leftNodeTraverse(BinaryNode root, boolean isParent) {
		if(null == root) {
			return;
		}else if(isParent) {
			System.out.println(root.data);
		}
		if(null != root.leftNode) {
			 System.out.println(root.leftNode.data);
			 leftNodeTraverse(root.leftNode, false);
		}
		
		if(null != root.rightNode) {
			System.out.println(root.rightNode.data);
			leftNodeTraverse(root.rightNode, false);
		}
	}
}
public class TraverseNode{
	public static void main(String args[]) {
		BinaryNode root = new BinaryNode("x");
		root.leftNode = new BinaryNode("I");
		root.rightNode = new BinaryNode("y");
		
		root.rightNode.rightNode = new BinaryNode("z");
		root.rightNode.rightNode.leftNode = new BinaryNode("1");
		root.rightNode.rightNode.rightNode = new BinaryNode("2");
		root.rightNode.rightNode.rightNode.leftNode = new BinaryNode("3");
		root.rightNode.rightNode.rightNode.rightNode = new BinaryNode("4");
		root.leftNodeTraverse(root, true);
	}
}
