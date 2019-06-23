package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.TreeNode;

import java.util.Objects;

public abstract class OrderedTraversal<T extends TreeNode> implements Traversable<T> {

    private StringBuilder traversalRecords;

    public OrderedTraversal() {

        this.traversalRecords = new StringBuilder();

    }

    void visit(T treeNode) {

        if (!Objects.isNull(treeNode)) {

            // System.out.println(treeNode.getNodeData() + " ");

            this.traversalRecords.append(treeNode.getNodeData()).append(" ");

        }

    }

    protected String getTraversalRecords() {

        return traversalRecords.toString().trim();

    }

}
