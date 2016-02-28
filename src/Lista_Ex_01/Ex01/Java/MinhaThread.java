package Lista_Ex_01.Ex01.Java;
import javax.swing.JLabel;

public class MinhaThread implements Runnable{
	
	private boolean pause;
	private int num;
	public JLabel label;
	
	public boolean isPause() {
		return pause;
	}

	public void setPause() {
		if(pause)
			this.pause = false;
		else
			this.pause = true;
	}

	public int getNumber() {
		return num;
	}

	public void setNumber(int number) {
		this.num = number;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public void reset(){
		num = 0;
		getLabel().setText("0");
		if(!isPause())
			setPause();
	}

	public void run(){
		for (num = 0; num >= 0; num++) {
			try {
				Thread.sleep(1000);
				if(!isPause())
					label.setText(String.valueOf(num));
				else
					num--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
