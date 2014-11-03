package examples.threads;
 public class Example {

   public static void main(String[] args){
     Counter counter = new Counter();
     Thread  threadA = new CounterThread(counter);
     Thread  threadB = new CounterThread(counter);
	  threadA.setName("threadA");
	  threadB.setName("threadB");
     threadA.start();
     threadB.start(); 
	   //separate counter instances
	   
	  /* Counter counterA = new Counter();
	      Counter counterB = new Counter();
	      Thread  threadA = new CounterThread(counterA);
	      Thread  threadB = new CounterThread(counterB);
	      threadA.setName("threadA");
	      threadB.setName("threadB");

	      threadA.start();
	      threadB.start();*/
   
   }
 }
