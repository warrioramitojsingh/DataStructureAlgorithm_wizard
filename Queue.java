package learnintials;

public class queuelearning {
	int[] queue;
	int front;
	int rear;
	int capacity;
	
	public queuelearning(int size) {
		queue= new int[size];
		front=0;
		rear=-1;
		capacity=size;		
	}
	void enQueue(int value) {
		if(rear==capacity-1) {
			System.out.println("The Capacity of the Queue is full..");
		}
		else {
			System.out.println("The Value "+value+" is inserted in the queue");
			queue[++rear]=value;
		}
	}
	
	void deQueue() {
		if(front>rear) {
			System.out.println("The Queue is empty and has no elements.");
		}
		else {
			front++;
		}
	}
	void peek() {
		if(front>rear) {
			System.out.println("The Queue is Empty.");
		}
		else {
			System.out.println("The Top most element in the Queue is: "+ queue[front]);
		}
	}
	void display() {
		if(front>rear) {
			System.out.println("The Queue is Empty.");
		}
		else {
			for(int val: queue)
			System.out.println(val+" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This DSA program practiced in java is of normal Queue.");
		
        queuelearning q = new queuelearning(5);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.display();

        q.deQueue();
        q.display();

        q.peek();

        q.enQueue(40);
        q.enQueue(50);
        q.display();
		
	}
	
}
