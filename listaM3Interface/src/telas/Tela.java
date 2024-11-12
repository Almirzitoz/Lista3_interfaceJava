package telas;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tela extends JFrame{
public Tela(String titulo){
    super(titulo);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLocationRelativeTo(null);
    add(new Painel());

    



    setVisible(true);
}
}
class Painel extends JPanel{
    public Painel(){
        progressao();
        titulo();
        nome();
        resumo();
        cor();
        genero();
        botao();
        questaoG();
        tabela();
        lista();
        arvore();
    }
    public void titulo(){
        add(new JLabel("-----Interface gráfica com Java Swing------"));
    }
    public void nome(){
        add(new JLabel("Nome: "));
        add(new JTextField(5));
    }
    public void resumo(){
        add(new JLabel("Faça um resumo de suas atividades profissonais: "));
        
        add(new JTextArea(5,20));
    }
    public void cor(){
        add(new JLabel("Cores favoritas: "));
        add(new JCheckBox("Azul"));
        add(new JCheckBox("Preto"));
        add(new JCheckBox("Amarelo"));
        add(new JCheckBox("Verde"));
    }
    public void genero(){
        add(new JLabel("Sexo: "));
        add(new JRadioButton("Masculino"));
        add(new JRadioButton("Feminino"));
    }

    public void botao(){
        add(new JButton("Cancelar"));
        add(new JButton("Salvar"));
        add(new JButton("Enviar"));
    }

    public void questaoG(){
        add(new JLabel("Nome: "));
        add(new JTextField(5));
        add(new JLabel("Sexo: "));
        add(new JRadioButton("Masculino"));
        add(new JRadioButton("Feminino"));
        add(new JButton("Enviar"));
    }
    public void tabela(){
        String[] colunas = {"Código","Produto","Descrição"};
        String[][] produtos = {
            {"1123","Pendrive","Pendrive 32GB"},
            {"2323","HD SSD","256GB"},
            {"3333","Memória RAM","16GB"},
            {"2344","CPU","i7"}
        };
        
        add(new JTable(produtos,colunas));
    }
    public void lista(){
        String[] lista = {"Item 1","Item 2","Item 3","Item 4","Item 5"};
        JList<String> lista2 = new JList<>(lista);
        JScrollPane scrollPane = new JScrollPane(lista2);
        lista2.setSelectionMode(1);
        lista2.setVisibleRowCount(3);
        add(scrollPane);
    }
    public void progressao(){
        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);
        for (int i = 0; i < 100; i++) {
            progressBar.setValue(i);
        }
    }
    public void arvore(){
        DefaultMutableTreeNode aba1 = new DefaultMutableTreeNode("Opções");
        DefaultMutableTreeNode comidas = new DefaultMutableTreeNode("Comidas");
        DefaultMutableTreeNode bebidas = new DefaultMutableTreeNode("bebidas");
        comidas.add(new DefaultMutableTreeNode("Pão"));
        comidas.add(new DefaultMutableTreeNode("Coxinha"));
        comidas.add(new DefaultMutableTreeNode("Pastel"));

        bebidas.add(new DefaultMutableTreeNode("Coca-Cola"));
        bebidas.add(new DefaultMutableTreeNode("Guaraná"));
        bebidas.add(new DefaultMutableTreeNode("Suco de laranja"));

        aba1.add(comidas);
        aba1.add(bebidas);
        JTree jTree = new JTree(aba1);
        JScrollPane scrollPane = new JScrollPane(jTree);
        add(scrollPane);
        
    }
}

