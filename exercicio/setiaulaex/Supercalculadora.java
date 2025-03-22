package setiaulaex;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class Supercalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supercalculadora frame = new Supercalculadora();
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
	public Supercalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel painel = new JPanel();
				painel.setForeground(new Color(0, 0, 0));
				painel.setBounds(10, 191, 266, 149);
				contentPane.add(painel);
				painel.setLayout(null);
				painel.setVisible(false);
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Super Calculadora");
		lblNewLabel.setBounds(142, 11, 141, 41);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		txtNum.setBounds(195, 60, 60, 30); // Aumentando a largura
		contentPane.add(txtNum);
		
		JLabel lblDivi2 = new JLabel("New label");
		lblDivi2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDivi2.setBounds(171, 11, 68, 14);
		painel.add(lblDivi2);
		lblDivi2.setForeground(new Color(0, 0, 255));
		
		JLabel lblEleCub = new JLabel("New label");
		lblEleCub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEleCub.setBounds(171, 36, 68, 14);
		painel.add(lblEleCub);
		lblEleCub.setForeground(new Color(0, 0, 255));
		
		JLabel lblRaizQ = new JLabel("New label");
		lblRaizQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaizQ.setBounds(171, 62, 68, 14);
		painel.add(lblRaizQ);
		lblRaizQ.setForeground(new Color(0, 0, 255));
		
		JLabel lblRaizC = new JLabel("New label");
		lblRaizC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaizC.setBounds(171, 87, 68, 14);
		painel.add(lblRaizC);
		lblRaizC.setForeground(new Color(0, 0, 255));
		
		JLabel lblVabso = new JLabel("New label");
		lblVabso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVabso.setBounds(171, 112, 68, 14);
		painel.add(lblVabso);
		lblVabso.setForeground(new Color(0, 0, 255));
		
		JLabel lblRespDiv = new JLabel("Resto da divisão por 2");
		lblRespDiv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRespDiv.setBounds(10, 13, 136, 14);
		painel.add(lblRespDiv);
		
		JLabel lblRespCub = new JLabel("Elevado ao cubo");
		lblRespCub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRespCub.setBounds(10, 36, 102, 14);
		painel.add(lblRespCub);
		
		JLabel lblRespRai = new JLabel("Raiz quadrada");
		lblRespRai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRespRai.setBounds(10, 62, 86, 14);
		painel.add(lblRespRai);
		
		JLabel lblRespRc = new JLabel("Raiz cúbica");
		lblRespRc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRespRc.setBounds(10, 87, 68, 14);
		painel.add(lblRespRc);
		
		JLabel lblRespVb = new JLabel("Valor absoluto");
		lblRespVb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRespVb.setBounds(10, 112, 86, 14);
		painel.add(lblRespVb);
		painel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblDivi2, lblEleCub, lblRaizQ, lblRaizC, lblVabso, lblRespDiv, lblRespCub, lblRespRai, lblRespRc, lblRespVb}));
		
		JButton btnBotaoCal = new JButton("Calcular");
		btnBotaoCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painel.setVisible(true);
				float num = ((Number) txtNum.getValue()).floatValue();
				float val = num % 2;
				double valc = (double) Math.pow(num, 3);
				float valrq = (float) Math.sqrt(num);
				float valrc = (float) Math.cbrt(num);
				float valab = (float) Math.abs(num);
				lblDivi2.setText("" + val);
				lblEleCub.setText("" + valc);
				lblRaizQ.setText("" + valrq);
				lblRaizC.setText("" + valrc);
				lblVabso.setText("" + valab);
			}
		});
		btnBotaoCal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBotaoCal.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\setiaulaex\\math-7319427_1280.png"));
		btnBotaoCal.setBounds(77, 121, 169, 59);
		contentPane.add(btnBotaoCal);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\setiaulaex\\—Pngtree—calculator vector illustration_8701820.png"));
		lblNewLabel_1.setBounds(286, 65, 169, 235);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Informe um número:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(45, 68, 140, 14);
		contentPane.add(lblNewLabel_2);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{painel, lblDivi2, lblEleCub, lblRaizQ, lblRaizC, lblVabso, lblRespDiv, lblRespCub, lblRespRai, lblRespRc, lblRespVb, lblNewLabel, txtNum, btnBotaoCal, lblNewLabel_1, lblNewLabel_2}));
		contentPane.revalidate();
		contentPane.repaint();
	}
}
