package com.academiaGenerica.academia.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends javax.swing.JFrame {

    private JButton jButton1;
    private JFormattedTextField jFormattedTextField1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;

    public CadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        jFormattedTextField1 = new JFormattedTextField();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jTextField5 = new JTextField();
        jButton1 = new JButton();
        jLabel18 = new JLabel();
        jTextField10 = new JTextField();
        jLabel19 = new JLabel();
        jTextField11 = new JTextField();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout()); // Usando FlowLayout

        // Configurações e adição de componentes
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar Clientes");
        add(jLabel2);

        jLabel6.setText("Nome");
        add(jLabel6);
        add(jTextField4);
        jTextField4.setColumns(20); // Definindo tamanho do JTextField

        jLabel5.setText("CPF");
        add(jLabel5);
        add(jTextField3);
        jTextField3.setColumns(20);

        jLabel11.setText("Cel");
        add(jLabel11);
        add(jTextField5);
        jTextField5.setColumns(20);

        jLabel4.setText("Email");
        add(jLabel4);
        add(jFormattedTextField1);
        jFormattedTextField1.setColumns(20);

        jLabel8.setText("Aulas");
        add(jLabel8);
        add(jTextField2);
        jTextField2.setColumns(20);

        jLabel19.setText("Peso");
        add(jLabel19);
        add(jTextField11);
        jTextField11.setColumns(20);

        jLabel18.setText("Altura");
        add(jLabel18);
        add(jTextField10);
        jTextField10.setColumns(20);

        jButton1.setText("Cadastrar usuário");
        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18));
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                cadastrarUsuario(evt);
            }
        });
        add(jButton1);

        // Imagem de fundo
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("halteres-no-chao-de-uma-academia-ai-generative.jpg")));
        add(jLabel1);

        pack();
    }

    private void cadastrarUsuario(ActionEvent evt) {
        // Aqui você pode implementar a lógica para cadastrar o usuário
        String nome = jTextField4.getText();
        String cpf = jTextField3.getText();
        String celular = jTextField5.getText();
        String email = jFormattedTextField1.getText();
        String aulas = jTextField2.getText();
        String peso = jTextField11.getText();
        String altura = jTextField10.getText();

        // Implemente a lógica de backend para salvar esses dados
        Backend backend = new Backend();
        String response = backend.processData(nome, cpf, celular, email, aulas, peso, altura);
        JOptionPane.showMessageDialog(this, response);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    class Backend {
        public String processData(String nome, String cpf, String celular, String email, String aulas, String peso, String altura) {
            // Lógica do backend para processar os dados
            return "Usuário cadastrado: " + nome + ", CPF: " + cpf + ", Cel: " + celular + ", Email: " + email +
                    ", Aulas: " + aulas + ", Peso: " + peso + ", Altura: " + altura;
        }
    }
}
