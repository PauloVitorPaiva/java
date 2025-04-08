package exaula11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nums extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVal;
	private int tot = 0, totP, totI, totC, M, totVal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nums frame = new Nums();
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
	public Nums() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Informe um valor <br> (0 interrompe)</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 24, 185, 61);
		contentPane.add(lblNewLabel);
		
		txtVal = new JTextField();
		txtVal.setBackground(new Color(255, 255, 255));
		txtVal.setBounds(96, 117, 126, 20);
		contentPane.add(txtVal);
		txtVal.setColumns(10);
		
		JButton btnAdd = new JButton("OK");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val = Integer.parseInt(txtVal.getText().toString());
				tot++;
				if (val % 2 == 0) {
					totP++;
				} else {totI++;}
				if (val >= 100) {
					totC++;
				}
				totVal += val;
				M = totVal / tot;
			}
		});
		btnAdd.setBackground(new Color(128, 255, 255));
		btnAdd.setBounds(186, 208, 108, 23);
		contentPane.add(btnAdd);
		
		JLabel lblVals = new JLabel("");
		lblVals.setBounds(85, 72, 155, 136);
		contentPane.add(lblVals);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(false);
				txtVal.setVisible(false);
				btnAdd.setVisible(false);
				btnCancel.setVisible(false);
				lblVals.setText("<html> Resultado: <br> ------------- <br> Total de Valores:" + tot + "<br> Total de Pares:" + totP +
						"<br> Total de ímpares:" + totI + "<br> Acima de 100:" + totC + "<br> Média dos valores:" + M +  "</html>");
			}
		});
		btnCancel.setBounds(55, 208, 99, 23);
		contentPane.add(btnCancel);
		

	}
}
