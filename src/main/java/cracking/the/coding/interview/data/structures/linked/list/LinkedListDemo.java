package cracking.the.coding.interview.data.structures.linked.list;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.print();

        linkedList.delete(1);
        linkedList.print();

        linkedList.delete(1);
        linkedList.print();

        linkedList.delete(-2);
        linkedList.print();

        linkedList.delete(4);
        linkedList.print();

    }

}
