package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.factory.BinaryTreeFactory;
import cracking.the.coding.interview.data.structures.binary.tree.factory.GenericBinaryTreeFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InOrderTraversalTest {

    private static BinaryTreeFactory<BinaryTreeNode<String>, String> binaryTreeFactory;

    private InOrderTraversal inOrderTraversal;

    private BinaryTreeNode<String> rootNode;

    @BeforeAll
    static void setUpOnce() {

        InOrderTraversalTest.binaryTreeFactory = new GenericBinaryTreeFactory<>();

    }

    @BeforeEach
    void setUp() {

        this.inOrderTraversal = new InOrderTraversal();

        BinaryTreeNode<String> leftBranch = InOrderTraversalTest.binaryTreeFactory.orderTree("2", "4", "6");
        BinaryTreeNode<String> rightBranch = InOrderTraversalTest.binaryTreeFactory.orderTree(null, "10", "20");

        this.rootNode = InOrderTraversalTest.binaryTreeFactory.orderTree(null, "8", null);

        rootNode.setLeftBranch(leftBranch);
        rootNode.setRightBranch(rightBranch);

    }

    @Test
    void traverse_givenBinarySearchTree_nodesVisitedInAscendingOrder() {

        /* interaction */
        this.inOrderTraversal.traverse(this.rootNode);

        /* assertions */
        assertEquals("2 4 6 8 10 20", this.inOrderTraversal.getTraversalRecords(), "The expected and actual values of the traversal records should be the same!");

    }

}
