package cracking.the.coding.interview.data.structures;

import java.util.Objects;

public class FindResultNode extends Node {

    private Node nodeFound;
    private Node previousNode;

    public FindResultNode(int data, Node previousNode, Node nodeFound) {

        super(data);

        this.nodeFound = nodeFound;
        this.previousNode = previousNode;

    }

    public boolean holdsData() {

        return !Objects.isNull(this.nodeFound);

    }

    public void unlinkDataHoldingNode() {

        if(holdsData())
            this.previousNode.setNext(this.nodeFound.getNext());

    }

}
