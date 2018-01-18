import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
public class Frame7 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public void Fdtext() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame7 window = new Frame7();
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
	public Frame7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 272);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Decryption");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(154, 11, 150, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select the File");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 47, 136, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 68, 414, 36);
		frame.getContentPane().add(textArea);
		
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
			}
			}
		});
		btnNewButton.setBounds(335, 115, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 149, 312, 31);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Decrypt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textArea.getText().equals("")){
	                	JOptionPane.showMessageDialog(null,"Message Field should not be empty");
					}
	                else
	                {
				String path=textArea.getText();
				String ptext="";
				Dfvalue fv=new Dfvalue();
				try{
				ptext=fv.readFile(path);
				}catch(Exception k){}
				//JOptionPane.showMessageDialog(null, ptext);
				//System.out.print(ptext);
				if(passwordField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"password Field should not be empty");
				}
				else
				{
				String fdpd=passwordField.getText();
				//System.out.print(fdpd);
				Tomorse tod=new Tomorse();
				String pfdpd=tod.Display(fdpd);
				//System.out.print(pfdpd);
				Decrypt dde=new Decrypt();
				String pptext=dde.drail(ptext);
				//System.out.print(pptext);
				Dsafe dds=new Dsafe();
				dds.desafe(pptext, pfdpd);
				dds.dbinary();
			}
			}
			}
		});
		btnNewButton_1.setBounds(102, 200, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 157, 109, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Frame6 fr6=new Frame6();
				fr6.topt();
			}
		});
		btnBack.setBounds(238, 200, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
