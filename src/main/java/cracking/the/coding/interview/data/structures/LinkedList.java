package cracking.the.coding.interview.data.structures;

import java.util.Objects;

/**
 * represents a Singly-linked list.
 */
public class LinkedList {

    /**
     * represents the head of the list.
     */
    private Node head;

    public void insert(int data) {

        insert(new Node(data));

    }

    public void insert(Node newNode) {

        if (Objects.isNull(this.getHead()))
            this.setHead(newNode);
        else {

            Node tail = traverse(this.getHead());

            /* inserts the newNode as the last node of the list. */
            tail.setNext(newNode);

        }

    }

    /**
     * traverses until the last node is found.
     */
    public Node traverse(Node startingNode) {

        return traverse(startingNode, false);

    }

    public Node traverse(Node startingNode, boolean verbose) {

        Node tail = startingNode;

        while (!isLast(tail)) {

            printData(tail.getData(), verbose);

            tail = tail.getNext();

        }

        return tail;

    }

    public void print() {

        System.out.print("Linked list: ");

        Node tail = traverse(this.getHead(), true);

        System.out.println(tail.getData());

    }

    private void printData(int data, boolean verbose) {

        if (verbose)
            System.out.print(data + " ");

    }

    public void delete(int data) {

        // CASE-1: head node holds the data.
        if (holdsDataToBeDeleted(this.getHead(), data)) {

            this.setHead(head.getNext());
            return;

        }

        // CASE-2: data is somewhere other than the head node.
        FindResultNode findResultNode = find(this.getHead().getNext(), data);

        // node is deleted if data is present, otherwise nothing happens.
        if (findResultNode.holdsData())
            findResultNode.unlinkDataHoldingNode();

    }

    public FindResultNode find(Node currentNode, int data) {

        Node previousNode = null;

        while (!Objects.isNull(currentNode) && !holdsDataToBeDeleted(currentNode, data)) {

            previousNode = currentNode;
            currentNode = currentNode.getNext();

        }

        return new FindResultNode(data, previousNode, currentNode);

    }

    public boolean isLast(Node currentNode) {

        return Objects.isNull(currentNode.getNext());

    }

    private boolean holdsDataToBeDeleted(Node testingNode, int data) {

        return !Objects.isNull(testingNode) && testingNode.getData() == data;

    }

    private Node getHead() {

        return head;

    }

    private void setHead(Node head) {

        this.head = head;

    }

}
