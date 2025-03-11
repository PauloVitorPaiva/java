package sextaulaex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Telaidade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telaidade frame = new Telaidade();
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
	public Telaidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 53, 136, 45);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1900, 1900, 2025, 1));
		txtAN.setBounds(178, 67, 70, 20);
		contentPane.add(txtAN);
		
		JLabel lblidade = new JLabel("0");
		lblidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblidade.setForeground(new Color(255, 0, 0));
		lblidade.setBounds(113, 164, 46, 35);
		contentPane.add(lblidade);
		
		Button btnCalc = new Button("calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2025 - an;
				lblidade.setText(Integer.toString(id));
			}
		});
		btnCalc.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCalc.setBounds(93, 104, 90, 35);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_1 = new JLabel("idade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(40, 164, 63, 35);
		contentPane.add(lblNewLabel_1);
		

		
		JLabel lblNewLabel_3 = new JLabel("imagem1");
		lblNewLabel_3.setBounds(307, 70, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
}
