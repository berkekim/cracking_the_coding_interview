package cracking.the.coding.interview.data.structures.binary.tree;

import cracking.the.coding.interview.data.structures.BinarySearchTreeNode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BinarySearchTreeNodeImpl<T> extends GenericBinaryTreeNodeImpl<Integer> implements BinarySearchTreeNode<Integer> {

    public BinarySearchTreeNodeImpl(Integer nodeData) {

        super(nodeData);

    }

    @Override
    public BinarySearchTreeNode<Integer> insert(Integer newData) {

        if (newData <= this.getNodeData()) {

            if (this.getLeftBranch() != null)
                ((BinarySearchTreeNode<Integer>) this.getLeftBranch()).insert(newData);
            else
                this.setLeftBranch(new BinarySearchTreeNodeImpl<>(newData));

        } else {

            if (this.getRightBranch() != null)
                ((BinarySearchTreeNode<Integer>) this.getRightBranch()).insert(newData);
            else
                this.setRightBranch(new BinarySearchTreeNodeImpl<>(newData));

        }

        return this;

    }

}
