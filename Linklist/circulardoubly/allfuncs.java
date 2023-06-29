package circulardoubly;

class Node{
    int value;
    Node prev;
    Node next;

    public Node(int value){
        this.value=value;
        this.prev= null;
        this.next=null;
    }
}

public class allfuncs {
    Node head;

    public allfuncs(){
        this.head = null;
    }

    // Method to insert a node at the front of the list
    public void insertAtFront(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node temp = head.prev;  // get the last node
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = head;
            head.prev = head;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Method to delete a node from the front of the list
    public void deleteFromFront() {
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.next == head){
            head = null;
        }
        else {
            Node temp = head.prev;
            temp.next = head.next;
            head.next.prev = temp;
            head = head.next;
    }

        }

    // method to delete from last
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
        }
        else if(head.next == head){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.prev.next = head;
            head.prev = temp.prev;
        }
    }    

    // method to delete a node from a given position
    public void deleteFromPosition(int position){
        if(head == null){
            System.out.println("List is empty");
        }
        else if(position == 1){
            deleteFromFront();
        }
        else{
            Node temp = head;
            for(int i = 1; i < position; i++){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
    }

    // method to reverse the link list
    public void reverse(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            Node prev = null;
            Node next = null;
            while(temp != null){
                next = temp.next;
                temp.next = prev;
                temp.prev = next;
                prev = temp;
                temp = next;
            }
            head = prev;
        }
    }

    // Method to print the list
    public void printList(){
        if(head != null){
            Node curr = head;
            do {
                System.out.print(curr.value + "->");
                curr = curr.next;
            } while (curr != head);
        }
    }

    public static void main(String[] args){
        allfuncs list = new allfuncs();
        list.insertAtFront(10);
        list.insertAtFront(5);
        list.insertAtFront(9);
        list.insertAtFront(9);
        list.printList();
        System.out.println("\n");
        list.insertAtEnd(5);
        list.insertAtEnd(15);
        list.printList();
        System.out.println("\n");
        list.deleteFromFront();
        list.printList();
        System.out.println("\n");
        list.deleteFromEnd();
        list.printList();
        System.out.println("\n");
        list.deleteFromPosition(1);
        list.printList();
        System.out.println("\n");
    }
}