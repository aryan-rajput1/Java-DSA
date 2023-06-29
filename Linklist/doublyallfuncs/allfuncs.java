package doublyallfuncs;

// Define a class representing a node in a doubly linked list
class Node {
    int data;
    Node prev;
    Node next;
    
    public Node(int data) {
          this.data = data;
          this.prev = null;
          this.next = null;
    }
  }
  
  // Define a class representing the doubly linked list
  class DoublyLinkedList {
    Node head;
    Node tail;
    int size;
  
    public DoublyLinkedList() {
          this.head = null;
          this.tail = null;
          this.size = 0;
    }
  
    // Method to insert a node at the front of the list
    public void insertAtFront(int data) {
          Node newNode = new Node(data);
  
          if(head == null) {
              head = newNode;
              tail = newNode;
          } else {
              head.prev = newNode;
              newNode.next = head;
              head = newNode;
          }
  
          size++;
    }
  
    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
          Node newNode = new Node(data);
  
          if(tail == null) {
              head = newNode;
              tail = newNode;
          } else {
              tail.next = newNode;
              newNode.prev = tail;
              tail = newNode;
          }
  
          size++;
    }

    // Method to insert node at a specific position
    public void insertAtPosition(int data, int position) {
    if (position < 0 || position > size) {
        return;
    }
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else if (position == 0) {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    } else if (position == size) {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    } else {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    size++;
}

  
    // Method to delete a node from the front of the list
    public void deleteFromFront() {
          if(head == null) {
              return;
          }
      
          if(head == tail) {
              head = null;
              tail = null;
          } else {
              Node nextNode = head.next;
              nextNode.prev = null;
              head = nextNode;
          }
  
          size--;
    }
  
    // Method to delete a node from the end of the list
    public void deleteFromEnd() {
          if(tail == null) {
              return;
          }
  
          if(head == tail) {
              head = null;
              tail = null;
          } else {
              Node prevNode = tail.prev;
              prevNode.next = null;
              tail = prevNode;
          }
  
          size--;
    }
  
    // Method to delete a node from a given position
    public void deleteFromPosition(int position) {
          if(position < 0 || position >= size) {
              return;
          }
  
          if(position == 0) {
              deleteFromFront();
          } else if(position == size-1) {
              deleteFromEnd();
          } else {
              Node currentNode = head;
              for(int i=0; i<position; i++) {
                  currentNode = currentNode.next;
              }
              Node prevNode = currentNode.prev;
              Node nextNode = currentNode.next;
              prevNode.next = nextNode;
              nextNode.prev = prevNode;
              size--;
          }
    }
  
    // Method to display the contents of the list
    public void display() {
          Node currentNode = head;
          while(currentNode != null) {
              System.out.print(currentNode.data + "->");
              currentNode = currentNode.next;
          }
          System.out.println("null");
    }

    // Method to reverse the doubly linked list
    public void reverse() {
          Node prev = null;
          Node curr = head;
          Node next = null;
          while(curr != null) {
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          head = prev;
    }
  
  // Main function to test the doubly linked list

    public static void main(String[] args) {
          DoublyLinkedList list = new DoublyLinkedList();
  
          list.insertAtFront(5);
          list.insertAtFront(10);
          list.insertAtEnd(20);
          list.display();    // Expected output: 10 5 20
  
          list.deleteFromFront();
          list.deleteFromEnd();
          list.display();    // Expected output: 5
  
          list.insertAtEnd(15);
          list.insertAtFront(25);
          list.display();    // Expected output: 25 5 15
  
          list.deleteFromPosition(1);
          list.display();    // Expected output: 25 15

          list.insertAtEnd(10);
          list.insertAtEnd(20);
          list.insertAtEnd(30);
          list.insertAtEnd(40);
          list.reverse();
          list.display();    // Expected output: 40 30 20 10 15 25

          list.insertAtPosition(2, 2);
          list.display();    // Expected output: 40 30 2 20 10 15 25
    
  }
}
