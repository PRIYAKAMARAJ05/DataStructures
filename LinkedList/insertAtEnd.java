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
    void insertAtEnd(int data){
        Node n = createNode(data);
        Node temp = head;
        if(head==null){
            head=n;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		l.insertAtEnd(10);
		l.insertAtEnd(20);
		l.insertAtEnd(30);
		l.display();
	}
}
