import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4 {

	private JFrame frame;
    private JPasswordField passwordField;
    private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public void tdscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 window = new Frame4();
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
	public Frame4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Decryption");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(101, 11, 294, 52);
		frame.getContentPane().add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(162, 72, 262, 44);
		frame.getContentPane().add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 141, 262, 44);
		frame.getContentPane().add(passwordField);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textArea.getText().equals("")){
                	JOptionPane.showMessageDialog(null,"Message Field should not be empty");
				}
                else
                {
				String dinp=textArea.getText();
				if(passwordField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"password Field should not be empty");
				}
				else
				{
				String dpwd=passwordField.getText();
				Tomorse dto=new Tomorse();
				String pdpwd=dto.Display(dpwd);
				Decrypt de=new Decrypt();
				String pdinp=de.drail(dinp);
				//JOptionPane.showMessageDialog(null, pdinp);
				Dsafe ds=new Dsafe();
				ds.desafe(pdinp, pdpwd);
				ds.dbinary();
			}
			}
			}
		});
		btnDecrypt.setBounds(111, 215, 89, 23);
		frame.getContentPane().add(btnDecrypt);
		
		JLabel lblEnterTheMessage = new JLabel("Enter The Message");
		lblEnterTheMessage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterTheMessage.setBounds(10, 77, 146, 39);
		frame.getContentPane().add(lblEnterTheMessage);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(31, 156, 106, 29);
		frame.getContentPane().add(lblPassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame2 fr2=new Frame2();
				fr2.tframe();
			}
		});
		btnBack.setBounds(240, 215, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
