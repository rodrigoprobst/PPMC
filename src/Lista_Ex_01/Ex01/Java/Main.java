package Lista_Ex_01.Ex01.Java;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Main(){
		iniciar();
	}
	
	public void iniciar(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		JButton start1 = new JButton("Start");
		start1.setBounds(10, 40, 80, 30);
		panel.add(start1);
		
		JButton start2 = new JButton("Start");
		start2.setBounds(10, 150, 80, 30);
		panel.add(start2);

		JButton pause1 = new JButton("Pause");
		pause1.setBounds(110, 40, 80, 30);
		panel.add(pause1);

		JButton pause2 = new JButton("Pause");
		pause2.setBounds(110, 150, 80, 30);
		panel.add(pause2);
		
		JButton stop1 = new JButton("Stop");
		stop1.setBounds(210, 40, 80, 30);
		panel.add(stop1);
		
		JButton stop2 = new JButton("Stop");
		stop2.setBounds(210, 150, 80, 30);
		panel.add(stop2);
		
		JLabel label1 = new JLabel("0");
		label1.setBounds(350, 20, 231, 70);
		label1.setFont(new Font("Arial", Font.BOLD, 90)); 
		panel.add(label1);
		
		final JLabel label2 = new JLabel("0");
		label2.setBounds(350, 130, 231, 70);
		label2.setFont(new Font("Arial", Font.BOLD, 90)); 
		panel.add(label2);

		JLabel lblThread1 = new JLabel("Thread 1");
		lblThread1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThread1.setBounds(104, 0, 104, 30);
		panel.add(lblThread1);
		
		JLabel lblThread2 = new JLabel("Thread 2");
		lblThread2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThread2.setBounds(104, 113, 109, 30);
		panel.add(lblThread2);

		setTitle("Contador em Threads");
		setSize(600, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Thread t1 = new Thread(new Contador(), "contador 1");
        //t1.start();
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
				
        start1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (t1.getLabel() != null) {
                	if (t1.isPause()) {
    					t1.setPause();
    				}
                } else {
                	t1.setLabel(label1);
                    thread1.start();
                }
           }
        });
        start2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	 if (t2.getLabel() != null) {
                 	if (t2.isPause()) {
     					t2.setPause();
     				}
                 } else {
                 	t2.setLabel(label2);
                 	thread2.start();
                 }
           }
        });
        
        pause1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	if(!t1.isPause())
            		 t1.setPause();
           }
        });
        pause2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!t2.isPause())
                	t2.setPause();
           }
        });
        
        stop1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                t1.reset();
           }
        });
        stop2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                t2.reset();
           }
        });
	}
}
