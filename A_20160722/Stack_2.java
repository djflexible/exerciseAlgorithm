package A_20160722;

public class Stack_2 {

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

	public Stack_2() { // 스택의 생성자
		this.top = null;
	}

	public boolean empty() { // 비어 있는지

		if (top == null) {
			System.out.println("No Food");
			return true;
		} else {
			System.out.println("Yes Food");
			return false;
		}
	}

	public int peek() { // return top node

		if (top == null) {
			// return -1;
			System.out.println("No Food");
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
}
