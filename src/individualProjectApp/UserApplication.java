package individualProjectApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserApplication {

	private JFrame frmShawqi;
	private JTextField textField_Name;
	private JTextField textField_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserApplication window = new UserApplication();
					window.frmShawqi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShawqi = new JFrame();
		frmShawqi.setTitle("Shawqi");
		frmShawqi.setBounds(100, 100, 450, 300);
		frmShawqi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShawqi.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(82, 99, 61, 16);
		frmShawqi.getContentPane().add(lblName);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(168, 94, 130, 26);
		frmShawqi.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignIn.setBounds(168, 171, 130, 29);
		frmShawqi.getContentPane().add(btnSignIn);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(82, 127, 61, 16);
		frmShawqi.getContentPane().add(lblPassword);
		
		textField_Password = new JTextField();
		textField_Password.setBounds(168, 122, 130, 26);
		frmShawqi.getContentPane().add(textField_Password);
		textField_Password.setColumns(10);
	}
}
