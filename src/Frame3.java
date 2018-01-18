import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Frame3 {

	private JFrame frame;
    private JTextArea textArea;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
	/**
	 * Launch the application.
	 */
	public void escreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
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
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Encrypt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                if(textArea.getText().equals("")){
                	JOptionPane.showMessageDialog(null,"Message Field should not be empty");
				}
                else
                {
				String inp=textArea.getText();
				String pwd=passwordField.getText();
				if(passwordField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"password Field should not be empty");
				}
				else
				{
				String rpwd=passwordField_1.getText();
				int j=pwd.compareTo(rpwd);
				//JOptionPane.showMessageDialog(null,j);
				if(j==0)
				{
					Tomorse to=new Tomorse();
					String pinp=to.Display(inp);
					Tomorse top=new Tomorse();
					String ppwd=top.Display(pwd);
					//JOptionPane.showMessageDialog(null,pinp);
					Safe sa=new Safe();
					sa.Bsafe(pinp, ppwd);
					sa.hexa();
				}
				else
					JOptionPane.showMessageDialog(null,"Both the passwords must be same");
			}
			}
			}
		});
		btnNewButton.setBounds(99, 217, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(141, 55, 263, 34);
		frame.getContentPane().add(textArea);
		
		JLabel lblEncryption = new JLabel("Encryption");
		lblEncryption.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblEncryption.setBounds(181, 11, 127, 33);
		frame.getContentPane().add(lblEncryption);
		
		JLabel lblEnterMessage = new JLabel("Enter Message");
		lblEnterMessage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterMessage.setBounds(10, 60, 121, 29);
		frame.getContentPane().add(lblEnterMessage);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(10, 110, 121, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblReenterPassword.setBounds(10, 158, 131, 14);
		frame.getContentPane().add(lblReenterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 100, 263, 34);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(141, 145, 263, 32);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame2 fr2=new Frame2();
				fr2.tframe();
			}
		});
		btnBack.setBounds(251, 217, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
