import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TreeNodeTest {

    @Test
    public void shouldInsertElementInTree(){
        TreeNode tree = new TreeNode(10);
        tree.insert(11);

        assertTrue(tree.contains(11));
    }

    @Test
    public void shouldInsertMultipleElementsInTree(){
        TreeNode tree = new TreeNode(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);

        assertTrue(tree.contains(12));
    }

    //probs should change this to actually assert something
    @Test
    public void shouldTraverseInOrder(){
        TreeNode tree = new TreeNode(10);
        tree.insert(9);
        tree.insert(11);

        tree.traverseInOrder();
    }

    @Test
    public void shouldTraversePreOrder(){
        TreeNode tree = new TreeNode(10);
        tree.insert(9);
        tree.insert(11);

        tree.traversePreOrder();
    }

    @Test
    public void shouldTraversePostOrder(){
        TreeNode tree = new TreeNode(10);
        tree.insert(9);
        tree.insert(11);

        tree.traversePostOrder();
    }
}
