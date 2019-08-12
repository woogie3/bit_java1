package day24;

public class MyStack {//동기화하고 데드락상태에 교착되지않기위해 notifyAll과 wait 메소드를 추가했다.
	int top ;
	int[] stack;
	int size;
	
	
	public MyStack() {	
		stack = new int[10];
	}

	public MyStack(int size) {
		if(size <0)
			stack = new int[10];
		else
			stack = new int[size];
		
	}

	public synchronized boolean isEmpty() {
		return  top == 0 ? true : false;
	}

	public synchronized void push(int data) {
		if(isFull()) {
//			System.out.println("stack is full..");
//		return;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stack[top] = data;
		top++;
		System.out.println("push => "+data);
		notifyAll();
	}

	public synchronized int pop() {
		if(isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		int data = stack[--top];
		System.out.println("                    pop ==> "+data);
		notifyAll();
		return data;
		
		
	}

	public synchronized boolean isFull() {
		return top == stack.length ? true : false;
	}

	public synchronized int top() {
		if(isEmpty())return -1;
		return stack[top-1];
	}

}


