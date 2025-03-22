package oitaulaex;

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

public class TelaIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 53, 117, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 155, 47, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situação");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 206, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		txtAno = new JTextField();
		txtAno.setBounds(139, 53, 66, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(139, 157, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSituacao = new JLabel("");
		lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacao.setBounds(114, 206, 100, 14);
		contentPane.add(lblSituacao);
		
		JButton btnCalc = new JButton("Calcular idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2025 - ano;
				lblIdade.setText(Integer.toString(idade));
				String sit = ((idade>=16 && idade<18) || (idade>=70) )?"Voto Opcional":"Não é Opcional";
				lblSituacao.setText(sit);
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalc.setBounds(54, 101, 105, 23);
		contentPane.add(btnCalc);
		

	}
}
