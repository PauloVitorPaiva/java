package auladezex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaIdadeV2 extends JFrame {

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
					TelaIdadeV2 frame = new TelaIdadeV2();
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
	public TelaIdadeV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 57, 117, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(153, 55, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblR = new JLabel("resultado:");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblR.setBounds(58, 171, 131, 14);
		contentPane.add(lblR);
		
		JLabel lblIdade = new JLabel("Sua idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdade.setBounds(58, 209, 86, 14);
		contentPane.add(lblIdade);
		
		JButton btnBI = new JButton("Testar");
		btnBI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtAno.getText());
				int i = 2025 - a;
				lblIdade.setText("Sua idade:" + i);
				if (i < 16) {
					lblR.setText("Não vota");
				} else if ((i >= 16 && i < 18) || (i > 70)) {
					lblR.setText("Voto Opcional");
				} else {
					lblR.setText("Voto Obrigatório");
				}
			}
		});
		btnBI.setBounds(70, 119, 105, 23);
		contentPane.add(btnBI);
		
		
		

	}
}
