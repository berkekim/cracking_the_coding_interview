package cracking.the.coding.interview.data.structures;

public interface BinaryTreeNode<T> extends TreeNode<T> {

    void setLeftBranch(BinaryTreeNode<T> leftBranch);

    BinaryTreeNode<T> getLeftBranch();

    void setRightBranch(BinaryTreeNode<T> rightBranch);

    BinaryTreeNode<T> getRightBranch();

}
