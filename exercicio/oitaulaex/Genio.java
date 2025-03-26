package oitaulaex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Genio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Genio frame = new Genio();
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
	public Genio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtVal = new JSpinner();
		txtVal.setBounds(293, 178, 46, 20);
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		contentPane.add(txtVal);
		
		JLabel lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setBounds(210, 179, 54, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(37, 87, 163, 163);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\oitaulaex\\imagens\\Genio.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(195, 11, 190, 154);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\oitaulaex\\imagens\\bubble-157905_1280.png"));
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(false);
		
		JLabel lblFrase = new JLabel("<html>Estou pensando\r\n<br> em um \r\n<br>número entre\r\n<br> 1 e 5,\r\n<br>adivinhe qual é.</html>");
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFrase.setBounds(237, 23, 120, 114);
		lblNewLabel.setLabelFor(lblFrase);
		contentPane.add(lblFrase);
		
		JButton btnTentativa = new JButton("Adivinhar");
		btnTentativa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valr = (double) 1 + Math.random() * (6-1);
				int valor = (int) valr;
				
				int num = Integer.parseInt(txtVal.getValue().toString());
				
				String f1 = "Acertou";
				String f2 = "<html>Errou! Eu pensei <br>no valor " + valor + "</html>";
				
				String res = (valor == num)?f1:f2;
				
				lblFrase.setText(res);
			}
		});
		btnTentativa.setBounds(268, 209, 89, 23);
		contentPane.add(btnTentativa);
		

	}
}
