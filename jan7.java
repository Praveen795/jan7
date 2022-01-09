package jan7;


//___________________[circular queue]___________________________________________***

class Circularque{
	int max=5;
	int rear=-1;
	int front=-1;
	
	int[] circular=new int[max];
	
	boolean isfull() {
		if(front==0 && rear==max-1) {
			return true;
		}
		if(front==rear+1) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isempty() {
		if(front==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	void enqueue(int x) {
		if(isfull()) {
			System.out.println(" circular queue is full");
		}else {
			if(front==-1) 
				front=0;
			rear=(rear+1)%max;
			circular[rear]=x;
			System.out.println("inserted   :"+x);
				
			
		}
		
		


	}
	void dequeue() {
		int m;
		if(isempty()) {
			System.out.println("circular queue is empty");
			
		}else {
			m=circular[front];
			if(front==rear) {
				front=-1;
				rear=-1;
				
			}else {
				front=(front+1)%max;
			}
			
			System.out.println("deleted element  :"+ m);
			
		}
		
	}
	
	

}

public class jan7 {
	
	public static void main(String[] args) {
		
		Circularque obj=new Circularque();
		obj.enqueue(6);
		obj.enqueue(6);
		obj.enqueue(6);
		obj.enqueue(6);
		obj.dequeue();
		
		
		
		
	}

}
