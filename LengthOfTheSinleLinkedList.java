
public class LengthOfTheSinleLinkedList {

    public static void main(String[] args) {

        LinkedList lt = new LinkedList();
        lt.inserion(2);
        lt.inserion(3);
        lt.inserion(4);
        lt.inserion(5);
        lt.inserion(6);
        lt.display();

        System.out.println("The length of the LinkedList is : " + lt.getLength());

    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void inserion(int data) {
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
    }

    public int getLength() {
        Node temp;
        temp = head;
        int count = 0;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        Node temp;
        temp = head;

        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
