package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.TreeNode;

import java.util.Objects;

public class InOrderTraversal<T extends TreeNode> extends OrderedTraversal<BinaryTreeNode<String>> {

    @Override
    public void traverse(BinaryTreeNode<String> treeNode) {

        if (!Objects.isNull(treeNode)) {

            this.traverse(treeNode.getLeftBranch());

            visit(treeNode);

            this.traverse(treeNode.getRightBranch());

        }

    }

}
