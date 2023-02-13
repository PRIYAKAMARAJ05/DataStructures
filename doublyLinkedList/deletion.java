import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
}
class DoublyLL{
    Node head=null;
    Node createNode(int data){
        Node nn = new Node();
        nn.data=data;
        nn.next=null;
        nn.prev=null;
        return nn;
    }
    void insertAtBegin(int data){
        Node nn = createNode(data);
        if(head==null)
            head=nn;
        else{
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
    }
    void deleteAtBegin(){
        if(head!=null)
            head=head.next;
    }
    void deleteAtEnd(){
        Node temp=head;
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
        if(pos==0){
            deleteAtBegin();
        }else{
        while(pos-- >0){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp.next.prev=prev;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            if(temp.next!=null){
                System.out.print("-> ");
            }
            temp=temp.next;
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		DoublyLL ll = new DoublyLL();
		for(int i=0;i<n;i++){
		    ll.insertAtBegin(sc.nextInt());
		}
		ll.deleteAtBegin();
		ll.display();
		System.out.println();
		ll.deleteAtEnd();
		ll.display();
		System.out.println();
		ll.deleteAtPos(0);
		ll.display();
	}
}

