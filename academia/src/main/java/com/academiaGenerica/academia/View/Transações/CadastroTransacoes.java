package com.academiaGenerica.academia.View.Transações;

import javax.swing.*;
import java.awt.*;

public class CadastroTransacoes extends JPanel {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public CadastroTransacoes() {
        initComponents();
    }

    private void initComponents() {
        setLayout(null); // Layout absoluto

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();

        // Configuração da tabela
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"2024-06-19", "Pagamento Mensalidade", "100", "Cartão de Crédito", "Concluída", "Mensalidade referente ao mês de junho"},
                        {"2024-06-18", "Taxa de Inscrição", "50", "Débito Automático", "Concluída", "Nova inscrição de membro"},
                        {"2024-06-15", "Compra de Produtos", "30", "Dinheiro", "Concluída", "Compra de suplementos"},
                        {"2024-06-10", "Ajuste de Mensalidade", "-20", "Crédito Interno", "Concluída", "Ajuste de desconto por fidelidade"},
                        {"2024-06-05", "Mensalidade em Atraso", "100", "Boleto Bancário", "Pendente", "Aguardando pagamento do cliente"},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "Data Transação", "Descrição", "Valor", "Método de Pagamento", "Status", "Observação"
                }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);

        // Posicionamento absoluto dos componentes
        jScrollPane1.setBounds(50, 170, 910, 220);
        add(jScrollPane1);

        jLabel2.setFont(new Font("Arial", Font.BOLD, 36));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setText("Transações");
        jLabel2.setBounds(360, 50, 300, 50);
        add(jLabel2);

        jButton1.setText("Atualizar");
        jButton1.setBounds(430, 470, 240, 70);
        add(jButton1);

        jLabel1.setIcon(new ImageIcon(getClass().getResource(""))); // Caminho da imagem
        jLabel1.setBounds(0, 0, 978, 768);
        add(jLabel1);
    }

    public JPanel getPanel() {
        return this;
    }
}
