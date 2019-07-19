package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.factory.BinaryTreeFactory;
import cracking.the.coding.interview.data.structures.binary.tree.factory.GenericBinaryTreeFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelOrderTraversalTest {

    private static BinaryTreeFactory<BinaryTreeNode<Integer>, Integer> binaryTreeFactory;

    private LevelOrderTraversal levelOrderTraversal;

    private BinaryTreeNode<Integer> rootNode;

    @BeforeAll
    static void setUpOnce() {

        LevelOrderTraversalTest.binaryTreeFactory = new GenericBinaryTreeFactory<>();

    }

    @BeforeEach
    void setUp() {

        this.levelOrderTraversal = new LevelOrderTraversal();

        BinaryTreeNode<Integer> leftBranch = LevelOrderTraversalTest.binaryTreeFactory.orderTree(1, 2, null);

        BinaryTreeNode<Integer> rightBranch = LevelOrderTraversalTest.binaryTreeFactory.orderTree(4, 5, 7);

        this.rootNode = LevelOrderTraversalTest.binaryTreeFactory.orderTree(null, 3, null);

        this.rootNode.setLeftBranch(leftBranch);
        this.rootNode.setRightBranch(rightBranch);

    }

    @Test
    void traverse_givenBinarySearchTree_breadthFirstSearchExecutedSuccessfully() {

        /* interaction */
        this.levelOrderTraversal.traverse(this.rootNode);

        /* assertions */
        assertEquals("3 2 5 1 4 7", this.levelOrderTraversal.getTraversalRecords(), "The expected and actual values of the traversal records should be the same!");

    }

}
