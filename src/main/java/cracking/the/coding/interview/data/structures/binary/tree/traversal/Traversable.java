package cracking.the.coding.interview.data.structures.binary.tree.traversal;

import cracking.the.coding.interview.data.structures.TreeNode;

public interface Traversable<T extends TreeNode> {

    void traverse(T treeNode);

}
