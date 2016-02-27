package Exemplos_Threads_final;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MinhaThread(), "Thread 1");
		Thread t2 = new Thread(new MinhaThread(), "\t\tThread 2");
		t1.start();
		t2.start();
	}
}
