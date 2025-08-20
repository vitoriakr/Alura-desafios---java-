package Java_Conversor.fonte.RegistroVoto;
import java.awt.*;
import java.io.BufferedWriter;

import javax.swing.*;

public class SistemaVotacao extends JFrame {
    //Criande Freme principal do sistema de votação
    private JComboBox<String> comboCandidatos;// ComboBox para selecionar candidatos
    private JLabel labelResultado;// Label para exibir o resultado
    private int[] votos = new int[4]; // Array para armazenar votos dos candidatos

    public SistemaVotacao() {
        // Configurações do JFrame
        setTitle("Sistema de Votação");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o comportamento de fechamento do JFrame
        setLocationRelativeTo(null);// Centraliza a janela
        setLayout(new BorderLayout(10, 10));// Define o layout do JFrame
        getContentPane().setBackground(Color.ORANGE);// Define a cor de fundo do JFrame

        // Cria os componentes da interface
        labelResultado = new JLabel("Votos: A = 0, B = 0, C = 0, D = 0");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));// Define a fonte do label
        String[] candidato = {"Candidato A", "Candidato B", "Candidato C", "Candidato D"};
        comboCandidatos = new JComboBox<>(candidato);// Cria a ComboBox com os candidatos

        JPanel painelCanditados = new JPanel(new FlowLayout());// Cria um painel para os candidatos
        painelCanditados.setBackground(Color.lightGray);// Define a cor de fundo do painel
        JPanel painelBotoes = new JPanel(new FlowLayout());// Cria um painel para os botões

        // Cria os botões de ação
        JButton btnVotar = new JButton("Votar");// Cria o botão de votar
        JButton btnLimpar = new JButton("Limpar");// Cria o botão de limpar
        JButton btnResultado = new JButton("Relatório");// Cria o botão de resultado

        //Ações sobre os botões
        btnVotar.addActionListener(e -> votar());// Ação do botão de votar
        btnResultado.addActionListener(e -> exibirResultado());// Ação do botão de resultado
        btnLimpar.addActionListener(e -> encerrarVotacao());// Ação do botão de limpar, que encerra o programa


        //Painéis
        painelCanditados.add(comboCandidatos);// Adiciona o botão de limpar ao painel
        painelBotoes.add(btnVotar);// Adiciona o botão de votar ao painel
        painelBotoes.add(btnLimpar);// Adiciona o botão de limpar ao painel
        painelBotoes.add(btnResultado);// Adiciona o botão de resultado ao painel
        painelCanditados.add(comboCandidatos);
        painelCanditados.add(btnVotar);

        // Adiciona os ActionListeners aos botões
        add(labelResultado, BorderLayout.NORTH);
        add(painelCanditados, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void votar() {
        int candidato = comboCandidatos.getSelectedIndex();// Obtém o item selecionado na ComboBox
        if (candidato == -1) {
            JOptionPane.showMessageDialog(null,
            "Selecione um candidato válido.",
            "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(null,
        "confirmar voto no candidato: " + comboCandidatos.getItemAt(candidato)+" ?",
        "Confirmação", JOptionPane.YES_NO_OPTION);// Exibe uma mensagem de confirmação

        if (confirmar == JOptionPane.YES_OPTION) {
            switch (candidato) {
            case 0:
                votos[0]++;// Incrementa o voto do candidato 1
                break;
            case 1:
                votos[1]++;// Incrementa o voto do candidato 2
                break;
            case 2:
                votos[2]++;// Incrementa o voto do candidato 3
                break;
            case 3:
                votos[3]++;// Incrementa o voto do candidato 4
                break;
            }
            labelResultado.setText("Votos: A = " + votos[0] + ", B = " + votos[1] + ", C = " + votos[2] + ", D = " + votos[3]);
            JOptionPane.showMessageDialog(null,
            "Voto computado com sucesso!",
            "Sucesso", JOptionPane.INFORMATION_MESSAGE);// Exibe uma mensagem de sucesso
        }
        
    }
    private void exibirResultado() {
        String resultado = "Resultados:\n" +
                "Candidato A: " + votos[0] + "\n" +
                "Candidato B: " + votos[1] + "\n" +
                "Candidato C: " + votos[2] + "\n" +
                "Candidato D: " + votos[3];
        JOptionPane.showMessageDialog(this, resultado, "Relatório de Votos",
        JOptionPane.INFORMATION_MESSAGE);
    }

    private void encerrarVotacao() {
        try (BufferedWriter gravar = new BufferedWriter(new java.io.FileWriter("resultado.txt"))) {
            gravar.write("Resultados Finais:\n Candidato A: " + votos[0] + "\n" +
                    "Candidato B: " + votos[1] + "\n" +
                    "Candidato C: " + votos[2] + "\n" +
                    "Candidato D: " + votos[3]);

                    labelResultado.setText("A = 0, B = 0, C = 0, D = 0");
                    JOptionPane.showMessageDialog(null,
                    "Encerramento da Votação. Votos salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os resultados: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0); // Encerra o programa
        }
    }

    public static void main(String[] args) {
        new SistemaVotacao();
    }
}
