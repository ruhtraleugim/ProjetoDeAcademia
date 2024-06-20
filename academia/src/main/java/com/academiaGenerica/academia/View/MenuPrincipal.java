package com.academiaGenerica.academia.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.academiaGenerica.academia.View.Planos.Treino.CadastroTreinos;
import com.academiaGenerica.academia.View.Transações.CadastroTransacoes;
import com.academiaGenerica.academia.View.User.Cliente.CadastroCliente;
import com.academiaGenerica.academia.View.User.Funcionario.CadastroFuncionario;

public class MenuPrincipal extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public MenuPrincipal() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Configuração do CardLayout para alternar entre os painéis
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Painéis de cada cadastro
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cardPanel.add(cadastroFuncionario.getPanel(), "funcionario");

        CadastroCliente cadastroCliente = new CadastroCliente();
        cardPanel.add(cadastroCliente.getPanel(), "cliente");

        CadastroTransacoes cadastroTransacoes = new CadastroTransacoes();
        cardPanel.add(cadastroTransacoes.getPanel(), "transacoes");

        CadastroTreinos cadastroTreinos = new CadastroTreinos();
        cardPanel.add(cadastroTreinos.getPanel(), "treinos");

        // Botões para alternar entre os painéis
        JButton btnCadastroFuncionario = new JButton("Cadastro de Funcionário");
        btnCadastroFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "funcionario");
            }
        });

        JButton btnCadastroCliente = new JButton("Cadastro de Cliente");
        btnCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "cliente");
            }
        });

        JButton btnCadastroTransacoes = new JButton("Cadastro de Transações");
        btnCadastroTransacoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "transacoes");
            }
        });

        JButton btnCadastroTreinos = new JButton("Cadastro de Treinos");
        btnCadastroTreinos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "treinos");
            }
        });

        // Layout do MenuPrincipal
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(btnCadastroFuncionario);
        buttonPanel.add(btnCadastroCliente);
        buttonPanel.add(btnCadastroTransacoes);
        buttonPanel.add(btnCadastroTreinos);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(cardPanel, BorderLayout.CENTER);

        // Adicionando ActionListeners
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cadastros
                cadastroCliente.setVisible(true);
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Financeiro
                cadastroTransacoes.setVisible(true);
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Treinos
                cadastroTreinos.setVisible(true);
            }
        });

        jMenuItemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cadastro de Clientes
                cadastroCliente.setVisible(true);
            }
        });

        jMenuItemInstrutores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cadastro de Instrutores
                cadastroFuncionario.setVisible(true);
            }
        });

        jMenuItemTreinos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cadastro de Treinos
                cadastroTreinos.setVisible(true);
            }
        });

        jMenuItemMaquinas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cadastro de Máquinas e Aparelhos
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemFaturamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Faturamento
                cadastroTransacoes.setVisible(true);
            }
        });

        jMenuItemPagamentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Pagamentos
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemCobrancaAutomatica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Cobrança Automática
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemRelatorios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Relatórios e Análises
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemConfigFinanceira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Configurações Financeiras
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemPlanoTreinamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Plano de Treinamento
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemExercicios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Exercícios
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        jMenuItemMetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para abrir a janela de Metas e Objetivos
                // Aqui você deve colocar a chamada para a respectiva janela
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuPrincipal());
    }
}
