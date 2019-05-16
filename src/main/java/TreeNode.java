/*Binary Search Tree is a tree data structure
which consists of parent nodes and child nodes.
Each parent node has two child nodes.
Nodes to the left of the parent will always be less than
Nodes to the right of the parent will always be greater than
Traversals can be pre-order, inorder, or post order
*/
public class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }

    //Inserts an element into the tree
    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    //Checks if an element is in the tree
    public boolean contains(int value) {
        if (value == data) {
            return true;
        }

        if (value < data) {
            return left == null ? false : left.contains(value);
        } else {
            return right == null ? false : right.contains(value);
        }
    }

    //prints nodes in order
    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }

        System.out.println(data);

        if (right != null) {
            right.traverseInOrder();
        }
    }

    //prints nodes while pre order traversing
    public void traversePreOrder() {
        System.out.println(data);

        if (left != null) {
            left.traversePreOrder();
        }

        if (right != null) {
            right.traverseInOrder();
        }
    }

    //prints nodes while post order traversing
    public void traversePostOrder() {
        if (right != null) {
            right.traversePostOrder();
        }

        System.out.println(data);

        if (left != null) {
            left.traversePostOrder();
        }
    }
}
