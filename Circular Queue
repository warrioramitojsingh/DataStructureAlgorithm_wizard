package learnintials;

public class circularQueueLearningTwo {
	int[] queue3;
	int rear;
	int front;
	int capacity;
	
	public circularQueueLearningTwo(int size){
		queue3= new int[size];
		rear=-1;
		front=0;
		capacity=size;
	}
	
	void enQueue(int value){
		if(rear==capacity-1) {
			System.out.println("The Queue is Empty.");
		}
		else {
			rear=(rear+1)%capacity;
			System.out.println("The Value is inserted in the queue.");
		}
	}
	
	void deQueue() {
		if(front>rear) {
			System.out.println("The Queue is Empty.");
		}
		else {
			front=(front+1)%capacity;
			System.out.println("The value dequeueed is-: "+ queue3[front]);
		}		
	}
	
	void isEmpty() {
		if(front>rear) {
			System.out.println("The queue is empty.");
		}
		else {
			System.out.println("The Queue is not empty.");
		}
	}
	
	void peek() {
		if(front>rear) {
			System.out.println("The Queue is empty.");
		}
		else {
			System.out.println("The top element in the queue is-: "+ queue3[front]);
		}
	}
	void display() {
		if(front>rear) {
			System.out.println("The queue is empty.");
		}
		else {
			for(int num: queue3) {
				System.out.println(" "+ num);
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("The following program is of Circular Queue data structure with following funtions.");
		
		circularQueueLearningTwo c = new circularQueueLearningTwo(5);
		
		c.enQueue(10);
        c.enQueue(20);
        c.enQueue(30);
        c.display();
        c.deQueue();
        c.peek();
        c.display();
	}

}
