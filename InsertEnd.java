
public class InsertEnd {

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();
        ls.insertionatend(2);
        ls.insertionatend(3);
        ls.insertionatend(4);
        ls.insertionatend(5);
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
    }

    public void insertionatpos(int data, int pos) {
        Node newnode = new Node(data);

        if (pos == 0) {
            newnode.next = head;
            return;
        }

        Node temp;
        temp = head;
        int i = 0;
        while (temp.next != null && i < pos - i) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
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
