package aulanovex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParImpar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParImpar frame = new ParImpar();
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
	public ParImpar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(104, 39, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblResul = new JLabel("Resultado");
		lblResul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResul.setHorizontalAlignment(SwingConstants.CENTER);
		lblResul.setBounds(65, 171, 86, 14);
		contentPane.add(lblResul);
		
		JButton btnBotVe = new JButton("verificar");
		btnBotVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v = Integer.parseInt(txtValor.getText());
				if (v%2==0) {
					lblResul.setText("PAR");
				}
				else {
					lblResul.setText("ÍMPAR");
				}
			}
		});
		btnBotVe.setBounds(52, 93, 89, 34);
		contentPane.add(btnBotVe);
		

	}
}
