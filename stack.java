import java.util.*;
public class Main
{
    int size;
    int s[];
    int top;
    
    Main(int size){
        this.size=size;
        s=new int[this.size];
        top=-1;
    }
    public boolean stackEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public void push(int num){
        if(top>=size-1)
            System.out.println("stack is full");
        else
            s[++top]=num;
    }
    public int pop(){
        if(top == -1)
            System.out.println("stack is empty");
        return s[top--];
    }
    public int peek(){
        if(top == -1)
            System.out.println("stack is empty");
        return s[top];
    }
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(s[i]+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main(10);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    main.push(sc.nextInt());
		}
		main.printStack();
		main.pop();
		main.printStack();
		main.peek();
		main.printStack();
	}
}
