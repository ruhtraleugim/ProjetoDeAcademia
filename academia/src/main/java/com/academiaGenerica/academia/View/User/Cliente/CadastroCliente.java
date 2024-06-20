package com.academiaGenerica.academia.View.User.Cliente;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame {

    private JTextField txtNomeCliente;
    private JTextField txtCpfCliente;
    private JTextField txtEnderecoCliente;
    private JTextField txtTelefoneCliente;
    private JTextField txtEmailCliente;

    public CadastroCliente() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelNomeCliente = new JLabel("Nome:");
        txtNomeCliente = new JTextField();

        JLabel labelCpfCliente = new JLabel("CPF:");
        txtCpfCliente = new JTextField();

        JLabel labelEnderecoCliente = new JLabel("Endereço:");
        txtEnderecoCliente = new JTextField();

        JLabel labelTelefoneCliente = new JLabel("Telefone:");
        txtTelefoneCliente = new JTextField();

        JLabel labelEmailCliente = new JLabel("Email:");
        txtEmailCliente = new JTextField();

        mainPanel.add(labelNomeCliente);
        mainPanel.add(txtNomeCliente);
        mainPanel.add(labelCpfCliente);
        mainPanel.add(txtCpfCliente);
        mainPanel.add(labelEnderecoCliente);
        mainPanel.add(txtEnderecoCliente);
        mainPanel.add(labelTelefoneCliente);
        mainPanel.add(txtTelefoneCliente);
        mainPanel.add(labelEmailCliente);
        mainPanel.add(txtEmailCliente);

        JButton btnCadastrarCliente = new JButton("Cadastrar");
        btnCadastrarCliente.addActionListener(e -> cadastrarCliente());

        mainPanel.add(new JLabel());  // Espaço vazio
        mainPanel.add(btnCadastrarCliente);

        add(mainPanel);
    }

    private void cadastrarCliente() {
        String nomeCliente = txtNomeCliente.getText();
        String cpfCliente = txtCpfCliente.getText();
        String enderecoCliente = txtEnderecoCliente.getText();
        String telefoneCliente = txtTelefoneCliente.getText();
        String emailCliente = txtEmailCliente.getText();

        JOptionPane.showMessageDialog(this,
                "Cliente cadastrado:\n" +
                        "Nome: " + nomeCliente + "\n" +
                        "CPF: " + cpfCliente + "\n" +
                        "Endereço: " + enderecoCliente + "\n" +
                        "Telefone: " + telefoneCliente + "\n" +
                        "Email: " + emailCliente);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroCliente().setVisible(true));
    }
}
