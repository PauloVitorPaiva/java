package aula14ex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ArrayContr extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int vet[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayContr frame = new ArrayContr();
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
	public ArrayContr() {
		
		for (int c=0; c < vet.length; c++) {
			lista.addElement(Integer.toString(vet[c]));
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinnerV = new JSpinner();
		spinnerV.setBounds(21, 40, 55, 20);
		contentPane.add(spinnerV);
		
		JLabel lblVet = new JLabel("[0]");
		lblVet.setBounds(330, 43, 46, 14);
		contentPane.add(lblVet);
		
		JList lstArray = new JList<>(lista);
		lstArray.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecionado = lstArray.getSelectedIndex();
				lblVet.setText("[" + selecionado + "]");
			}
		});
		
		
		lstArray.setBounds(270, 68, 129, 182);
		contentPane.add(lstArray);
		
		JLabel lblNewLabel = new JLabel("vetor:");
		lblNewLabel.setBounds(288, 43, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnBadd = new JButton("Adicionar");
		btnBadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vet[selecionado] = Integer.parseInt(spinnerV.getValue().toString());
				lista.removeAllElements();
				for (int c=0; c < vet.length; c++) {
					lista.addElement(Integer.toString(vet[c]));
				}
			}
		});
		btnBadd.setBounds(64, 113, 89, 23);
		contentPane.add(btnBadd);
		
		JButton btnBrem = new JButton("Remover");
		btnBrem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vet[selecionado] = 0;
				lista.removeAllElements();
				for (int c=0; c < vet.length; c++) {
					lista.addElement(Integer.toString(vet[c]));
				}
			}
		});
		btnBrem.setBounds(64, 159, 89, 23);
		contentPane.add(btnBrem);
		
		JButton btnBord = new JButton("Ordenar");
		btnBord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vet);
				lista.removeAllElements();
				for (int c=0; c < vet.length; c++) {
					lista.addElement(Integer.toString(vet[c]));
				}
			}
		});
		btnBord.setBounds(64, 211, 89, 23);
		contentPane.add(btnBord);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(270, 68, 129, 182);
		contentPane.add(scrollPane);
	}
}
