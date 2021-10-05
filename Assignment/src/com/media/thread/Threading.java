package com.media.thread;

public class Threading {

	public static void main(String[] args) {
		
		Runnable thread1 = () -> System.out.println("abc");
		
		Thread t1 = new Thread(thread1);
		t1.start();
	}

}
