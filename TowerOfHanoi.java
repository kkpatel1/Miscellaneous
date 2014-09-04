import java.util.*;
class Stack {
	int size;
	int top;
	String name;
	int[] Data;
	public Stack(int size, String name) {
		top=-1;
		this.size=size;
		this.name = name;
		Data = new int[size];
	}
	void push(int data) {
		Data[++top] = data;
	}
	int pop() {
		return Data[top--];
	}
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==size-1;
	}
	void display() {
		for (int i=top; i>=0; i--)
			System.out.println(Data[i]);
	}
}
public class TowerOfHanoi {
	static Stack first;
	static Stack second;
	static Stack third;
	static int count=0;
	static void HanoiFunction(int disks, Stack first, Stack third, Stack second) {
		if(disks != 1)
			HanoiFunction(disks-1, first, second, third);
		int inHand = first.pop();
		third.push(inHand);
		count++;
			System.out.println(count+". "+first.name+" to "+third.name);
		if(disks != 1)
			HanoiFunction(disks-1, second, third, first);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of Disks:");
		int n = in.nextInt();
		first = new Stack(n, "1");
		second = new Stack(n, "2");
		third = new Stack(n, "3");
		for (int i=0; i<n; i++) {
			first.push(n-i);
		}
		long initial = System.currentTimeMillis();
		HanoiFunction(n, first, third, second);
		long end = System.currentTimeMillis();
		first.display();
		System.out.println((initial-end)/1000);
	}
}