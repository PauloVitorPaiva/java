package exaula11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador frame = new Contador();
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
	public Contador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(59, 62, 74, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblCont = new JLabel("");
		lblCont.setHorizontalAlignment(SwingConstants.CENTER);
		lblCont.setBounds(143, 62, 126, 24);
		contentPane.add(lblCont);
		
		JButton btnBCalc = new JButton("New button");
		btnBCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 0;
				String contagem = "";
				while (cc<10) {
					cc++;
					if (cc == 2 || cc == 4 || cc == 6) {
						continue;
					}
					/*if (cc == 10) {
						break;
					}*/
					contagem += cc + " ";
					lblCont.setText(contagem);	
				}
			}
		});
		btnBCalc.setBounds(109, 168, 89, 23);
		contentPane.add(btnBCalc);
	}
}
