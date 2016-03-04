package Lista_Ex_01.Ex03.JavaFX;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class MainController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		getGreen1().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen1().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen1().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen1().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");

		getYellow1().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow2().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow3().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow4().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		
		getRed1().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed2().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed3().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed4().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");

		car1.setBackground(new Background(myBI2));
		car2.setBackground(new Background(myBI1));
		car3.setBackground(new Background(myBI2));
		car4.setBackground(new Background(myBI1));
		
		backgroundThread1.restart();
		backgroundThread2.restart();
		backgroundThread3.restart();
		backgroundThread4.restart();
		
	}
	@FXML private Shape green1;
	@FXML private Shape green2;
	@FXML private Shape green3;
	@FXML private Shape green4;
	@FXML private Shape red1;
	@FXML private Shape red2;
	@FXML private Shape red3;
	@FXML private Shape red4;
	@FXML private Shape yellow1;
	@FXML private Shape yellow2;
	@FXML private Shape yellow3;
	@FXML private Shape yellow4;
	@FXML private Pane car1;
	@FXML private Pane car2;
	@FXML private Pane car3;
	@FXML private Pane car4;
	private boolean pause1 = false;
	private boolean pause2 = false;
	private boolean pause3 = false;
	private boolean pause4 = false;
	private boolean pauseCar1 = false;
	private boolean pauseCar2 = false;
	private boolean pauseCar3 = false;
	private boolean pauseCar4 = false;
	private final int WAIT_HOW_LONG = 2;
	Random rand = new Random();
	BackgroundImage myBI1= new BackgroundImage(new Image("Lista_Ex_01/Ex02/JavaFX/car1.png",250,150,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	BackgroundImage myBI2= new BackgroundImage(new Image("Lista_Ex_01/Ex02/JavaFX/car2.png",250,125,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	
	public Pane getCar1() {
		return car1;
	}
	public void setCar1(Pane car1) {
		this.car1 = car1;
	}
	public Pane getCar2() {
		return car2;
	}
	public void setCar2(Pane car2) {
		this.car2 = car2;
	}
	public Pane getCar3() {
		return car3;
	}
	public void setCar3(Pane car3) {
		this.car3 = car3;
	}
	public Pane getCar4() {
		return car4;
	}
	public void setCar4(Pane car4) {
		this.car4 = car4;
	}
	public Shape getGreen1() {
		return green1;
	}
	public void setGreen1(Shape green1) {
		this.green1 = green1;
	}
	public Shape getGreen2() {
		return green2;
	}
	public void setGreen2(Shape green2) {
		this.green2 = green2;
	}
	public Shape getGreen3() {
		return green3;
	}
	public void setGreen3(Shape green3) {
		this.green3 = green3;
	}
	public Shape getGreen4() {
		return green4;
	}
	public void setGreen4(Shape green4) {
		this.green4 = green4;
	}
	public Shape getRed1() {
		return red1;
	}
	public void setRed1(Shape red1) {
		this.red1 = red1;
	}
	public Shape getRed2() {
		return red2;
	}
	public void setRed2(Shape red2) {
		this.red2 = red2;
	}
	public Shape getRed3() {
		return red3;
	}
	public void setRed3(Shape red3) {
		this.red3 = red3;
	}
	public Shape getRed4() {
		return red4;
	}
	public void setRed4(Shape red4) {
		this.red4 = red4;
	}
	public Shape getYellow1() {
		return yellow1;
	}
	public void setYellow1(Shape yellow1) {
		this.yellow1 = yellow1;
	}
	public Shape getYellow2() {
		return yellow2;
	}
	public void setYellow2(Shape yellow2) {
		this.yellow2 = yellow2;
	}
	public Shape getYellow3() {
		return yellow3;
	}
	public void setYellow3(Shape yellow3) {
		this.yellow3 = yellow3;
	}
	public Shape getYellow4() {
		return yellow4;
	}
	public void setYellow4(Shape yellow4) {
		this.yellow4 = yellow4;
	}
	public void setPause1(){
		if(pause1)
			pause1 = false;
		else
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
	public void setPauseCar1(){
		if(pauseCar1)
			pauseCar1 = false;
		else
			pauseCar1 = true;
	}
	public void setPauseCar2(){
		if(pauseCar2)
			pauseCar2 = false;
		else
			pauseCar2 = true;
	}
	public void setPauseCar3(){
		if(pauseCar3)
			pauseCar3 = false;
		else
			pauseCar3 = true;
	}
	public void setPauseCar4(){
		if(pauseCar4)
			pauseCar4 = false;
		else
			pauseCar4 = true;
	}
	public void iniciaSemáforo(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(7000);
		green.setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		yellow.setStyle("-fx-fill: rgba(255,255,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,255,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(1000);
		yellow.setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		red.setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(500);
	}
	public void resetCar(Pane car, int x, int y, int rotation){
		car.setLayoutX(x);
		car.setLayoutY(y);
		car.setStyle("-fx-rotate: " + rotation + ";");
	}	
	
	public void car1() throws InterruptedException{
		int random = rand.nextInt(10) + 1;
		if(pause1){
			for (double i = car1.getLayoutY(); i > 550; i--) {
				Thread.sleep(WAIT_HOW_LONG);
				car1.setLayoutY(i);
			}
			if(random < 3.33){
				car1.setStyle("-fx-rotate: 0;");
				for (double i = car1.getLayoutX(); i < 1200; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car1.setLayoutX(i);
				}
			}else
				if(random < 6.6){
					for (double i = car1.getLayoutY(); i > -250; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car1.setLayoutY(i);
					}
				}else{
					for (double i = car1.getLayoutY(); i > 330; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car1.setLayoutY(i);
					}
					car1.setStyle("-fx-rotate: 180;");
					for (double i = car1.getLayoutX(); i > -250; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car1.setLayoutX(i);
					}
				}
			resetCar(getCar1(),583, 1100, 270);
			Thread.sleep(6000);
			for (double i = car1.getLayoutY(); i > 870; i--) {
				Thread.sleep(WAIT_HOW_LONG);
				car1.setLayoutY(i);
			}
			car1Thread.cancel();
		}
		
	}
	
	public void car2() throws InterruptedException{
		int random = rand.nextInt(10) + 1;
		if(pause2){
			for (double i = car2.getLayoutX(); i > 575; i--) {
				Thread.sleep(WAIT_HOW_LONG);
				car2.setLayoutX(i);
			}
			if(random < 3.33){
				car2.setStyle("-fx-rotate: 90;");
				for (double i = car2.getLayoutY(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car2.setLayoutY(i);
				}
			}else
				if(random < 6.6){
					for (double i = car2.getLayoutX(); i > -250; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car2.setLayoutX(i);
					}
				}else{
					for (double i = car2.getLayoutX(); i > 375; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car2.setLayoutX(i);
					}
					car2.setStyle("-fx-rotate: 270;");
					for (double i = car2.getLayoutY(); i < 1000; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car2.setLayoutY(i);
					}
				}
			resetCar(getCar2(),1200, 270, 0);
			Thread.sleep(6000);
			for (double i = car2.getLayoutX(); i > 900; i--) {
				Thread.sleep(WAIT_HOW_LONG);
				car2.setLayoutX(i);
			}
			car2Thread.cancel();
		}
		
	}
	
	public void car3() throws InterruptedException{
		int random = rand.nextInt(10) + 1;
		if(pause3){
			for (double i = car3.getLayoutY(); i < 330; i++) {
				Thread.sleep(WAIT_HOW_LONG);
				car3.setLayoutY(i);
			}
			if(random < 3.33){
				car3.setStyle("-fx-rotate: 180;");
				for (double i = car3.getLayoutX(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car3.setLayoutX(i);
				}
			}else
				if(random < 6.6){
					for (double i = car3.getLayoutY(); i < 1000; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car3.setLayoutY(i);
					}
				}else{
					for (double i = car3.getLayoutY(); i < 550; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car3.setLayoutY(i);
					}
					car3.setStyle("-fx-rotate: 0;");
					for (double i = car3.getLayoutX(); i < 1200; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car3.setLayoutX(i);
					}
				}
			resetCar(getCar3(), 372, -250, 90);
			Thread.sleep(6000);
			for (double i = car3.getLayoutY(); i < 10; i++) {
				Thread.sleep(WAIT_HOW_LONG);
				car3.setLayoutY(i);
			}
			car3Thread.cancel();
		}
		
	}
	
	public void car4() throws InterruptedException{
		int random = rand.nextInt(10) + 1;
		if(pause4){
			for (double i = car4.getLayoutX(); i < 375; i++) {
				Thread.sleep(WAIT_HOW_LONG);
				car4.setLayoutX(i);
			}
			if(random < 3.33){
				car4.setStyle("-fx-rotate: 270;");
				for (double i = car4.getLayoutY(); i < 1000; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car4.setLayoutY(i);
				}
			}else
				if(random < 6.6){
					for (double i = car4.getLayoutX(); i < 1200; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car4.setLayoutX(i);
					}
				}else{
					for (double i = car4.getLayoutX(); i < 575; i++) {
						Thread.sleep(WAIT_HOW_LONG);
						car4.setLayoutX(i);
					}
					car4.setStyle("-fx-rotate: 90;");
					for (double i = car4.getLayoutY(); i > -250; i--) {
						Thread.sleep(WAIT_HOW_LONG);
						car4.setLayoutY(i);
					}
				}
			resetCar(getCar4(), -250, 530, 180);
			Thread.sleep(6000);
			for (double i = car4.getLayoutX(); i < 50; i++) {
				Thread.sleep(WAIT_HOW_LONG);
				car4.setLayoutX(i);
			}
			car4Thread.cancel();
		}
		
	}
	private Service<Void> car1Thread = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						if (isCancelled()) {
							break;
						}
						System.out.println("\tCar1");
						if(pauseCar1){
							car1();
							setPauseCar1();
						}else
							Thread.sleep(1000);
					}while(true);
					return null;
				}
			};
		}
	};
	private Service<Void> car2Thread = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\tCar2");
						if(pauseCar2){
							car2();
							setPauseCar2();
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	
	private Service<Void> car3Thread = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t\tCar3");
						if(pauseCar3){
							car3();
							setPauseCar3();
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	
	private Service<Void> car4Thread = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t\t\tCar4");
						if(pauseCar4){
							car4();
							setPauseCar4();
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
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
							setPauseCar1();
							iniciaSemáforo(getRed1(), getGreen1(), getYellow1());
							setPause1();
							setPause2();
						}else
							Thread.sleep(1000);
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
							setPauseCar2();
							iniciaSemáforo(getRed2(), getGreen2(), getYellow2());
							setPause2();
							setPause1();
						}else
							Thread.sleep(1000);
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
							setPauseCar3();
							iniciaSemáforo(getRed3(), getGreen3(), getYellow3());
							setPause3();
							setPause4();
						}else
							Thread.sleep(1000);
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
							setPauseCar4();
							iniciaSemáforo(getRed4(), getGreen4(), getYellow4());
							setPause4();
							setPause3();
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};

	public void start() throws InterruptedException{
		setPause1();
		setPause3();
	}
	public void startcar(){
		car1Thread.restart();
		car2Thread.restart();
		car3Thread.restart();
		car4Thread.restart();
	}
	
}