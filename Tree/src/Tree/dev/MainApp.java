package Tree.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();

	        // Tạo cây nhị phân
	        tree.root = new Node("A", null, null);
	        tree.root.left = new Node("B", null, null);
	        tree.root.left.left = new Node("D", null, null);
	        tree.root.left.right = new Node("E", null, null);
	        tree.root.left.right.left = new Node("G", null, null);
	        tree.root.right = new Node("C", null, null);
	        tree.root.right.right = new Node("F", null, null);
	        tree.root.right.right.left = new Node("H", null, null);
	        tree.root.right.right.right = new Node("I", null, null);
	        tree.root.right.right.right.right = new Node("J", null, null);

	        // Kiểm tra cây rỗng
	        System.out.println("Cây rỗng : " + tree.isEmpty());

	        // Kiểm tra nút có phải là nút lá không
	        System.out.println("B là nút lá : " + tree.isLeaf(tree.root.left));
	        System.out.println("D là nút lá :  " + tree.isLeaf(tree.root.left.left));

	        // Kiểm tra nút n có phải là nút cha của nút m không
	        System.out.println("A có phải là nút cha của B : " + tree.isParent(tree.root, tree.root.left));
	        System.out.println("C có phải là nút cha của G :  " + tree.isParent(tree.root.right, tree.root.left.right.left));

	        // Tính chiều cao của cây
	        System.out.println("Chiều cao của cây: " + tree.getHeight(tree.root));

	        // Tính số nút của cây
	        System.out.println("Số nút của cây: " + tree.getNumberOfNodes(tree.root));

	        // Duyệt tiền tự
	        System.out.print("Duyệt tiền tự: ");
	       tree.preOrderTraversal(tree.root);
	        System.out.println();

	        // Duyệt trung tự
	        System.out.print("Duyệt trung tự: ");
	        tree.inOrderTraversal(tree.root);
	        System.out.println();

	        // Duyệt hậu tự
	        System.out.print("Duyệt hậu tự: ");
	        tree.postOrderTraversal(tree.root);
	        System.out.println();

	        // Đếm số nút lá của cây
	        System.out.println("Số nút lá của cây: " + tree.countLeaves(tree.root));

	        // Đếm số nút trung gian của cây
	        System.out.println("Số nút trung gian của cây: " + tree.countIntermediateNodes(tree.root));
	}
}
