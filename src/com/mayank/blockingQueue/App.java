package com.mayank.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

	private static final BlockingQueue<Integer> queue =  new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) {
		
	
	Producer producer = new Producer(queue);
	Consumer consumer = new Consumer(queue);
	
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			producer.startProducer();
		}
	});
	Thread t2 = new Thread(new Runnable() {
		public void run() {
			consumer.startConsumer();
		}
	});
	
	t1.start();
	t2.start();
	}
	
}
