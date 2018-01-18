import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void topt() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6 window = new Frame6();
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
	public Frame6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 344, 246);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make Your Choice");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(79, 11, 228, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Encryption");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame5 fte=new Frame5();
				fte.fscreen();
			}
		});
		btnNewButton.setBounds(123, 62, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Decryption");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame7 ftd=new Frame7();
				ftd.Fdtext();
			}
		});
		btnNewButton_1.setBounds(123, 117, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();;
				Frame1 frm1=new Frame1();
				frm1.start();
			}
		});
		btnBack.setBounds(123, 174, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
