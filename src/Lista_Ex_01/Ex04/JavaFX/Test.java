package Lista_Ex_01.Ex04.JavaFX;

import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;
import javafx.concurrent.Task;
public class Test {

public static void main(String[] args) {
	Thread thread = new Thread(task);
	thread.start();
}
	static Task<Integer> task = new Task<Integer>() {
	    @Override protected Integer call() throws Exception {
	        int iterations;
	        for (iterations = 0; iterations < 1000; iterations++) {
	            if (isCancelled()) {
	                updateMessage("Cancelled");
	                break;
	            }
	            updateMessage("Iteration " + iterations);
	            updateProgress(iterations, 1000);
	 
	            //Block the thread for a short time, but be sure
	            //to check the InterruptedException for cancellation
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException interrupted) {
	                if (isCancelled()) {
	                    updateMessage("Cancelled");
	                    break;
	                }
	            }
	        }
	        return iterations;
	    }
	};
}
