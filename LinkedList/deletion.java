import java.util.*;

class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head=null;
    Node createNode(int data){
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        return nn;
    }
    void insertAtBegin(int data){
        Node n = createNode(data);
        n.next=head;
        head=n;
    }
    void deleteAtBegin(){
        if(head!=null){
            head=head.next;
        }
    }
    void deleteAtEnd(){
        Node temp = head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    void deleteAtPos(int pos){
        Node temp=head;
        Node prev=null;
        while(--pos>0){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);
		ll.insertAtBegin(40);
		ll.insertAtBegin(50);
		ll.deleteAtBegin();
		ll.deleteAtEnd();
		ll.deleteAtPos(2);
		ll.display();
	}
}
