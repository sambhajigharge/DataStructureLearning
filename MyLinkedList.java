package DataStructure.Learning;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {}

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        } else if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printMyNodes() {
        System.out.println("My Nodes: " + head);
    }
}
