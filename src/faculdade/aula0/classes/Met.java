package faculdade.aula0.classes;
import javax.swing.JOptionPane;

public class Met {
//    public static void recebeDoisNumeros(int num1, int num2) {
//        int tot = num1 + num2;
//        JOptionPane.showMessageDialog(null, tot);
//        return;
//    }

    public static void verifica(int num) {
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "par");

        } else {
            JOptionPane.showMessageDialog(null, "impar");
        }
        return;
    }
}
