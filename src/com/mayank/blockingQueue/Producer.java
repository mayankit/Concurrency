package com.mayank.blockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer {

	private static final Random random = new Random();
	
	private BlockingQueue<Integer> queue;
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	public void startProducer(){
		while (true){
		Integer value = random.nextInt(100);
		try {
			queue.put(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Adding value in queue "+ value);
		}
	}

}
