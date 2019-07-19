package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * This class represents a {@code 'level-order traversal'} which goes level-by-level
 * and for this reason it's also known as a <i>breadth-first-search (BFS)</i>.
 */
public class LevelOrderTraversal<T extends TreeNode> extends OrderedTraversal<BinaryTreeNode<Integer>> {

    private Queue<BinaryTreeNode<Integer>> queue;

    public LevelOrderTraversal() {

        this.queue = new LinkedList<>();

    }

    @Override
    public void traverse(BinaryTreeNode<Integer> treeNode) {

        if (!Objects.isNull(treeNode)) {

            this.queue.offer(treeNode);

            while (!this.queue.isEmpty()) {

                BinaryTreeNode<Integer> integerTreeNode = this.queue.poll();

                visit(integerTreeNode);

                processChildren(integerTreeNode);

            }

        }

    }

    private void processChildren(BinaryTreeNode<Integer> integerTreeNode) {

        if (integerTreeNode.getLeftBranch() != null)
            this.queue.offer(integerTreeNode.getLeftBranch());

        if (integerTreeNode.getRightBranch() != null)
            this.queue.offer(integerTreeNode.getRightBranch());

    }

}
