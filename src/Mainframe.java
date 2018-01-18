import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainframe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe window = new Mainframe();
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
	public Mainframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Project on Encryption And Decryption");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(10, 11, 414, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsingMorseCode = new JLabel("Using Morse Code");
		lblUsingMorseCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblUsingMorseCode.setBounds(93, 62, 230, 31);
		frame.getContentPane().add(lblUsingMorseCode);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/need.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(163, 113, 96, 85);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBy = new JLabel("Submitted By");
		lblBy.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBy.setBounds(163, 209, 133, 24);
		frame.getContentPane().add(lblBy);
		
		JLabel lblAshishKumarSandil = new JLabel("Ashish Kumar Sandil                 1210712405");
		lblAshishKumarSandil.setBounds(108, 254, 379, 14);
		frame.getContentPane().add(lblAshishKumarSandil);
		
		JLabel lblAmarnadhMatsa = new JLabel("Amarnadh Matsa                        1210712402");
		lblAmarnadhMatsa.setBounds(108, 279, 356, 14);
		frame.getContentPane().add(lblAmarnadhMatsa);
		
		JLabel lblLokesh = new JLabel("Challangi Lokesh                        1210712412");
		lblLokesh.setBounds(108, 304, 356, 14);
		frame.getContentPane().add(lblLokesh);
		
		JLabel lblUnderSupervisionOf = new JLabel("Under Supervision of");
		lblUnderSupervisionOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUnderSupervisionOf.setBounds(136, 337, 160, 24);
		frame.getContentPane().add(lblUnderSupervisionOf);
		
		JLabel lblNewLabel_2 = new JLabel("Mr K Naveen Kumar");
		lblNewLabel_2.setBounds(163, 372, 268, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAssistantProfessor = new JLabel("(Assistant Professor)");
		lblAssistantProfessor.setBounds(163, 393, 261, 14);
		frame.getContentPane().add(lblAssistantProfessor);
		
		JLabel lblGitamInstituteOf = new JLabel("Gitam institute of Technology");
		lblGitamInstituteOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGitamInstituteOf.setBounds(125, 418, 215, 24);
		frame.getContentPane().add(lblGitamInstituteOf);
		
		JLabel lblGitamUniversity = new JLabel("GITAM University");
		lblGitamUniversity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGitamUniversity.setBounds(163, 442, 133, 24);
		frame.getContentPane().add(lblGitamUniversity);
		
		JLabel lblVisakhapatnam = new JLabel("Visakhapatnam");
		lblVisakhapatnam.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVisakhapatnam.setBounds(175, 467, 121, 24);
		frame.getContentPane().add(lblVisakhapatnam);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Frame1 f1=new Frame1();
				f1.start();
				//Mainframe.setVisibility();
			
			}
		});
		btnEnter.setBounds(332, 508, 89, 23);
		frame.getContentPane().add(btnEnter);
	}
}
