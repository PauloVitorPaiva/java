package quiaula;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Horas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblHoras; // Agora é uma variável da classe

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Horas frame = new Horas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Horas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnBotaoH = new JButton("Clique aqui");
        btnBotaoH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblHoras.setText(relogio.toString()); // Agora a variável pode ser acessada corretamente
            }
        });
        btnBotaoH.setBounds(190, 179, 99, 31);
        contentPane.add(btnBotaoH);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Horas.class.getResource("/quiaula/icone-calendario.jpg"))); // Certifique-se de que o caminho da imagem está correto
        lblNewLabel.setBounds(10, 67, 130, 143);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Data e Horas atuais");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(190, 28, 120, 31);
        contentPane.add(lblNewLabel_1);

        lblHoras = new JLabel("Clique no botão"); // Apenas inicialização
        lblHoras.setForeground(new Color(192, 192, 192));
        lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
        lblHoras.setBounds(190, 88, 200, 38);
        contentPane.add(lblHoras);
    }
}
