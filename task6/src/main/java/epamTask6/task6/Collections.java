package epamTask6.task6;

import java.util.Arrays;

public class Collections<C> {
	private static final int INITIAL_CAPACITY = 10;
	private Object numbers[];
	private int capacity = 0;
	public Collections() {
		numbers = new Object[INITIAL_CAPACITY];
	}

	public void addElement(C e) {
		if (capacity == numbers.length) {
			ensure();
		}
		numbers[capacity++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public C getElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index : " + i + ", Size : " + i);
		}
		return (C) numbers[i];
	}
	
	@SuppressWarnings("unchecked")
	public C remove(int i) {
		if (i < 0 || i >= capacity) {
			throw new IndexOutOfBoundsException("Index : " + i + ", Size : " + i);
		}
		Object obj = numbers[i];
		int num = numbers.length - ( i + 1 ) ;
		System.arraycopy(numbers, i + 1, numbers, i, num) ;
		capacity--;
		return (C) obj;
	}
	
	public int size() {
		return capacity;
	}
	
	public void printList() {
		for(Object o : numbers)
			if(o == null)
				break;
		    else
		    	System.out.print(o + " ");
		System.out.println();
	}
	
	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int i = 0; i < capacity ; i++) {
			sb.append(numbers[i].toString());
			if(i < capacity - 1){
				sb.append(",");
			}
		}
		sb.append(']');
		return sb.toString();
	}
	
	
	private void ensure() {
		int size = numbers.length * 2;
		numbers = Arrays.copyOf(numbers, size);
	}
}
