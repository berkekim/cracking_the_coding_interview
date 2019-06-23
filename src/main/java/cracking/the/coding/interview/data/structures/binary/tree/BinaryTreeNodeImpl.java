package cracking.the.coding.interview.data.structures.binary.tree;

import cracking.the.coding.interview.data.structures.BinaryTreeNode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class BinaryTreeNodeImpl<T> implements BinaryTreeNode<T> {

    private final T nodeData;

    private BinaryTreeNode<T> leftBranch;

    private BinaryTreeNode<T> rightBranch;

}
