package cracking.the.coding.interview.data.structures.binary.tree.factory;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.binary.tree.BinaryTreeNodeImpl;

import java.util.Objects;

public class GenericBinaryTreeFactory<T extends BinaryTreeNode<U>, U> extends BinaryTreeFactory<BinaryTreeNode<String>, String> {

    @Override
    protected BinaryTreeNode<String> produceTree(String leftBranchData, String currentNodeData, String rightBranchData) {

        checkEntranceCondition(leftBranchData, currentNodeData, rightBranchData);

        BinaryTreeNodeImpl<String> rootNode = new BinaryTreeNodeImpl<>(currentNodeData);

        if (!Objects.isNull(leftBranchData))
            rootNode.setLeftBranch(new BinaryTreeNodeImpl<>(leftBranchData));

        if (!Objects.isNull(rightBranchData))
            rootNode.setRightBranch(new BinaryTreeNodeImpl<>(rightBranchData));

        return rootNode;

    }

}
