package quiaulaex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ResolucaoTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResolucaoTela frame = new ResolucaoTela();
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
	public ResolucaoTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolução da tela:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(175, 40, 140, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblResolucaoT = new JLabel("Aperte o botão");
		lblResolucaoT.setForeground(new Color(192, 192, 192));
		lblResolucaoT.setHorizontalAlignment(SwingConstants.CENTER);
		lblResolucaoT.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblResolucaoT.setBounds(175, 107, 249, 51);
		contentPane.add(lblResolucaoT);
		
		JButton btnBotaoM = new JButton("Mostrar resolução");
		btnBotaoM.setForeground(new Color(0, 0, 0));
		btnBotaoM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Toolkit tk;
		        tk = Toolkit.getDefaultToolkit();
		        Dimension d = tk.getScreenSize();
		        lblResolucaoT.setText("Resolução:" + d.width + " x " + d.height);
			}
		});
		btnBotaoM.setBounds(189, 191, 152, 33);
		contentPane.add(btnBotaoM);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\exer\\bin\\quiaulaex\\computer-clipart-cartoon-style-computer-with-the-monitor-on-top_570705_wh860.png"));
		lblNewLabel_2.setBounds(10, 50, 155, 128);
		contentPane.add(lblNewLabel_2);
	}
}
