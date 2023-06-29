import java.util.Scanner;

public class Palindrome {
    
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
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

    // function to find the middle element of the list
    public Node findMiddle(Node head) {
        Node hare = head;
             Node turtle = head;
             
             while(hare.next!=null && hare.next.next!=null){
                 hare = hare.next.next;
                 turtle = turtle.next;
             }
             return turtle;
    }

    // functio to reverse the list after getting the middle element of list
    public Node reverse(Node head) {
        if(head==null)
        {
            return head;
        }
        else{
            Node prev = null;
            Node current = head;
            Node next = null;
    
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        return head;
    }

    // function to check whether the list is palindrome or not
    public void isPalindrome(Node head) {
        if(head==null || head.next==null){
            System.out.println("list is palindrome");
        }
            Node middle = findMiddle(head);
            Node secondst = reverse(middle.next);

            if(head.data != secondst.data){
                System.out.println("list is not palindrome");
            }
            else{
            head.data = head.next.data;
            secondst.data = secondst.next.data;
            System.out.println("list is palindrome");
            }
        
    }

    // function to print the list
    public void printList() {
        if(head==null){
            System.out.println("List is empty");
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
        Palindrome obj = new Palindrome();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
           
            int data = sc.nextInt();
            obj.insert(data);
        }
        obj.printList();
        obj.isPalindrome(obj.head);
       
        sc.close();
    }
}
