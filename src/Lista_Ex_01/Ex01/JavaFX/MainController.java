package Lista_Ex_01.Ex01.JavaFX;

import java.awt.Font;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JLabel;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		JLabel label1 = new JLabel("0");
		label1.setBounds(350, 20, 231, 70);
		label1.setFont(new Font("Arial", Font.BOLD, 90)); 
	}
	private int fim1, fim2;
	@FXML private Label Thread1,  Thread2;
	private boolean pause1 = false;
	private boolean pause2 = false;
	
	public boolean isPaused1() {
		return pause1;
	}
	public void setPaused1(boolean pause) {
		this.pause1 = pause;
	}
	public boolean isPaused2() {
		return pause2;
	}
	public void setPaused2(boolean pause) {
		this.pause2 = pause;
	}
	
	private Service<Void> backgroundThread1 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
		// TODO Auto-generated method stub
		return null;
	}
	
};
	private Service<Void> backgroundThread2 = new Service<Void>(){

		@Override
		protected Task<Void> createTask() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	public Label getThread1(){
		return Thread1;
	}
	public Label getThread2(){
		return Thread2;
	}	
	
	
	
	public void play1(){
		if(!backgroundThread1.isRunning() && fim1 == 0){
			backgroundThread1 = new Service<Void>() {
				@Override
				protected Task<Void> createTask() {
					// TODO Auto-generated method stub
					return new Task<Void>() {
						@Override
						protected Void call() throws Exception {
							for (int i = 0; ; i++) {
								Thread.sleep(1000);
								if(!isPaused1())
									updateMessage("" + i);
								else
									i--;
							}
						}
					};
				}
			};

		getThread1().textProperty().bind(backgroundThread1.messageProperty());
			backgroundThread1.start();
			fim1 = 1;
		}else{
			setPaused1(false);
			fim1 = 0;
		}
		
	}	
	
	public void play2(){
		if(!backgroundThread2.isRunning() && fim2 == 0){
			backgroundThread2 = new Service<Void>() {
				@Override
				protected Task<Void> createTask() {
					// TODO Auto-generated method stub
					return new Task<Void>() {
						@Override
						protected Void call() throws Exception {
							for (int i = 0; ; i++) {
								Thread.sleep(1000);
								if(!isPaused2())
									updateMessage("" + i);
								else
									i--;
							}
						}
					};
				}
			};

		getThread2().textProperty().bind(backgroundThread2.messageProperty());
			backgroundThread2.start();
			fim2 = 1;
		}else{
			setPaused2(false);
			fim2 = 0;
		}
	}	
	public void pause1(){
		setPaused1(true);
	}
	public void pause2() throws InterruptedException{
		setPaused2(true);
	}
	public void stop1() throws InterruptedException{
		if(backgroundThread1.isRunning()){
			backgroundThread1.restart();
			Thread.sleep(1000);
			setPaused1(true);
		}
	}
	public void stop2() throws InterruptedException{
		if(backgroundThread2.isRunning()){
			backgroundThread2.restart();
			Thread.sleep(1000);
			setPaused2(true);
		}
	}

	
}
