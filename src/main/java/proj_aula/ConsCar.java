package proj_aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.text.*;
public class ConsCar extends JInternalFrame{
	JButton fechar, alt, rmv;
	JTable tabela;
	String [] colunas = {"Tipo", "Placa", "Ano", "Marca", "Modelo", "Cor", "Cód. do Cliente", "Ar Condicionado", "Alterar", "Remover"};
	ImageIcon alter, remove;
	public ConsCar() {
		super("Consulta de Carros");
		Container tela = getContentPane();
		setLayout(null);
		
		alt = new JButton("");
		rmv = new JButton("");
		alter = new ImageIcon("alt.png");
		remove = new ImageIcon("rmv.png");
		rmv.setIcon(remove);
		alt.setIcon(alter);
		
		Object [][] dados = {{"", "", "", "", "", "", "", "", "", ""}, {"", "", "", "", "", "", "", "", "", ""}};
		
		tabela = new JTable(dados, colunas);
		tabela.setBounds(10,10,220,200);
		
		tela.add(tabela);
		setSize(250,250);
		setVisible(true);
	}
}