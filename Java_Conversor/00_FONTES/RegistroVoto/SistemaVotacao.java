
import java.awt.*;

import javax.swing.*;

public class SistemaVotacao extends JFrame {
    //Criande Freme principal do sistema de votação
    private JComboBox<String> comboCandidatos;// ComboBox para selecionar candidatos
    private JLabel labelResultado;// Label para exibir o resultado
    private int[] votos = new int[4]; // Array para armazenar votos dos candidatos

    public SistemaVotacao() {
        setTitle("Sistema de Votação");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o comportamento de fechamento do JFrame
        setLocationRelativeTo(null);// Centraliza a janela
        setLayout(new BorderLayout(10, 10));// Define o layout do JFrame
        getContentPane().setBackground(Color.blue);// Define a cor de fundo do JFrame

        // Cria os componentes da interface
        labelResultado = new JLabel("Votos: A = 0, B = 0, C = 0, D = 0");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));// Define a fonte do label
        String[] candidato = {"Candidato 1", "Candidato 2", "Candidato 3", "Candidato 4"};
        comboCandidatos = new JComboBox<>(candidato);// Cria a ComboBox com os candidatos

        // Adiciona os componentes ao JFrame
        add(labelResultado, BorderLayout.NORTH);
        add(comboCandidatos, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        new SistemaVotacao();
    }
}
