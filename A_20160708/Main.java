package A_20160708;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack1 stack = new Stack1();
		int loc = 0;
		int k = 0;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int N = sc1.nextInt();
		String cmd[] = new String[N];

		for (int i = 0; i < N; i++) {
			cmd[i] = sc2.nextLine();
		}

		for (int i = 0; i < N; i++) {

			if (cmd[i].contains("push")) {
				loc = cmd[i].length();
				k = Integer.parseInt(cmd[i].substring(5, loc));
				stack.push(k);
			}

			if (cmd[i].contains("pop")) {
				stack.pop();
			}

			if (cmd[i].contains("top")) {
				stack.peek();
			}

			if (cmd[i].contains("size")) {
				stack.size();
			}

			if (cmd[i].contains("empty")) {
				stack.empty();
			}
		}

		sc1.close();
		sc2.close();

	}

}

class Stack1 {

	private Node top;
	private int size = 0;

	private class Node {
		private int data;
		private Node nextNode;

		Node(int data) { // 마지막 노드
			this.data = data;
			this.nextNode = null;
		}
	}

	public Stack1() { // 스택의 생성자
		this.top = null;
	}

	public boolean empty() { // 비어 있는지

		if (top == null) {
			System.out.println("1");
			return true;
		} else {
			System.out.println("0");
			return false;
		}
	}

	public int peek() { // return top node

		if (top == null) {
			// return -1;
			System.out.println("-1");
			// throw new ArrayIndexOutOfBoundsException();
			// throw new NullPointerException("NULL ELEMENT!");
			return -1;
		} else {
			System.out.println(top.data);
			return top.data;
		}
	}

	public void push(int input) { // 삽입
		Node newNode = new Node(input);
		newNode.nextNode = top;
		top = newNode;
		size++;
	}

	public int pop() { // 삭제
		int input = peek();

		if (top == null) {
			return 0;
		} else {
			top = top.nextNode; // 생성하지 않은 객체에서 해당 메소드를 사용하는 경우
			size--;
			return input;
		}
	}

	public int size() {
		System.out.println(size);
		return size;
	}

	public void dummy() {

	}
}
