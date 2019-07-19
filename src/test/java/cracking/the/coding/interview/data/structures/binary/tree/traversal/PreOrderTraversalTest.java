package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.factory.BinaryTreeFactory;
import cracking.the.coding.interview.data.structures.binary.tree.factory.GenericBinaryTreeFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreOrderTraversalTest {

    private static BinaryTreeFactory<BinaryTreeNode<String>, String> binaryTreeFactory;

    private PreOrderTraversal preOrderTraversal;

    private BinaryTreeNode<String> rootNode;

    @BeforeAll
    static void setUpOnce() {

        PreOrderTraversalTest.binaryTreeFactory = new GenericBinaryTreeFactory<>();

    }

    @BeforeEach
    void setUp() {

        this.preOrderTraversal = new PreOrderTraversal();

        BinaryTreeNode<String> leftBranch = PreOrderTraversalTest.binaryTreeFactory.orderTree("2", "4", "6");
        BinaryTreeNode<String> rightBranch = PreOrderTraversalTest.binaryTreeFactory.orderTree(null, "10", "20");

        this.rootNode = PreOrderTraversalTest.binaryTreeFactory.orderTree(null, "8", null);

        this.rootNode.setLeftBranch(leftBranch);
        this.rootNode.setRightBranch(rightBranch);

    }

    @Test
    void traverse_givenBinarySearchTree_rootNodeVisitedFirstAndThenChildNodes() {

        /* interaction */
        this.preOrderTraversal.traverse(this.rootNode);

        /* assertions */
        assertEquals("8 4 2 6 10 20", this.preOrderTraversal.getTraversalRecords(), "The expected and actual values of the traversal records should be the same!");

    }

}
