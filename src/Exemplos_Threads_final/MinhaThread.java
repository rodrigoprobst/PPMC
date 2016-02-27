package Exemplos_Threads_final;

public class MinhaThread implements Runnable{
	
	
	public void run(){
		String name = Thread.currentThread().getName();
		System.out.println(name + " rodando");
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ": " + i);
		}
		System.out.println("Fim!!!");
	}
	
}
