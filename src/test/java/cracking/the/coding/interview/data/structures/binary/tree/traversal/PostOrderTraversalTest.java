package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.factory.BinaryTreeFactory;
import cracking.the.coding.interview.data.structures.binary.tree.factory.GenericBinaryTreeFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostOrderTraversalTest {

    private static BinaryTreeFactory<BinaryTreeNode<String>, String> binaryTreeFactory;

    private PostOrderTraversal postOrderTraversal;

    private BinaryTreeNode<String> rootNode;

    @BeforeAll
    static void setUpOnce() {

        PostOrderTraversalTest.binaryTreeFactory = new GenericBinaryTreeFactory<>();

    }

    @BeforeEach
    void setUp() {

        this.postOrderTraversal = new PostOrderTraversal();

        BinaryTreeNode<String> leftBranch = PostOrderTraversalTest.binaryTreeFactory.orderTree("2", "4", "6");
        BinaryTreeNode<String> rightBranch = PostOrderTraversalTest.binaryTreeFactory.orderTree(null, "10", "20");

        this.rootNode = PostOrderTraversalTest.binaryTreeFactory.orderTree(null, "8", null);

        rootNode.setLeftBranch(leftBranch);
        rootNode.setRightBranch(rightBranch);

    }

    @Test
    void traverse_givenBinarySearchTree_rootNodeVisitedLastly() {

        /* interaction */
        this.postOrderTraversal.traverse(this.rootNode);

        /* assertions */
        assertEquals("2 6 4 20 10 8", this.postOrderTraversal.getTraversalRecords(), "The expected and actual values of the traversal records should be the same!");

    }

}