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
    void insertAtEnd(int data){
        Node nn = createNode(data);
        Node temp=head;
        if(head==null)
            head=nn;
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            nn.prev=temp;
            
        }
    }
    void insertAtPos(int data,int pos){
        Node nn=createNode(data);
        Node temp=head;
        if(head==null)
            head=nn;
        else{
            while(pos-- >0){
                temp=temp.next;
            }
            nn.prev=temp;
            nn.next=temp.next;
            temp.next=nn;
            nn.next.prev=nn;
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
		ll.insertAtEnd(50);
		ll.insertAtPos(70,3);
		ll.display();
	}
}
