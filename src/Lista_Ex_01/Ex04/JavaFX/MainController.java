package Lista_Ex_01.Ex04.JavaFX;

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
		getGreen2().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen3().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen4().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen11().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen21().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen31().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		getGreen41().setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");

		getYellow1().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow2().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow3().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow4().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow11().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow21().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow31().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		getYellow41().setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");

		getRed1().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed2().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed3().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed4().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed11().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed21().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed31().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		getRed41().setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");

		car1.setBackground(new Background(myBI2));
		car2.setBackground(new Background(myBI1));
		car3.setBackground(new Background(myBI2));
		car4.setBackground(new Background(myBI1));

		SemaforoThread1.restart();
		SemaforoThread2.restart();
		SemaforoThread3.restart();
		SemaforoThread4.restart();
		SemaforoDThread1.restart();
		SemaforoDThread2.restart();
		SemaforoDThread3.restart();
		SemaforoDThread4.restart();


		
	}
	@FXML private Shape green1;
	@FXML private Shape green11;
	@FXML private Shape green2;
	@FXML private Shape green21;
	@FXML private Shape green3;
	@FXML private Shape green31;
	@FXML private Shape green4;
	@FXML private Shape green41;
	@FXML private Shape red1;
	@FXML private Shape red11;
	@FXML private Shape red2;
	@FXML private Shape red21;
	@FXML private Shape red3;
	@FXML private Shape red31;
	@FXML private Shape red4;
	@FXML private Shape red41;
	@FXML private Shape yellow1;
	@FXML private Shape yellow11;
	@FXML private Shape yellow2;
	@FXML private Shape yellow21;
	@FXML private Shape yellow3;
	@FXML private Shape yellow31;
	@FXML private Shape yellow4;
	@FXML private Shape yellow41;
	@FXML private Pane car1;
	@FXML private Pane car2;
	@FXML private Pane car3;
	@FXML private Pane car4;
	private boolean pause1 = false;
	private boolean pause2 = false;
	private boolean pause3 = false;
	private boolean pause4 = false;
	private boolean pause11 = false;
	private boolean pause21 = false;
	private boolean pause31 = false;
	private boolean pause41 = false;
	private boolean pauseCar1 = false;
	private boolean pauseCar2 = false;
	private boolean pauseCar3 = false;
	private boolean pauseCar4 = false;
	private final int WAIT_HOW_LONG = 2;
	Random rand = new Random();
	BackgroundImage myBI1= new BackgroundImage(new Image("Lista_Ex_01/Ex02/JavaFX/car1.png",250,150,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	BackgroundImage myBI2= new BackgroundImage(new Image("Lista_Ex_01/Ex02/JavaFX/car2.png",250,125,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	
	public Shape getGreen11() {
		return green11;
	}
	public void setGreen11(Shape green11) {
		this.green11 = green11;
	}
	public Shape getGreen21() {
		return green21;
	}
	public void setGreen21(Shape green21) {
		this.green21 = green21;
	}
	public Shape getGreen31() {
		return green31;
	}
	public void setGreen31(Shape green31) {
		this.green31 = green31;
	}
	public Shape getGreen41() {
		return green41;
	}
	public void setGreen41(Shape green41) {
		this.green41 = green41;
	}
	public Shape getRed11() {
		return red11;
	}
	public void setRed11(Shape red11) {
		this.red11 = red11;
	}
	public Shape getRed21() {
		return red21;
	}
	public void setRed22(Shape red21) {
		this.red21 = red21;
	}
	public Shape getRed31() {
		return red31;
	}
	public void setRed31(Shape red31) {
		this.red31 = red31;
	}
	public Shape getRed41() {
		return red41;
	}
	public void setRed41(Shape red41) {
		this.red41 = red41;
	}
	public Shape getYellow11() {
		return yellow11;
	}
	public void setYellow11(Shape yellow11) {
		this.yellow11 = yellow11;
	}
	public Shape getYellow21() {
		return yellow21;
	}
	public void setYellow21(Shape yellow21) {
		this.yellow21 = yellow21;
	}
	public Shape getYellow31() {
		return yellow31;
	}
	public void setYellow31(Shape yellow31) {
		this.yellow31 = yellow31;
	}
	public Shape getYellow41() {
		return yellow41;
	}
	public void setYellow41(Shape yellow41) {
		this.yellow41 = yellow41;
	}
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
	public boolean isPause1() {
		return pause1;
	}
	public boolean isPause2() {
		return pause2;
	}
	public boolean isPause3() {
		return pause3;
	}
	public boolean isPause4() {
		return pause4;
	}
	public boolean isPause11() {
		return pause11;
	}
	public boolean isPause21() {
		return pause21;
	}
	public boolean isPause31() {
		return pause31;
	}
	public boolean isPause41() {
		return pause41;
	}
	
	public void setPause1(boolean pause1){
		this.pause1 = pause1;
	}
	public void setPause2(boolean pause2){
		this.pause2 = pause2;
	}
	public void setPause3(boolean pause3){
		this.pause3 = pause3;
	}
	public void setPause4(boolean pause4){
		this.pause4 = pause4;
	}
	public void setPause11(boolean pause11){
		this.pause11 = pause11;
	}
	public void setPause21(boolean pause21){
		this.pause21 = pause21;
	}
	public void setPause31(boolean pause31){
		this.pause31 = pause31;
	}
	public void setPause41(boolean pause41){
		this.pause41 = pause41;
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
	public void iniciaSemáforo1(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		while(isPause11()) {
			Thread.sleep(1);
		}
		green.setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		yellow.setStyle("-fx-fill: rgba(255,255,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,255,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(1000);
		yellow.setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		red.setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(500);
	}public void iniciaSemáforo2(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		while(isPause21()) {
			Thread.sleep(1);
		}
		green.setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		yellow.setStyle("-fx-fill: rgba(255,255,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,255,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(1000);
		yellow.setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		red.setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(500);
	}public void iniciaSemáforo3(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		while(isPause31()) {
			Thread.sleep(1);
		}
		green.setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		yellow.setStyle("-fx-fill: rgba(255,255,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,255,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(1000);
		yellow.setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		red.setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(500);
	}public void iniciaSemáforo4(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		while(isPause41()) {
			Thread.sleep(1);
		}
		green.setStyle("-fx-fill: rgba(0,170,0,0.3); -fx-effect:none;");
		yellow.setStyle("-fx-fill: rgba(255,255,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,255,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(1000);
		yellow.setStyle("-fx-fill: rgba(255,255,0,0.3); -fx-effect:none;");
		red.setStyle("-fx-fill: rgba(255,0,0,1); -fx-effect: dropshadow( one-pass-box , rgba(255,0,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(500);
	}
	public void iniciaSemáforo(Shape red, Shape green, Shape yellow) throws InterruptedException{
		red.setStyle("-fx-fill: rgba(255,0,0,0.3); -fx-effect:none;");
		green.setStyle("-fx-fill: rgba(0,170,0,1); -fx-effect: dropshadow( one-pass-box , rgba(0,170,0,0.5) , 20 , 10 , 0 , 0 );");
		Thread.sleep(5000);
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
			if(random < 5){
				car1.setStyle("-fx-rotate: 0;");
				for (double i = car1.getLayoutX(); i < 1200; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car1.setLayoutX(i);
				}
			}else
				for (double i = car1.getLayoutY(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car1.setLayoutY(i);
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
			if(random < 5){
				car2.setStyle("-fx-rotate: 90;");
				for (double i = car2.getLayoutY(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car2.setLayoutY(i);
				}
			}else
				for (double i = car2.getLayoutX(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car2.setLayoutX(i);
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
			if(random < 5){
				car3.setStyle("-fx-rotate: 180;");
				for (double i = car3.getLayoutX(); i > -250; i--) {
					Thread.sleep(WAIT_HOW_LONG);
					car3.setLayoutX(i);
				}
			}else
				for (double i = car3.getLayoutY(); i < 1000; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car3.setLayoutY(i);
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
			if(random < 5){
				car4.setStyle("-fx-rotate: 270;");
				for (double i = car4.getLayoutY(); i < 1000; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car4.setLayoutY(i);
				}
			}else
				for (double i = car4.getLayoutX(); i < 1200; i++) {
					Thread.sleep(WAIT_HOW_LONG);
					car4.setLayoutX(i);
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
	private Service<Void> SemaforoThread1 = new Service<Void>(){
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
							setPause21(false);
							Thread.sleep(2000);
							setPause11(true);
							iniciaSemáforo(getRed1(), getGreen1(), getYellow1());
							setPause1(false);
							setPause2(true);
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoThread2 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t2");
						if(pause2){
							setPauseCar2();
							setPause31(false);
							Thread.sleep(2000);
							setPause21(true);
							iniciaSemáforo(getRed2(), getGreen2(), getYellow2());
							setPause2(false);
							setPause3(true);
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoThread3 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					do{
						System.out.println("\t\t\t3");
						if(pause3){
							setPauseCar3();
							setPause41(false);
							Thread.sleep(2000);
							setPause31(true);
							iniciaSemáforo(getRed3(), getGreen3(), getYellow3());
							setPause3(false);
							setPause4(true);
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoThread4 = new Service<Void>(){
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
							setPause11(false);
							Thread.sleep(2000);
							setPause41(true);
							iniciaSemáforo(getRed4(), getGreen4(), getYellow4());
							setPause4(false);
							setPause1(true);
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoDThread1 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t11");
						if(pause11){
							iniciaSemáforo1(getRed11(), getGreen11(), getYellow11());
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoDThread2 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t\t21");
						if(pause21){
							iniciaSemáforo2(getRed21(), getGreen21(), getYellow21());
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoDThread3 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t\t\t31");
						if(pause31){
							iniciaSemáforo3(getRed31(), getGreen31(), getYellow31());
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};
	private Service<Void> SemaforoDThread4 = new Service<Void>(){
		@Override
		protected Task<Void> createTask() {
			return new Task<Void>() {
				@Override
				protected Void call() throws Exception {
					// TODO Auto-generated method stub
					do{
						System.out.println("\t\t\t\t41");
						if(pause41){
							iniciaSemáforo4(getRed41(), getGreen41(), getYellow41());
						}else
							Thread.sleep(1000);
					}while(true);
				}
			};
		}
	};

	public void start() throws InterruptedException{
		setPause1(true);
		setPause11(true);
		setPause21(true);
		setPause31(true);
		setPause41(true);
	}
	public void startcar(){
		car1Thread.restart();
		car2Thread.restart();
		car3Thread.restart();
		car4Thread.restart();
	}
	
}