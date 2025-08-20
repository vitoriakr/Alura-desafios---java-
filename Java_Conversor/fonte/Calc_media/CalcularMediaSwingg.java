package Java_Conversor.fonte.Calc_media;

import javax.swing.*;

public class CalcularMediaSwingg extends JFrame {

    private JTextField txtnome, txtnota1, txtnota2, txtnota3;
    private JTextArea txtresultado;

    public CalcularMediaSwingg(){
        // Configuração da janela
        setTitle("Calcular Média");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(null);

        // Criação dos componentes
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 80, 25);
        txtnome = new JTextField();
        txtnome.setBounds(100, 10, 160, 25);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(10, 40, 80, 25);
        txtnota1 = new JTextField();
        txtnota1.setBounds(100, 40, 160, 25);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(10, 70, 80, 25);
        txtnota2 = new JTextField();
        txtnota2.setBounds(100, 70, 160, 25);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(10, 100, 80, 25);
        txtnota3 = new JTextField();
        txtnota3.setBounds(100, 100, 160, 25);

        JButton btnCalcular = new JButton("Calcular Média");
        btnCalcular.setBounds(10, 130, 250, 25);

        add(lblNome);
        add(txtnome);
        add(lblNota1);
        add(txtnota1);
        add(lblNota2);
        add(txtnota2);
        add(lblNota3);
        add(txtnota3);
        add(btnCalcular);
        txtresultado = new JTextArea();
        txtresultado.setBounds(10, 160, 250, 50);
        txtresultado.setEditable(false);
        add(txtresultado);
    }
}
