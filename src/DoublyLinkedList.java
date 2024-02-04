public class DoublyLinkedList {
 Node head;

 public void insert(int data) {
    Node Node = new Node(data);
     if (head == null) {
         head = Node;
   } else {
    Node current = head;
      while (current.next != null) {
        current = current.next;
          }
          newNode.previous = current;
          current.next = Node;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
   Node current = head;
     while (current != null) {
       if (current.data == data) {
        if (current.previous == null) {
            /*  Node to delete is the head node */
               head = current.next;
               if (head != null) {
                head.previous = null;
                    }
                } else {
                    /* Node to delete is not the head node */
                    current.previous.next = current.next;
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                }
                break;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void binarySearch(int target) {
          /*add your code here*/
   }
}



