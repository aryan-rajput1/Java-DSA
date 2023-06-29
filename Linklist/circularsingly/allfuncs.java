package circularsingly;
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
// add at first and at last

    // to add at first
    public void insertatfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = newNode;
            return;
        }
        else{
            Node temp = head;
            newNode.next = head;
            while(temp.next!=head){
            temp = temp.next;
            }
            
            temp.next = newNode;
            head = newNode;
        }
    }

    // to add at last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = temp.next;
            temp.next = newNode;
    }


// to delete from first and last and from position
    
    //to delete from first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if(head.next == head){
            head = null;
            head.next = null;
        }
        else{
            Node temp = head;
          while(temp.next!=head){
               temp = temp.next;
          }
          temp.next = head.next;
          head = head.next;
        }
    }

    //to delete from last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        
        else{
        Node temp = head;
        while(temp.next.next!=head){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    }

    //to delete from more than 25
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
    public void deletePos(int key) {
        Node curr = head;
        Node prev = null;
        if (head == null) {
            System.out.println("List is empty");
        }
        if(curr!=null && curr.data==key){
            head = curr.next;
            return;
        }
        while(curr!=null && curr.data!=key){
            prev = curr;
            curr = curr.next;
        }
        if(curr==null){
            System.out.println("Element not found");
            


        }
        else{
            prev.next = curr.next;
        }
    }

    
    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != head) {
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
        obj.deleteFirst();
        obj.deleteLast();
        // obj.deletePos(4);
        // obj.deletemore();
        obj.printList();
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

