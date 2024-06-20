package com.academiaGenerica.academia.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CadastroTreinos extends JFrame {

    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel jLabel2;
    private JButton jButton1;
    private JLabel jLabel1;

    public CadastroTreinos() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {"João Silva", "12345", "2024-06-20", "Treino de musculação focado em membros inferiores", "Ana Rodrigues", "Ganho de massa muscular", "Barra e anilhas", "Cliente iniciante, explicar os exercícios com detalhes"},
                {"Maria Souza", "67890", "2024-06-22", "Treino de circuito de alta intensidade", "Carlos Santos", "Melhora da resistência cardiovascular", "Esteira e halteres", "Cliente possui lesão no joelho esquerdo, evitar impacto"},
                {"Pedro Oliveira", "54321", "2024-06-25", "Treino de pilates para iniciantes", "Fernanda Lima", "Flexibilidade e relaxamento", "Bolas de pilates e faixas elásticas", "Cliente prefere treinos no período da manhã"},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome Cliente", "ID", "Data Treino", "Descrição Treino", "Instrutor Responsável", "Objetivo Treino", "Equipamentos", "Observações"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, BorderLayout.CENTER);

        jLabel2.setFont(new Font("Arial", Font.BOLD, 24));
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Treinos Agendados");
        getContentPane().add(jLabel2, BorderLayout.NORTH);

        jButton1.setText("Incluir Novo Treino");
        getContentPane().add(jButton1, BorderLayout.SOUTH);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("halteres-no-chao-de-uma-academia-ai-generative.jpg")));
        getContentPane().add(jLabel1, BorderLayout.WEST);

        pack();
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTreinos().setVisible(true);
            }
        });
    }
}
