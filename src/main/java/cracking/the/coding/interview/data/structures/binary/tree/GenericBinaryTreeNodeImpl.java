package cracking.the.coding.interview.data.structures.binary.tree;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class GenericBinaryTreeNodeImpl<T> implements BinaryTreeNode<T> {

    protected final T nodeData;

    protected BinaryTreeNode<T> leftBranch;

    protected BinaryTreeNode<T> rightBranch;

}
