package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import cracking.the.coding.interview.data.structures.TreeNode;

import java.util.Objects;

/**
 * This class represents a {@code 'pre-order traversal'} which goes as deeply to
 * the left as possible and for this reason it's also known as a <i>depth-first-search
 * or DFS</i>.
 */
public class PreOrderTraversal<T extends TreeNode> extends OrderedTraversal<BinaryTreeNode<String>> {

    @Override
    public void traverse(BinaryTreeNode<String> treeNode) {

        if (!Objects.isNull(treeNode)) {

            visit(treeNode);

            this.traverse(treeNode.getLeftBranch());

            this.traverse(treeNode.getRightBranch());

        }

    }

}
