package quaulaex;

import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucao {
    public static void main(String[] args) {
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.printf("A resolução da sua tela é %d X %d\n", d.width, d.height);
    }
}
