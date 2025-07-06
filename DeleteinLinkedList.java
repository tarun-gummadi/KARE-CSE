
public class DeleteinLinkedList {

    public static void main(String[] args) {

        circularlist cl = new circularlist();
        cl.insertionatend(2);
        cl.insertionatend(3);
        cl.insertionatend(4);
        cl.insertionatend(5);
        cl.insertionatend(6);
        cl.display();

        cl.insertatstart(1);
        cl.display();

        cl.insertatpos(4, 3);
        cl.display();

        cl.deleteatstart();
        cl.display();

        cl.deleteatend();
        cl.display();

        cl.deleteatpos(4);
        cl.display();
    }
}

class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

class circularlist {

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

    public void insertatstart(int data) {
        Node newnode = new Node(data);

        head.prev = newnode;
        newnode.next = head;
        head = newnode;
    }

    public void insertatpos(int data, int pos) {
        Node newnode = new Node(data);

        Node temp;
        temp = head;
        int i = 0;
        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        temp.next.prev = newnode;
        newnode.next = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
    }

    public void deleteatstart() {
        if (head == null) {
            System.out.println("No linked list is present");
            return;
        }
        if (head != null) {
            head = head.next;
            head.next.prev = null;
            head.prev = null;
        }
    }

    public void deleteatend() {
        Node temp;
        temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

    public void deleteatpos(int posi) {
        Node temp;
        temp = head;
        int i = 0;
        while (temp.next != null && i < posi) {
            temp = temp.next;
            i++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
    }

    public void display() {
        Node temp;
        temp = head;

        while (temp.next != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }

    }
}
