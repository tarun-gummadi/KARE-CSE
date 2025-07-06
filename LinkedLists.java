
public class LinkedLists {

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();
        ls.insertion(2);
        ls.insertion(3);
        ls.insertion(4);
        ls.insertion(5);
        ls.display();
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

    public void insertion(int data) {
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

    public void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-> ");
            temp = temp.next;
        }
    }

}
