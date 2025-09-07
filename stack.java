package learnintials;

public class stackLearnTwo {
	
	int[] stack2;
	int capacity;
	int top;
	
	
	public stackLearnTwo(int size){
		stack2= new int[size];
		capacity=size;
		top=-1;
	}
	
	void push(int value) {
		if(top==capacity-1) {
			System.out.println("The Stack is full.");
		}
		else {
			stack2[++top]=value;
			System.out.println("The Value is inserted in the stack.");
		}		
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("The Stack is Empty.");
		}
		else {
			System.out.println("The value is popped.");
			top--;
		}		
	}
	
	void isEmpty() {
		if(top==-1) {
			System.out.println("The stack is empty.");
		}
		else {
			System.out.println("The stack is not empty.");
		}		
	}
	
	void peek() {
		System.out.println("The top element in the stack is-: "+ stack2[top]);		
	}
	
	void display() {
		if(top==-1) {
			System.out.println("The Stack is Empty.");
		}
		else {
			for(int num: stack2) {
				System.out.println(" "+num);
			}
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("The program of DSA is of Stack initialization and elements excecution with functions as well.");
		
		stackLearnTwo s = new stackLearnTwo(5);

        
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();

        s.pop();
        s.display();

        s.peek();

        s.push(40);
        s.push(50);
        s.display();
		
	}

}

