package Queque;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
	
	public class CyclicBarrierTestNet {
	
		public static void main(String[] args) {
				CyclicBarrier checkPoint = new CyclicBarrier(5, new CheckDestPoint());
				
				Thread biker1 = new Thread(new Biker(checkPoint), "Biker Thread 1");
		        Thread biker2 = new Thread(new Biker(checkPoint), "Biker Thread 2");
		        Thread biker3 = new Thread(new Biker(checkPoint), "Biker Thread 3");
		        Thread biker4 = new Thread(new Biker(checkPoint), "Biker Thread 4");
		        Thread carRider = new Thread(new CarRidding(checkPoint), "Car Thread");
		 
		        carRider.start();
		        biker1.start();
		        biker2.start();
		        biker3.start();
		        biker4.start();
				
				
		}
	}
	
	
	class CheckDestPoint implements Runnable{

		@Override
		public void run() {
				System.out.println("Yes..parties reached at this location");
		}
		
		
	}
	
	
	class Biker implements Runnable{
		CyclicBarrier checkPoint =null;
		
		
		public Biker(CyclicBarrier barrierPoint) {
			super();
			this.checkPoint = barrierPoint;
		}

		@Override
		public void run() {
			
			try
	        {
	            System.out.println(Thread.currentThread().getName() + " has left Pune");
	            
	            checkPoint.await();
	            System.out.println(Thread.currentThread().getName() + " Reached Lonavala -- will have breakfast");

	            checkPoint.await();
	            System.out.println(Thread.currentThread().getName() + " Panvel");
	            
	            checkPoint.await();
	            System.out.println(Thread.currentThread().getName() + " Vashi");
	            
	            checkPoint.await();
	            System.out.println(Thread.currentThread().getName() + " Thane");
	            
	            
	            checkPoint.await();
	            System.out.println(Thread.currentThread().getName() + " Dadar");
	            
	            
	        } 
	        catch (InterruptedException |  BrokenBarrierException ex) 
	        {
	            ex.printStackTrace();
	        }
			
			
		}
		
	}

	
	
	class CarRidding implements Runnable{
		CyclicBarrier checkPoint =null;
		public CarRidding(CyclicBarrier barrierPoint) {
			super();
			this.checkPoint = barrierPoint;
		}

			@Override
			public void run() {
				try
		        {
		            System.out.println(Thread.currentThread().getName() + " has left Pune");
		            
		            checkPoint.await();
		            System.out.println(Thread.currentThread().getName() + " car --Reached Lonavala -- will have breakfast");

		            checkPoint.await();
		            System.out.println(Thread.currentThread().getName() + " car -- Panvel");
		            
		            checkPoint.await();
		            System.out.println(Thread.currentThread().getName() + " car -- Vashi");
		            
		            checkPoint.await();
		            System.out.println(Thread.currentThread().getName() + " car -- Thane");
		            
		            System.out.println("car type got punctured....");
		            Thread.sleep(10000);
		            
		            
		            checkPoint.await();
		            System.out.println(Thread.currentThread().getName() + " car -- Dadar");
		            
		            /**
		             * Cyclicbarrier madhe -- barrier reset
		             * 
		             * 
		             * 
		             */
		            
		            
		        } 
		        catch (InterruptedException |  BrokenBarrierException ex) 
		        {
		            ex.printStackTrace();
		        }
				
				
			}
		}
		
	
	
	
	
	
	
	
	
	
	
