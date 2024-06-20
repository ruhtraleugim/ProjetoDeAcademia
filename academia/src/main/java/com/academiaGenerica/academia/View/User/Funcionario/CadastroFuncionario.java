package com.academiaGenerica.academia.View.User.Funcionario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastroFuncionario extends JPanel {

    public CadastroFuncionario() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(0x2E2E2E));

        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.WHITE),
                "Cadastro de Funcionário",
                0,
                0,
                new Font("Arial", Font.BOLD, 18),
                Color.WHITE));
        formPanel.setBackground(new Color(0x2E2E2E));

        JLabel labelNomeFuncionario = new JLabel("Nome:");
        labelNomeFuncionario.setForeground(Color.WHITE);
        JTextField txtNomeFuncionario = new JTextField();

        JLabel labelCargoFuncionario = new JLabel("Cargo:");
        labelCargoFuncionario.setForeground(Color.WHITE);
        JTextField txtCargoFuncionario = new JTextField();

        JLabel labelSalarioFuncionario = new JLabel("Salário:");
        labelSalarioFuncionario.setForeground(Color.WHITE);
        JTextField txtSalarioFuncionario = new JTextField();

        JLabel labelEnderecoFuncionario = new JLabel("Endereço:");
        labelEnderecoFuncionario.setForeground(Color.WHITE);
        JTextField txtEnderecoFuncionario = new JTextField();

        JLabel labelTelefoneFuncionario = new JLabel("Telefone:");
        labelTelefoneFuncionario.setForeground(Color.WHITE);
        JTextField txtTelefoneFuncionario = new JTextField();

        JLabel labelEmailFuncionario = new JLabel("Email:");
        labelEmailFuncionario.setForeground(Color.WHITE);
        JTextField txtEmailFuncionario = new JTextField();

        JLabel labelDataContratacaoFuncionario = new JLabel("Data de Contratação:");
        labelDataContratacaoFuncionario.setForeground(Color.WHITE);
        JTextField txtDataContratacaoFuncionario = new JTextField();

        formPanel.add(labelNomeFuncionario);
        formPanel.add(txtNomeFuncionario);
        formPanel.add(labelCargoFuncionario);
        formPanel.add(txtCargoFuncionario);
        formPanel.add(labelSalarioFuncionario);
        formPanel.add(txtSalarioFuncionario);
        formPanel.add(labelEnderecoFuncionario);
        formPanel.add(txtEnderecoFuncionario);
        formPanel.add(labelTelefoneFuncionario);
        formPanel.add(txtTelefoneFuncionario);
        formPanel.add(labelEmailFuncionario);
        formPanel.add(txtEmailFuncionario);
        formPanel.add(labelDataContratacaoFuncionario);
        formPanel.add(txtDataContratacaoFuncionario);

        JButton btnCadastrarFuncionario = new JButton("Cadastrar");
        btnCadastrarFuncionario.setBackground(new Color(0x4CAF50));
        btnCadastrarFuncionario.setForeground(Color.WHITE);
        btnCadastrarFuncionario.setFont(new Font("Arial", Font.BOLD, 16));
        btnCadastrarFuncionario.setFocusPainted(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0x2E2E2E));
        buttonPanel.add(btnCadastrarFuncionario);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeFuncionario = txtNomeFuncionario.getText();
                String cargoFuncionario = txtCargoFuncionario.getText();
                String salarioFuncionario = txtSalarioFuncionario.getText();
                String enderecoFuncionario = txtEnderecoFuncionario.getText();
                String telefoneFuncionario = txtTelefoneFuncionario.getText();
                String emailFuncionario = txtEmailFuncionario.getText();
                String dataContratacaoFuncionario = txtDataContratacaoFuncionario.getText();

                JOptionPane.showMessageDialog(CadastroFuncionario.this,
                        "Funcionário cadastrado:\n" +
                                "Nome: " + nomeFuncionario + "\n" +
                                "Cargo: " + cargoFuncionario + "\n" +
                                "Salário: " + salarioFuncionario + "\n" +
                                "Endereço: " + enderecoFuncionario + "\n" +
                                "Telefone: " + telefoneFuncionario + "\n" +
                                "Email: " + emailFuncionario + "\n" +
                                "Data de Contratação: " + dataContratacaoFuncionario);
            }
        });
    }

    public JPanel getPanel() {
        return this;
    }
}
