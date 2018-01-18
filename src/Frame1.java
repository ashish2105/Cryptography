import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import java.io.File; 

public class Frame1 {

	private JFrame frame;
	private JButton btnNewButton_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseSelectYour = new JLabel("Please Select Your  Choice");
		lblPleaseSelectYour.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPleaseSelectYour.setBounds(79, 33, 305, 35);
		frame.getContentPane().add(lblPleaseSelectYour);
		
		btnNewButton = new JButton("Text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Frame2 ft=new Frame2();
				ft.tframe();
				
			}
		});
		btnNewButton.setBounds(115, 93, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("File");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame6 fro=new Frame6();
				fro.topt();
				
			}
		});
		btnNewButton_1.setBounds(115, 160, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
