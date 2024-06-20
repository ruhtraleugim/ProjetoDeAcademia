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
    CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
    CadastroCliente cadastroCliente = new CadastroCliente();
    CadastroTransacoes cadastroTransacoes = new CadastroTransacoes();
    CadastroTreinos cadastroTreinos = new CadastroTreinos();

    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JMenuBar jMenuBar1;
    private JMenu jMenuCadastro;
    private JMenu jMenuFinanceiro;
    private JMenuItem jMenuItemClientes;
    private JMenuItem jMenuItemInstrutores;
    private JMenuItem jMenuItemTreinos;
    private JMenuItem jMenuItemMaquinas;
    private JMenuItem jMenuItemFaturamento;
    private JMenuItem jMenuItemPagamentos;
    private JMenuItem jMenuItemCobrancaAutomatica;
    private JMenuItem jMenuItemRelatorios;
    private JMenuItem jMenuItemConfigFinanceira;
    private JMenu jMenuTreinos;
    private JMenuItem jMenuItemPlanoTreinamento;
    private JMenuItem jMenuItemExercicios;
    private JMenuItem jMenuItemMetas;

    public MenuPrincipal() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1210, 640);
        setLocationRelativeTo(null);

        getContentPane().setLayout(new BorderLayout());

        jLabel1 = new JLabel("Seja bem vindo!");
        jLabel1.setFont(new Font("Arial", Font.BOLD, 24));
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(jLabel1, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new FlowLayout());

        jButton1 = new JButton("Cadastros");
        buttonPanel.add(jButton1);

        jButton3 = new JButton("Financeiro");
        buttonPanel.add(jButton3);

        jButton4 = new JButton("Treinos");
        buttonPanel.add(jButton4);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Barra de menu
        jMenuBar1 = new JMenuBar();
        jMenuCadastro = new JMenu("Cadastro");

        jMenuItemClientes = new JMenuItem("Cadastrar Clientes");
        jMenuCadastro.add(jMenuItemClientes);

        jMenuItemInstrutores = new JMenuItem("Cadastrar Instrutores");
        jMenuCadastro.add(jMenuItemInstrutores);

        jMenuItemTreinos = new JMenuItem("Cadastrar Treinos");
        jMenuCadastro.add(jMenuItemTreinos);

        jMenuItemMaquinas = new JMenuItem("Cadastrar Máquinas e Aparelhos");
        jMenuCadastro.add(jMenuItemMaquinas);

        jMenuBar1.add(jMenuCadastro);

        jMenuFinanceiro = new JMenu("Financeiro");

        jMenuItemFaturamento = new JMenuItem("Faturamento");
        jMenuFinanceiro.add(jMenuItemFaturamento);

        jMenuItemPagamentos = new JMenuItem("Pagamentos");
        jMenuFinanceiro.add(jMenuItemPagamentos);

        jMenuItemCobrancaAutomatica = new JMenuItem("Cobrança Automática");
        jMenuFinanceiro.add(jMenuItemCobrancaAutomatica);

        jMenuItemRelatorios = new JMenuItem("Relatórios e Análises");
        jMenuFinanceiro.add(jMenuItemRelatorios);

        jMenuItemConfigFinanceira = new JMenuItem("Configurações Financeiras");
        jMenuFinanceiro.add(jMenuItemConfigFinanceira);

        jMenuBar1.add(jMenuFinanceiro);

        jMenuTreinos = new JMenu("Treinos");

        jMenuItemPlanoTreinamento = new JMenuItem("Plano de Treinamento");
        jMenuTreinos.add(jMenuItemPlanoTreinamento);

        jMenuItemExercicios = new JMenuItem("Exercícios");
        jMenuTreinos.add(jMenuItemExercicios);

        jMenuItemMetas = new JMenuItem("Metas e Objetivos");
        jMenuTreinos.add(jMenuItemMetas);

        jMenuBar1.add(jMenuTreinos);

        setJMenuBar(jMenuBar1);

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
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal();
            }
        });
    }
}
