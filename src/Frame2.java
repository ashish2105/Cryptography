import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 {

	private JFrame frame;
	public String einput, emid;

	/**
	 * Launch the application.
	 */
	public void tframe() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 223);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame3 fte=new Frame3();
				fte.escreen();
			}
		});
		btnEncrypt.setBounds(61, 112, 89, 23);
		frame.getContentPane().add(btnEncrypt);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame4 ftd=new Frame4();
				ftd.tdscreen();
			}
		});
		btnDecrypt.setBounds(203, 112, 89, 23);
		frame.getContentPane().add(btnDecrypt);
		
		JLabel lblMakeYourChoice = new JLabel("Make Your Choice");
		lblMakeYourChoice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblMakeYourChoice.setBounds(59, 29, 265, 58);
		frame.getContentPane().add(lblMakeYourChoice);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame1 frm1=new Frame1();
				frm1.start();
			}
		});
		btnBack.setBounds(133, 151, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
