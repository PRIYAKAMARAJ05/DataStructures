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
    
    void insertAtbegin(int data){
        Node n = createNode(data);
        if(head==null){
            head=n;
        }else{
            n.next=head;
            head=n;
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
		l.insertAtbegin(10);
		l.insertAtbegin(20);
		l.insertAtbegin(30);
		l.display();
		
	}
}
