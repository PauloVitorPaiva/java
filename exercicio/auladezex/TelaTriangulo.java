package auladezex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaTriangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 317);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\auladezex\\imagens\\triangulo.png"));
		lblNewLabel_2.setBounds(288, 46, 136, 141);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSegA = new JLabel("Segmento A");
		lblSegA.setBounds(10, 32, 79, 14);
		contentPane.add(lblSegA);
		
		JLabel lblSegB = new JLabel("Segmento B");
		lblSegB.setBounds(10, 67, 79, 14);
		contentPane.add(lblSegB);
		
		JLabel lblNewLabel_5 = new JLabel("Segmento C");
		lblNewLabel_5.setBounds(10, 108, 65, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblA = new JLabel("0");
		lblA.setForeground(new Color(192, 192, 192));
		lblA.setBounds(216, 32, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setForeground(new Color(192, 192, 192));
		lblB.setBounds(216, 67, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setForeground(new Color(192, 192, 192));
		lblC.setBounds(216, 108, 46, 14);
		contentPane.add(lblC);
		
		JSlider sliderA = new JSlider();
		sliderA.setValue(10);
		sliderA.setMaximum(20);
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setBounds(85, 32, 121, 19);
		contentPane.add(sliderA);
		
		JSlider sliderB = new JSlider();
		sliderB.setValue(10);
		sliderB.setMaximum(20);
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliderB.getValue()));
			}
		});
		sliderB.setBounds(85, 67, 121, 26);
		contentPane.add(sliderB);
		
		JSlider sliderC = new JSlider();
		sliderC.setValue(10);
		sliderC.setMaximum(20);
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setBounds(85, 108, 121, 26);
		contentPane.add(sliderC);
		

		
		JPanel panResp = new JPanel();
		panResp.setBounds(27, 198, 360, 69);
		contentPane.add(panResp);
		panResp.setLayout(null);
		panResp.setVisible(false);
		
		JLabel lblForma = new JLabel("");
		lblForma.setForeground(new Color(0, 64, 128));
		lblForma.setHorizontalAlignment(SwingConstants.CENTER);
		lblForma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblForma.setBounds(28, 5, 304, 28);
		panResp.add(lblForma);
		
		JLabel lblTipo = new JLabel("Tipo de triângulo");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setForeground(new Color(255, 128, 128));
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(28, 30, 304, 28);
		panResp.add(lblTipo);
		panResp.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblForma, lblTipo}));
		
		JButton btnBV = new JButton("Verificar");
		btnBV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				if (a<b+c && b<a+c && c<a+b) {
					lblForma.setText("Formam um triângulo");
					if (a==b && b==c)  {
						lblTipo.setText("Equilátero");
					} else if (a!=b && b!=c && a!=c) {
						lblTipo.setText("Escaleno");
					} else {
						lblTipo.setText("isósceles");
					}
				} else {
					lblForma.setText("Não formam um triângulo");
					lblTipo.setText("---------");
				}
				panResp.setVisible(true);
			}
		});
		btnBV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBV.setBounds(95, 155, 121, 23);
		contentPane.add(btnBV);
		

	}
}
