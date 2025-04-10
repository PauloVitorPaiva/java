package exaula11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;

public class ContFor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContFor frame = new ContFor();
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
	public ContFor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Início");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 48, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 132, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBounds(210, 50, 31, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setBounds(210, 91, 20, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setBounds(210, 134, 20, 14);
		contentPane.add(lblNewLabel_5);
		
		JSlider sliderI = new JSlider();
		sliderI.setValue(0);
		sliderI.setMaximum(20);
		sliderI.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_3.setText(Integer.toString(sliderI.getValue()));
			}
		});
		sliderI.setBounds(51, 48, 149, 14);
		contentPane.add(sliderI);
		
		JSlider sliderF = new JSlider();
		sliderF.setValue(0);
		sliderF.setMaximum(20);
		sliderF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_4.setText(Integer.toString(sliderF.getValue()));
			}
		});
		sliderF.setBounds(51, 91, 149, 14);
		contentPane.add(sliderF);
		
		JSlider sliderP = new JSlider();
		sliderP.setValue(1);
		sliderP.setMinimum(1);
		sliderP.setMaximum(10);
		sliderP.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_5.setText(Integer.toString(sliderP.getValue()));
			}
		});
		sliderP.setBounds(51, 132, 149, 14);
		contentPane.add(sliderP);
		
		JList<Integer> listVal = new JList<>();
		JScrollPane scroll = new JScrollPane(listVal);
		scroll.setBounds(277, 32, 147, 173);
		contentPane.add(scroll);
		
		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = sliderI.getValue();
				int val2 = sliderF.getValue();
				int val3 = sliderP.getValue();
				
				DefaultListModel lista = new DefaultListModel();
				
				for (int cc = val1; cc <= val2; cc+=val3) {
					lista.addElement(cc);
				}
				listVal.setModel(lista);
			}
		});
		btnNewButton.setBounds(72, 157, 89, 23);
		contentPane.add(btnNewButton);
			
	}
}
