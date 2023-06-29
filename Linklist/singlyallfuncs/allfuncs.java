package singlyallfuncs;
import java.util.*;


public class allfuncs {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
// add at first, middle and at last

    // to add at first
    public void insertatfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // to add in the middle
    public void insertMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node hare;
        Node tortoise;
        hare = head;
        tortoise = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        newNode.next = tortoise.next;
        tortoise.next = newNode;
    }

    // to insert at specific position
   public void insertPos(int data, int key) {
    int c = 0;
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        c++;
        if (c == key) {
            newNode.next = temp.next;
            temp.next = newNode;
            return;
        }
        temp = temp.next;
    }
    // if we get here, key was not found in the list
    temp.next = newNode;
}


    // to add at last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


// to delete from first and last and from position
    
    //to delete from first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            Node temp = head;
            head = temp.next;
            temp.next = null;
        }
    }

    //to delete from last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // to delete from more than 25
    // public void deletemore() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //     }
    //     Node temp = head;
    //     while(temp.next!=null){
    //         temp = temp.next;
    //         if(temp.data >=25){
    //             temp.next = null;
    //         }
    //     }
    // }

    //to delete from position
    // public void deletePos(int key) {
    //     Node curr = head;
    //     Node prev = null;
    //     if (head == null) {
    //         System.out.println("List is empty");
    //     }
    //     if(curr!=null && curr.data==key){
    //         head = curr.next;
    //         return;
    //     }
    //     while(curr!=null && curr.data!=key){
    //         prev = curr;
    //         curr = curr.next;
    //     }
    //     if(curr==null){
    //         System.out.println("Element not found");
    //     }
    //     else{
    //         prev.next = curr.next;
    //     }
    // }

    
    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        allfuncs obj = new allfuncs();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            obj.insertatfirst(i);
            obj.insertLast(i);
        }
        obj.printList();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();
        obj.insertMiddle(10);
        obj.printList();
        obj.insertPos(6,3);
        obj.printList();
        // obj.deletePos(4);
        // obj.printList();
        // obj.deletemore();
        // obj.printList();
        sc.close();
        // obj.insertatfirst(5);
        // obj.insertatfirst(4);
        // obj.insertatfirst(4);
        // obj.deleteFirst();
        // obj.insertLast(3);
        // obj.insertLast(2);
        // obj.insertLast(2);
        // obj.insertLast(10);
        // obj.insertLast(9);
        // obj.deleteLast();
        // obj.deletePos(5);
        // obj.printList();
    }

}
