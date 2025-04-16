package aula15ex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Fatorial2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial2 frame = new Fatorial2();
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
	public Fatorial2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForm = new JLabel("Fórmula");
		lblForm.setForeground(new Color(0, 0, 255));
		lblForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblForm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblForm.setBounds(10, 83, 266, 14);
		contentPane.add(lblForm);
		
		JLabel lblRes = new JLabel("Resultado");
		lblRes.setForeground(new Color(255, 0, 0));
		lblRes.setHorizontalAlignment(SwingConstants.LEFT);
		lblRes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRes.setBounds(275, 83, 94, 14);
		contentPane.add(lblRes);
		
		JSpinner txtnum = new JSpinner();
		txtnum.setBounds(25, 49, 58, 23);
		contentPane.add(txtnum);
		
		JButton btnBC = new JButton("!");
		btnBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n =  Integer.parseInt(txtnum.getValue().toString());
				Funcao01 f = new Funcao01();
				f.setValor(n);
				lblForm.setText(f.getFormula());
				lblRes.setText(Integer.toString(f.getFatorial()));
			}
		});
		btnBC.setBounds(88, 49, 46, 23);
		contentPane.add(btnBC);
	}
}
