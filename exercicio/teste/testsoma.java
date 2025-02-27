package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testsoma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testsoma frame = new testsoma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testsoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(38, 101, 60, 42);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setBounds(158, 101, 60, 42);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
				JLabel lblResultado = new JLabel("");
		lblResultado.setBackground(new Color(0, 0, 0));
		lblResultado.setBounds(346, 115, 46, 14);
		contentPane.add(lblResultado);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 =  Integer.parseInt(txtN1. getText()); 
				int n2 = Integer.parseInt(txtN2 .getText());
				int s = n1 + n2;
				lblResultado.setText(Integer.toString(s));
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnSoma.setBounds(246, 102, 60, 29);
		contentPane.add(btnSoma);
		

		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(108, 109, 46, 23);
		contentPane.add(lblNewLabel_1);
	}
}
