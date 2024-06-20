package com.academiaGenerica.academia.View.User.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JPanel {

    private JTextField txtNomeCliente;
    private JTextField txtCpfCliente;
    private JTextField txtEnderecoCliente;
    private JTextField txtTelefoneCliente;
    private JTextField txtEmailCliente;

    public CadastroCliente() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(0x2E2E2E));

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.WHITE),
                "Cadastro de Cliente",
                0,
                0,
                new Font("Arial", Font.BOLD, 18),
                Color.WHITE));
        formPanel.setBackground(new Color(0x2E2E2E));

        JLabel labelNomeCliente = new JLabel("Nome:");
        labelNomeCliente.setForeground(Color.WHITE);
        txtNomeCliente = new JTextField();

        JLabel labelCpfCliente = new JLabel("CPF:");
        labelCpfCliente.setForeground(Color.WHITE);
        txtCpfCliente = new JTextField();

        JLabel labelEnderecoCliente = new JLabel("Endereço:");
        labelEnderecoCliente.setForeground(Color.WHITE);
        txtEnderecoCliente = new JTextField();

        JLabel labelTelefoneCliente = new JLabel("Telefone:");
        labelTelefoneCliente.setForeground(Color.WHITE);
        txtTelefoneCliente = new JTextField();

        JLabel labelEmailCliente = new JLabel("Email:");
        labelEmailCliente.setForeground(Color.WHITE);
        txtEmailCliente = new JTextField();

        formPanel.add(labelNomeCliente);
        formPanel.add(txtNomeCliente);
        formPanel.add(labelCpfCliente);
        formPanel.add(txtCpfCliente);
        formPanel.add(labelEnderecoCliente);
        formPanel.add(txtEnderecoCliente);
        formPanel.add(labelTelefoneCliente);
        formPanel.add(txtTelefoneCliente);
        formPanel.add(labelEmailCliente);
        formPanel.add(txtEmailCliente);

        JButton btnCadastrarCliente = new JButton("Cadastrar");
        btnCadastrarCliente.setBackground(new Color(0x4CAF50));
        btnCadastrarCliente.setForeground(Color.WHITE);
        btnCadastrarCliente.setFont(new Font("Arial", Font.BOLD, 16));
        btnCadastrarCliente.setFocusPainted(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0x2E2E2E));
        buttonPanel.add(btnCadastrarCliente);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeCliente = txtNomeCliente.getText();
                String cpfCliente = txtCpfCliente.getText();
                String enderecoCliente = txtEnderecoCliente.getText();
                String telefoneCliente = txtTelefoneCliente.getText();
                String emailCliente = txtEmailCliente.getText();

                JOptionPane.showMessageDialog(CadastroCliente.this,
                        "Cliente cadastrado:\n" +
                                "Nome: " + nomeCliente + "\n" +
                                "CPF: " + cpfCliente + "\n" +
                                "Endereço: " + enderecoCliente + "\n" +
                                "Telefone: " + telefoneCliente + "\n" +
                                "Email: " + emailCliente);
            }
        });
    }

    public JPanel getPanel() {
        return this;
    }

    // Exemplo de método para limpar os campos do formulário
    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtEnderecoCliente.setText("");
        txtTelefoneCliente.setText("");
        txtEmailCliente.setText("");
    }

    // Exemplo de método para preencher os campos do formulário com dados iniciais
    public void preencherCampos(String nome, String cpf, String endereco, String telefone, String email) {
        txtNomeCliente.setText(nome);
        txtCpfCliente.setText(cpf);
        txtEnderecoCliente.setText(endereco);
        txtTelefoneCliente.setText(telefone);
        txtEmailCliente.setText(email);
    }
}
