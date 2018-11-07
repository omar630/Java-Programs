import java.util.*;
public class MultiThread {
	public static void main(String args[]) {
	A a=new A();
	a.run();
	}
	
}
class even implements Runnable{
	public int x;
	even(int x){
		this.x=x;
	}
	public void run() {
		System.out.println("Thread Name:"+Thread.currentThread().getName()+"&"+x+" is even number square of it is "+x*x);
	}
}
class odd implements Runnable{
	public int x;
	odd(int x){
		this.x=x;
	}
	public void run() {
		System.out.println("Thread Name:"+Thread.currentThread().getName()+"&"+x+" is odd number cube of it is "+x*x*x);
	}
}
class A extends Thread{
	String tname;
	Thread t1,t2;
	public void run() {
		int num=0;
		Random r=new Random();
		try {
			for(int i=0;i<5;i++) {
				num=r.nextInt(20);
				System.out.println("Main Thread and generated number is "+num);
				if(num%2==0) {
					t1=new Thread(new even(num));
					t1.setName("EVEN THREAD");
					t1.start();
				}
				else {
					t2=new Thread(new odd(num));
					t2.setName("ODD THREAD");
					t2.start();
				}
				Thread.sleep(1000);
				System.out.println("----------------------------------------------------------");
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}