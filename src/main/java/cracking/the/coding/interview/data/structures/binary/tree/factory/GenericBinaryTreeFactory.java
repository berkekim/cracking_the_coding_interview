package cracking.the.coding.interview.data.structures.binary.tree.factory;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.GenericBinaryTreeNodeImpl;

import java.util.Objects;

public class GenericBinaryTreeFactory<T extends BinaryTreeNode<U>, U> extends BinaryTreeFactory<BinaryTreeNode<U>, U> {

    @Override
    protected BinaryTreeNode<U> produceTree(U leftBranchData, U currentNodeData, U rightBranchData) {

        checkEntranceCondition(leftBranchData, currentNodeData, rightBranchData);

        GenericBinaryTreeNodeImpl<U> rootNode = new GenericBinaryTreeNodeImpl<>(currentNodeData);

        if (!Objects.isNull(leftBranchData))
            rootNode.setLeftBranch(new GenericBinaryTreeNodeImpl<>(leftBranchData));

        if (!Objects.isNull(rightBranchData))
            rootNode.setRightBranch(new GenericBinaryTreeNodeImpl<>(rightBranchData));

        return rootNode;

    }

}
