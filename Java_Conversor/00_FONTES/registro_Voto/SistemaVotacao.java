package registro_Voto;
import javax.swing.*;

public class SistemaVotacao extends JFrame {
    private JComboBox<String> comboCandidatos;// ComboBox para selecionar candidatos
    private JLabel labelResultado;// Label para exibir o resultado
    private int[] votos = new int[4]; // Array para armazenar votos dos candidatos

    public SistemaVotacao() {
        setTitle("Sistema de Votação");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// Centraliza a janela
        setLayout(new BorderLayout(10, 10));// Define o layout do JFrame

        setVisible(true);
    }
    public static void main(String[] args) {
        new SistemaVotacao();
    }
}
