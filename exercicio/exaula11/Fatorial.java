package exaula11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class Fatorial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial frame = new Fatorial();
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
	public Fatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFatorial = new JLabel("");
		lblFatorial.setForeground(new Color(255, 0, 0));
		lblFatorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFatorial.setHorizontalAlignment(SwingConstants.LEFT);
		lblFatorial.setBounds(147, 115, 177, 24);
		contentPane.add(lblFatorial);
		
		JSpinner txtval = new JSpinner();
		txtval.setModel(new SpinnerNumberModel(1, 1, 15, 1));
		txtval.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int val = Integer.parseInt(txtval.getValue().toString());
				int cc = val;
				int num = 1;
				while (cc>=1) {
					num *= cc;
					cc--;
				}
				lblFatorial.setText("" + num);
			}
		});
		txtval.setForeground(new Color(255, 255, 255));
		txtval.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtval.setBounds(30, 100, 58, 39);
		contentPane.add(txtval);
		

		
		JLabel lblNewLabel_1 = new JLabel("!    =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(89, 109, 69, 30);
		contentPane.add(lblNewLabel_1);
	}
}
