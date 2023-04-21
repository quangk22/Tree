package Tree.dev;
	
public class BinaryTree {
	 Node root;

	    public BinaryTree() {
	        root = null;
	    }

	    // Kiểm tra cây rỗng
	    public boolean isEmpty() {
	        return root == null;
	    }

	    // Kiểm tra nút có phải là nút lá không
	    public boolean isLeaf(Node node) {
	        return (node.left == null && node.right == null);
	    }

	    // Kiểm tra nút n có phải là nút cha của nút m không
	    public boolean isParent(Node n, Node m) {
	        return (n.left == m || n.right == m);
	    }

	    // Tính chiều cao của cây
	    public int getHeight(Node node) {
	        if (node == null) {
	            return 0;
	        } else {
	            int leftHeight = getHeight(node.left);
	            int rightHeight = getHeight(node.right);
	            return Math.max(leftHeight, rightHeight) + 1;
	        }
	    }

	    // Tính số nút của cây
	    public int getNumberOfNodes(Node node) {
	        if (node == null) {
	            return 0;
	        } else {
	            return getNumberOfNodes(node.left) + getNumberOfNodes(node.right) + 1;
	        }
	    }

	    // Duyệt tiền tự
	    public void preOrderTraversal(Node node) {
	        if (node != null) {
	            System.out.print(node.data + " ");
	            preOrderTraversal(node.left);
	            preOrderTraversal(node.right);
	        }
	    }

	    // Duyệt trung tự
	    public void inOrderTraversal(Node node) {
	        if (node != null) {
	            inOrderTraversal(node.left);
	            System.out.print(node.data + " ");
	            inOrderTraversal(node.right);
	        }
	    }

	    // Duyệt hậu tự
	    public void postOrderTraversal(Node node) {
	        if (node != null) {
	            postOrderTraversal(node.left);
	            postOrderTraversal(node.right);
	            System.out.print(node.data + " ");
	        }
	    }

	    // Đếm số nút lá của cây
	    public int countLeaves(Node node) {
	        if (node == null) {
	            return 0;
	        } else if (isLeaf(node)) {
	            return 1;
	        } else {
	            return countLeaves(node.left) + countLeaves(node.right);
	        }
	    }

	    // Đếm số nút trung gian của cây
	    public int countIntermediateNodes(Node node) {
	        if (node == null || isLeaf(node)) {
	            return 0;
	        } else {
	            return countIntermediateNodes(node.left) + countIntermediateNodes(node.right) + 1;
	        }
	    }
	}
