package com.academiaGenerica.academia.View.Planos.Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTreinos extends JPanel {

    private JTextField txtNomeTreino;
    private JTextField txtDescricaoTreino;
    private JTextField txtDuracaoTreino;

    public CadastroTreinos() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(4, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelNomeTreino = new JLabel("Nome do Treino:");
        txtNomeTreino = new JTextField();

        JLabel labelDescricaoTreino = new JLabel("Descrição:");
        txtDescricaoTreino = new JTextField();

        JLabel labelDuracaoTreino = new JLabel("Duração (minutos):");
        txtDuracaoTreino = new JTextField();

        add(labelNomeTreino);
        add(txtNomeTreino);
        add(labelDescricaoTreino);
        add(txtDescricaoTreino);
        add(labelDuracaoTreino);
        add(txtDuracaoTreino);

        JButton btnCadastrarTreino = new JButton("Cadastrar");
        btnCadastrarTreino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarTreino();
            }
        });

        add(new JLabel());  // Espaço vazio
        add(btnCadastrarTreino);
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

    public JPanel getPanel() {
        return this;
    }
}
