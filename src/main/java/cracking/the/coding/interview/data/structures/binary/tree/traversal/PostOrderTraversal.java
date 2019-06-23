package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.TreeNode;

import java.util.Objects;

public class PostOrderTraversal<T extends TreeNode> extends OrderedTraversal<BinaryTreeNode<String>> {

    @Override
    public void traverse(BinaryTreeNode<String> treeNode) {

        if (!Objects.isNull(treeNode)) {

            this.traverse(treeNode.getLeftBranch());

            this.traverse(treeNode.getRightBranch());

            visit(treeNode);

        }

    }

}
