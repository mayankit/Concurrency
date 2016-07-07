package com.mayank.blockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer {

	private static final Random random = new Random();
	private BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
	 this.queue = queue;
	}
	
	public void startConsumer(){
		
		while(true){
			try {
				Thread.sleep(100);
				
				if(random.nextInt(10) == 0){
					Integer value = queue.take();
					System.out.println("Value taken out is : "+value+" Queue size :"+queue.size());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
