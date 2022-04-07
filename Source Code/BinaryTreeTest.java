import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest 
{

    @Test
    public void testgetHeight()
    {
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = tree.getHeight();
        int expected = 4;

        // Assert
        assertEquals(result, expected);
    }

    @Test
    public void testgetHeight_callBinaryNodeMethod()
    {
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = tree.getHeight_callBinaryNodeMethod();
        int expected = 4;

        // Assert
        assertEquals(result, expected);
    }
    
    @Test
    public void testgetNumberOfNodes()
    {
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = tree.getNumberOfNodes();
        int expected = 7;

        // Assert
        assertEquals(result, expected);
    }

    @Test
    public void testgetNumberOfNodes_callBinaryNodeMethod()
    {
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = tree.getNumberOfNodes_callBinaryNodeMethod();
        int expected = 7;

        // Assert
        assertEquals(result, expected);
    }
}
