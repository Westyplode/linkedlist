public class LinkedList {
    private Node head;

    public LinkedList() {
        // create an empty list
        head = null;
    }

    public LinkedList(int[] values) {
        head = new Node(values[0]);  // assuming the array has at least 1 element
        Node adding;
        Node current = head;
        for (int i=1; i<values.length; i++) {
            adding = new Node(values[i]);
            current.setNext(adding);
            current = current.getNext();
        }
    }

    public void display() {
        // display each element on the same line in the console
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue()+", ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void addNode(int v) {
        // create a new node with the value
        Node nodeToAdd = new Node(v);
        // add it to the end of the list
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(nodeToAdd);
    }
    public void addFirst(int v) {
        // create a new node with the value
        Node nodeToAdd = new Node(v);

        // add it to the beginning of the list
        Node current = head;
        current.setNext(nodeToAdd);
        while (current.getNext() != null) {
            current = current.getNext();
        }
    }
}
