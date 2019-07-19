package cracking.the.coding.interview.data.structures;

public interface BinaryTreeNode<T> extends TreeNode<T> {

    void setLeftBranch(BinaryTreeNode<T> leftBranch);

    BinaryTreeNode<T> getLeftBranch();

    void setRightBranch(BinaryTreeNode<T> rightBranch);

    BinaryTreeNode<T> getRightBranch();

    default int getHeight(BinaryTreeNode root) {

        if (root == null)
            return -1;
        else
            return 1 + Math.max(getHeight(root.getLeftBranch()), getHeight(root.getRightBranch()));

    }

    default int getHeight() {

        return getHeight(this);

    }

}
