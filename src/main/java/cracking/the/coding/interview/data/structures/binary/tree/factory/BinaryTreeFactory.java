package cracking.the.coding.interview.data.structures.binary.tree.factory;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;

import java.util.Objects;

public abstract class BinaryTreeFactory<T extends BinaryTreeNode<U>, U> {

    public final T orderTree(U leftBranchData, U currentNodeData, U rightBranchData) {

        checkEntranceCondition(leftBranchData, currentNodeData, rightBranchData);

        return this.produceTree(leftBranchData, currentNodeData, rightBranchData);

    }

    protected abstract T produceTree(U leftBranchData, U currentNodeData, U rightBranchData);

    protected void checkEntranceCondition(U leftBranchData, U currentNodeData, U rightBranchData) {

        Objects.requireNonNull(currentNodeData, "Current node data cannot be null!");

    }

}
