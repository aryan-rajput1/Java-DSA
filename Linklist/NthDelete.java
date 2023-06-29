import java.util.*;
public class NthDelete { 
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    // function to insert an element at last in linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // function to delete N-th Node from a link list
    public Node deleteNthNode(Node head, int pass) {
        if(head.next==null){
            return null;
        }
    
        Node temp = head;
        int i = 0;
    
        while(i < pass - 1 && temp != null){
            temp = temp.next;
            i++;
        }
    
        if(temp == null || temp.next == null){
            return null;
        }
    
        temp.next = temp.next.next;
        return head;
    }
    

    // function to print the list
    public void printList() {
        if(head == null){
            System.out.println("list is empty");
        }
        else{
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.data+"->");
               temp = temp.next;
           } 
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthDelete obj = new NthDelete();
        System.out.println("enter the size of link list");
        int size = sc.nextInt();
        System.out.println("enter the nth element you want to delete");
        int n  = sc.nextInt();
        for(int i = 0 ; i < size; i++){
            obj.insert(i);
        }
        int pass = size - n ;
        obj.deleteNthNode(obj.head, pass);
        obj.printList();
        sc.close();
    }
}
