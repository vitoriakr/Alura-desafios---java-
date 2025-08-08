import javax.swing.*;

import java.awt.*;


public class ConversorMultifuncional extends JFrame {
    private JTextField campoValor;
    private JLabel labelResultado;

    public ConversorMultifuncional() {
        //Definição do JFrame
        setSize(350,280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Conversor Multifuncional");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));
        getContentPane().setBackground(Color.LIGHT_GRAY);


        //Componentes Interface
        labelResultado = new JLabel("Resultado:");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
        campoValor = new JTextField(15);
        campoValor.setFont(new Font("Arial", Font.PLAIN, 14));
        JPanel painelBotoes = new JPanel(new FlowLayout());

        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));

        //Definição dos Botões
        JButton btnCtof = new JButton("Celsius para Fahrenheit");
        JButton btnFtoc = new JButton("Fahrenheit para Celsius");
        JButton btnMtoft = new JButton("Real para Dólar");
        JButton btnFttoM = new JButton("Dólar para Real");
        JButton btnMtoF = new JButton("Limpar");

        btnCtof.addActionListener((actionEvent) -> converter("Ctof"));
        btnFtoc.addActionListener((actionEvent) -> converter("Ftoc"));
        btnMtoft.addActionListener((actionEvent) -> converter("Mtoft"));
        btnFttoM.addActionListener((actionEvent) -> converter("FttoM"));
        btnMtoF.addActionListener((actionEvent) -> LimparCampos());

        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnCtof);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnFtoc);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnMtoft);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnFttoM);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnMtoF);

        add(painelBotoes, BorderLayout.SOUTH);
        add(labelResultado, BorderLayout.NORTH);
        add(campoValor, BorderLayout.CENTER);

        setVisible(true);
    }
    private void LimparCampos() {
        campoValor.setText("");
        labelResultado.setText("Resultado:");
    }
    private void converter(String tipo){
        
        try{
            double valor = Double.parseDouble(campoValor.getText());
            double resultado;
            String mensagem = " ";

            switch (tipo) {
        
            case "Ctof":
                resultado = (valor * 9/5) + 32;
                mensagem = String.format("Resultado: %.1f Celsius = %.1f Fahrenheit", valor, resultado);
                break;
            case "Ftoc":
                resultado = (valor - 32) * 5/9;
                mensagem = String.format("Resultado: %.1f Fahrenheit = %.1f Celsius", valor, resultado);
                break;
            case "Mtoft":
                resultado = valor / 5.463;
                mensagem = String.format("Resultado: %.1f Real = %.1f Dólar", valor, resultado);
                break;
            case "FttoM":
                resultado = valor * 5.463;
                mensagem = String.format("Resultado: %.1f Dólar = %.1f Real", valor, resultado);
                break;
            default:
                throw new IllegalArgumentException("Tipo de conversão inválido: " + tipo);
        }
        labelResultado.setText("Resultado: " + mensagem);
    } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de conversão: " +
            e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new ConversorMultifuncional();

    }
}