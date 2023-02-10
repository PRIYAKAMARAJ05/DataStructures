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
    void insertAtPos(int data,int pos){
        Node n = createNode(data);
        Node temp = head;
        if(head==null){
            head=n;
        }
        else{
            while(--pos>0){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    void search(int key){
        Node temp = head;
        int flag=0;
        while(temp!=null){
            if(temp.data==key){
            System.out.println(temp.data+" ");
            System.out.print("found");
            flag=1;
            }
            temp=temp.next;
        }
        if(flag==0)
            System.out.println("Not found");
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
		l.insertAtPos(10,0);
		l.insertAtPos(20,1);
		l.insertAtPos(30,2);
		l.search(20);
		l.display();
	}
}
