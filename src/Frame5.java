import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Frame5 {

	private JFrame frame;
	private JTextArea textArea;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public void fscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 window = new Frame5();
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
	public Frame5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Encryption");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(154, 9, 270, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
				fileChooser.setFileFilter(filter);
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
				    File selectedFile = fileChooser.getSelectedFile();
				    textArea.setText(selectedFile.getAbsolutePath());
				   // System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				}
			}
		});
		btnNewButton.setBounds(335, 142, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Encrypt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textArea.getText().equals("")){
	                	JOptionPane.showMessageDialog(null,"Message Field should not be empty");
					}
	                else
	                {
				String path=textArea.getText();
				String ptext="";
				Fvalue fv=new Fvalue();
				try{
				ptext=fv.readFile(path);
				}catch(Exception k){}
				//System.out.print(ptext);
				if(passwordField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"password Field should not be empty");
				}
				else
				{
				String pwd=passwordField.getText();
				String rpwd=passwordField_2.getText();
				int j=pwd.compareTo(rpwd);
				//JOptionPane.showMessageDialog(null,j);
				if(j==0)
				{
					Tomorse to=new Tomorse();
					String pinp=to.Display(ptext);
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
		btnNewButton_1.setBounds(114, 291, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 176, 152, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Re-enter Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 232, 152, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSelectTheFile = new JLabel("Select The File");
		lblSelectTheFile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSelectTheFile.setBounds(10, 64, 123, 28);
		frame.getContentPane().add(lblSelectTheFile);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 103, 404, 28);
		frame.getContentPane().add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 184, 241, 24);
		frame.getContentPane().add(passwordField);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(183, 232, 241, 23);
		frame.getContentPane().add(passwordField_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame6 fr6=new Frame6();
				fr6.topt();
			}
		});
		btnBack.setBounds(259, 291, 89, 23);
		frame.getContentPane().add(btnBack);
		
	}
}
