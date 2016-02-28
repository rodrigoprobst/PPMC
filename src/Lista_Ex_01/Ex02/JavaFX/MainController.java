package Lista_Ex_01.Ex02.JavaFX;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class MainController implements Initializable{

/*
 * do{
			Thread t1 = new Thread(task1);
			Thread t2 = new Thread(task1);
			Thread t3 = new Thread(task1);
			Thread t4 = new Thread(task1);
			t1.start();
			while(t1.isAlive())
				System.out.println("1");
			t2.start();
			while(t2.isAlive())
				System.out.println("2");
			t3.start();
			while(t3.isAlive())
				System.out.println("3");
			t4.start();
			while(t4.isAlive())
				System.out.println("4");
			
		}while(true);
 */

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		getPane1().setStyle("-fx-background-color: red;");
		getPane2().setStyle("-fx-background-color: red;");
		getPane3().setStyle("-fx-background-color: red;");
		getPane4().setStyle("-fx-background-color: red;");
		
	}
	@FXML private Pane pane1;
	@FXML private Pane pane2;
	@FXML private Pane pane3;
	@FXML private Pane pane4;
	private boolean pause1 = true, pause2 = false, pause3 = false, pause4 = true;

	public void setPause1(){
		if(pause1){
			System.out.println(pause1);
			pause1 = false;
		}else
			pause1 = true;
	}
	public void setPause2(){
		if(pause2)
			pause2 = false;
		else
			pause2 = true;
	}
	public void setPause3(){
		if(pause3)
			pause3 = false;
		else
			pause3 = true;
	}
	public void setPause4(){
		if(pause4)
			pause4 = false;
		else
			pause4 = true;
	}
	
	public Pane getPane1(){
		return pane1;
	}
	public Pane getPane2(){
		return pane2;
	}
	public Pane getPane3(){
		return pane3;
	}
	public Pane getPane4(){
		return pane4;
	}
	
	private Service<Void> backgroundThread1 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t1");
						if(pause1){
							getPane1().setStyle("-fx-background-color: green;");
							Thread.sleep(10000);
							getPane1().setStyle("-fx-background-color: yellow;");
							Thread.sleep(2000);
							getPane1().setStyle("-fx-background-color: red;");
							setPause1();
							setPause2();
						}
					}while(true);
				}
			};
		}
	};
	private Service<Void> backgroundThread2 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t2");
						if(pause2){
							getPane2().setStyle("-fx-background-color: green;");
							Thread.sleep(10000);
							getPane2().setStyle("-fx-background-color: yellow;");
							Thread.sleep(2000);
							getPane2().setStyle("-fx-background-color: red;");
							setPause2();
							setPause1();
						}
					}while(true);
				}
			};
		}
	};
	private Service<Void> backgroundThread3 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t\t3");
						if(pause3){
							getPane3().setStyle("-fx-background-color: green;");
							Thread.sleep(10000);
							getPane3().setStyle("-fx-background-color: yellow;");
							Thread.sleep(2000);
							getPane3().setStyle("-fx-background-color: red;");
							setPause3();
							setPause4();
						}
					}while(true);
				}
			};
		}
	};
	private Service<Void> backgroundThread4 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t\t\t\t4");
						if(pause4){
							getPane4().setStyle("-fx-background-color: green;");
							Thread.sleep(10000);
							getPane4().setStyle("-fx-background-color: yellow;");
							Thread.sleep(2000);
							getPane4().setStyle("-fx-background-color: red;");
							setPause4();
							setPause3();
						}
					}while(true);
				}
			};
		}
	};

	public void start() throws InterruptedException{
		backgroundThread1.restart();
		backgroundThread2.restart();
		backgroundThread3.restart();
		backgroundThread4.restart();
	}
	
}