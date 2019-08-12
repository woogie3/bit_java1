package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test01 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i<100; i++) {
			stack.push(""+i);
		}
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();//큐는별도로 믈래스생성불가능
		for (int i = 0; i < 100; i++) {
			queue.offer(i);
		}
		System.out.println(queue.poll());

	}

}
