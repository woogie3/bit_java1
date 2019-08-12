package day19;

public class MyStack<E> {//제네릭 사용한 스택
	E[] stack;
	int top = 0;
	
	MyStack() {	
		
		stack = (E[])new Object[10];
	}

	MyStack(int size) {
		if(size <0)
			stack =(E[]) new Object[10];
		else
			stack =(E[]) new Object[size];
		
	}

	boolean isEmpty() {
		return  top == 0 ? true : false;
	}

	void push(E data) {
		if(isFull()) {
			System.out.println("stack is full..");
		return;
		}
		stack[top] = data;
		top++;
		}

	public boolean isFull() {
		return top == stack.length ? true : false;
	}

	E top() {
		if(isEmpty()) return null;
		return stack[top-1];
	}

	E pop() {
		if(isEmpty()) return null;
		return stack[--top];



}

	

}
