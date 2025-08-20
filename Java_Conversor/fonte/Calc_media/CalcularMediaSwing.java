package Java_Conversor.fonte.Calc_media; // Adjust the package name as needed
import java.awt.Color;

import javax.swing.*;

public class CalcularMediaSwing extends JFrame {
    private JTextField txtNome, txtNota1, txtNota2, txtNota3;
    private JTextArea txtResultado;
    public CalcularMediaSwing() {
        setTitle("Calculadora de Média");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.MAGENTA);
        // Criação dos componentes
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 25);
        
        txtNome = new JTextField();
        setBounds(100, 20, 165, 25);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(20, 50, 80, 25);

        txtNota1 = new JTextField();
        txtNota1.setBounds(100, 50, 150, 50);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(20, 80, 80, 25);

        txtNota2 = new JTextField();
        txtNota2.setBounds(100, 80, 150, 50);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(20, 110, 80, 25);

        txtNota3 = new JTextField();
        txtNota3.setBounds(100, 110, 150, 50);

        add(lblNome);
        add(txtNome);
        add(txtNota1);
        add(txtNota2);
        add(txtNota3);
        add(lblNota1);
        add(lblNota2);
        add(lblNota3);
        add(txtResultado);
    }

}
