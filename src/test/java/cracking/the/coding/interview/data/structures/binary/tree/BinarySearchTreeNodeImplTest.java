package cracking.the.coding.interview.data.structures.binary.tree;

import cracking.the.coding.interview.data.structures.BinarySearchTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.traversal.LevelOrderTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTreeNodeImplTest {

    private BinarySearchTreeNode<Integer> rootNode;

    private LevelOrderTraversal levelOrderTraversal;

    @BeforeEach
    void setUp() {

        this.levelOrderTraversal = new LevelOrderTraversal();

        // Binary search tree nodes are as follows: 3, 5, 4, 7, 2, 1
        this.rootNode = new BinarySearchTreeNodeImpl<>(3);

    }

    @Test
    void insert_givenBinarySearchTreeRootNode_newSearchValuesInserted() {

        /* interaction */
        this.rootNode.insert(5);
        this.rootNode.insert(4);
        this.rootNode.insert(7);
        this.rootNode.insert(2);
        this.rootNode.insert(1);

        this.levelOrderTraversal.traverse(this.rootNode);

        /* assertions */
        assertEquals("3 2 5 1 4 7", this.levelOrderTraversal.getTraversalRecords(), "The expected and actual values of the traversal records should be the same!");

    }

    private void setUp_getHeight_givenBinarySearchTreeRootNode_treeHeightComputedSuccessfully() {

        this.rootNode.insert(5);
        this.rootNode.insert(2);
        this.rootNode.insert(1);
        this.rootNode.insert(4);
        this.rootNode.insert(6);
        this.rootNode.insert(7);

    }

    @Test
    void getHeight_givenBinarySearchTreeRootNode_treeHeightComputedSuccessfully() {

        setUp_getHeight_givenBinarySearchTreeRootNode_treeHeightComputedSuccessfully();

        /* interaction */
        int actual = this.rootNode.getHeight();

        /* assertions */
        assertEquals(3, actual, "The expected and actual values of the tree's height should be the same!");

    }

    @Test
    void getHeight_givenNullRootNode_heightComputedAsMinusOne() {

        /* interaction */
        int actual = this.rootNode.getHeight(null);

        /* assertions */
        assertEquals(-1, actual, "The expected and actual values of the tree's height should be the same!");

    }

    @Test
    void getHeight_givenSingleElementTree_hieghtComputedAsZero() {

        /* interaction */
        int actual = this.rootNode.getHeight(this.rootNode);

        /* assertions */
        assertEquals(0, actual, "The expected and actual values of the tree's height should be the same!");

    }

}
