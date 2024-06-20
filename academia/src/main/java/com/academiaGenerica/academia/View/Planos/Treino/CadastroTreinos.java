package com.academiaGenerica.academia.View.Planos.Treino;

import javax.swing.*;
import java.awt.*;

public class CadastroTreinos extends JFrame {

    private JTextField txtNomeTreino;
    private JTextField txtDescricaoTreino;
    private JTextField txtDuracaoTreino;

    public CadastroTreinos() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Cadastro de Treinos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelNomeTreino = new JLabel("Nome do Treino:");
        txtNomeTreino = new JTextField();

        JLabel labelDescricaoTreino = new JLabel("Descrição:");
        txtDescricaoTreino = new JTextField();

        JLabel labelDuracaoTreino = new JLabel("Duração (minutos):");
        txtDuracaoTreino = new JTextField();

        mainPanel.add(labelNomeTreino);
        mainPanel.add(txtNomeTreino);
        mainPanel.add(labelDescricaoTreino);
        mainPanel.add(txtDescricaoTreino);
        mainPanel.add(labelDuracaoTreino);
        mainPanel.add(txtDuracaoTreino);

        JButton btnCadastrarTreino = new JButton("Cadastrar");
        btnCadastrarTreino.addActionListener(e -> cadastrarTreino());

        mainPanel.add(new JLabel());  // Espaço vazio
        mainPanel.add(btnCadastrarTreino);

        add(mainPanel);
    }

    private void cadastrarTreino() {
        String nomeTreino = txtNomeTreino.getText();
        String descricaoTreino = txtDescricaoTreino.getText();
        String duracaoTreino = txtDuracaoTreino.getText();

        JOptionPane.showMessageDialog(this,
                "Treino cadastrado:\n" +
                        "Nome: " + nomeTreino + "\n" +
                        "Descrição: " + descricaoTreino + "\n" +
                        "Duração: " + duracaoTreino + " minutos");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroTreinos().setVisible(true));
    }
}
