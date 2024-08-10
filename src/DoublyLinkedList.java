class DoublyLinkedList {
    Node head, tail;

    class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node getMiddle(Node start, Node end) {
        if (start == null) return null;

        int count = 0;
        Node temp = start;
        while (temp != end) {
            count++;
            temp = temp.next;
        }

        int midIndex = count / 2;
        temp = start;

        for (int i = 0; i < midIndex; i++) {
            temp = temp.next;
        }

        return temp;
    }

