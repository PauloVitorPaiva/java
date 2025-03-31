package aulanovex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delta frame = new Delta();
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

	public Delta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(75, 92, 174, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Δ=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 34, 14);
		panel.add(lblNewLabel);

		
		JLabel lblNewLabel_6 = new JLabel(".");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(112, 11, 8, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("² - 4.");
		lblNewLabel_2.setBounds(54, 11, 32, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setForeground(new Color(255, 0, 0));
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setBounds(31, 11, 26, 14);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(255, 0, 0));
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setBounds(129, 11, 35, 14);
		panel.add(lblC);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(93, 11, 26, 14);
		panel.add(lblA);
		
		JSpinner txts1 = new JSpinner();
		txts1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txts1.getValue().toString());
			}
		});
		txts1.setBounds(74, 44, 30, 20);
		contentPane.add(txts1);
		
		JSpinner txts2 = new JSpinner();
		txts2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txts2.getValue().toString());
			}
		});
		txts2.setBounds(145, 44, 30, 20);
		contentPane.add(txts2);
		
		JSpinner txts3 = new JSpinner();
		txts3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txts3.getValue().toString());
			}
		});
		txts3.setBounds(199, 44, 30, 20);
		contentPane.add(txts3);

		
		JLabel lblResulD = new JLabel("Δ =");
		lblResulD.setBounds(30, 181, 89, 14);
		contentPane.add(lblResulD);
		lblResulD.setVisible(false);

		
		JLabel lblRaiz = new JLabel("Tipo =");
		lblRaiz.setBounds(30, 206, 219, 14);
		contentPane.add(lblRaiz);
		lblRaiz.setVisible(false);
				

		JButton btnBotaoC = new JButton("Calcular");
		btnBotaoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float v1 =  ((Number) txts1.getValue()).floatValue();
				float v2 =  ((Number) txts2.getValue()).floatValue();
				float v3 =  ((Number) txts3.getValue()).floatValue();
				float res = ((Number) (Math.pow(v2, 2)- 4 *v1 *v3)).floatValue();
				
				lblResulD.setText("Δ =" + res);
				lblResulD.setVisible(true);
				
				lblRaiz.setVisible(true);
				if (0 > res) {
					lblRaiz.setText("Tipo = Não tem raízes reais");
				} else if (res == 0) {
					lblRaiz.setText("Tipo = possui apenas uma raíz real");
				} else {
					lblRaiz.setText("Tipo = possui mais de uma raíz real");
				}
			}
		});
		btnBotaoC.setBounds(199, 202, 89, 23);
		contentPane.add(btnBotaoC);
		
		JLabel lblNewLabel_3 = new JLabel("             x² +           x+          =0");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(62, 41, 213, 23);
		contentPane.add(lblNewLabel_3);
		

	}
}
