package sextaulaex;

import java.awt.Color;
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
import java.time.LocalDate;

public class Telaidade extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblidade; 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Telaidade frame = new Telaidade();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Telaidade() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Ano de nascimento");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(26, 53, 136, 45);
        contentPane.add(lblNewLabel);

        JSpinner txtAN = new JSpinner();
        txtAN.setModel(new SpinnerNumberModel(1900, 1900, 2025, 1));
        txtAN.setBounds(178, 67, 70, 20);
        contentPane.add(txtAN);

        lblidade = new JLabel("0"); 
        lblidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblidade.setForeground(new Color(255, 0, 0));
        lblidade.setBounds(112, 181, 46, 35);
        contentPane.add(lblidade);

        JLabel lblNewLabel_1 = new JLabel("Idade");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(39, 181, 63, 35);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\sextaulaex\\johnnybravo.png"));
        lblNewLabel_3.setBounds(258, 41, 166, 175);
        contentPane.add(lblNewLabel_3);

        JButton btnCalc = new JButton("Calcular");
        btnCalc.setForeground(new Color(0, 0, 0));
        btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int an = Integer.parseInt(txtAN.getValue().toString());
                int ano = LocalDate.now().getYear(); 
                int id = ano - an;
                lblidade.setText(Integer.toString(id));
            }
        });
        btnCalc.setIcon(new ImageIcon("C:\\Users\\paulo\\Documents\\programação\\java\\exercicio\\sextaulaex\\calculadora.png")); 
        btnCalc.setBounds(71, 109, 147, 57);
        contentPane.add(btnCalc);
    }
}