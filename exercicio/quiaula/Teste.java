package quiaula;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblMensagem; 


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teste frame = new Teste();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Teste() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 240, 240));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Criar o JLabel antes do botão para que ele possa ser atualizado
        lblMensagem = new JLabel("O texto vai aparecer aqui");
        lblMensagem.setBounds(103, 34, 212, 56);
        lblMensagem.setForeground(new Color(255, 0, 0));
        lblMensagem.setFont(new Font("Arial", Font.PLAIN, 18));
        lblMensagem.setBackground(new Color(255, 255, 255));
        contentPane.add(lblMensagem);

        // Criar o botão
        JButton btnClick = new JButton("Clique em mim!");
        btnClick.setFont(new Font("Arial", Font.PLAIN, 14));
        btnClick.setBounds(133, 144, 138, 33);
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, Mundo!"); // Altera o texto do JLabel ao clicar
            }
        });
        contentPane.add(btnClick);
    }
}

