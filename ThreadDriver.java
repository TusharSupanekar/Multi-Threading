package com.jsp.multithreading;

public class ThreadDriver {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		Thread t=new Thread(myThread1);
		t.start();

		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
	}

}
