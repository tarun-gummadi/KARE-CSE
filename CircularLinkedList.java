
public class CircularLinkedList {

    public static void main(String[] args) {
        CircularLinkedList1 cl = new CircularLinkedList1();
        cl.insertionatend(1);
        cl.insertionatend(2);
        cl.insertionatend(3);
        cl.insertionatend(4);
        cl.insertionatend(5);
        cl.insertionatend(6);
        cl.display();
    }

}

class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularLinkedList1 {

    Node head;

    public void insertionatend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp;
        temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }

    public void display() {
        Node temp;
        temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
