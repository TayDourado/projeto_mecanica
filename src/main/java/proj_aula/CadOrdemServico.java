package proj_aula;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;

public class CadOrdemServico extends JInternalFrame{
     JLabel CodFunc, CodCli, CodVel, Desc, Obs, DataEnt, DataFim, Valor;
     JTextField CodFunc_txt, CodCli_txt, CodVel_txt, Desc_txt, Obs_txt, Valor_txt;
     JList CodProdServ;
     JButton limpar, cadastrar, fechar;
     JFormattedTextField DataEnt_txt, DataFim_txt;
     MaskFormatter mascaradataent, mascaradatafim;
     public CadOrdemServico() {
         super("Cadastro de Ordens de Serviço");
         Container tela = getContentPane();
	 setLayout(null);
		
	 CodFunc = new JLabel("Código do Funcionário:");	
         CodCli = new JLabel("Código do Cliente:");	
         CodVel = new JLabel("Código do Veículo:");	
         Desc = new JLabel("Descrição do problema:");	
         Obs = new JLabel("Observações Adicionais");	
         DataEnt = new JLabel("Data de Entrada:");	
         DataFim = new JLabel("Data de Finalização:");	
         Valor = new JLabel("Valor total: R$");	
         CodFunc_txt = new JTextField(10);
         CodCli_txt = new JTextField(10);
         CodVel_txt = new JTextField(10);
         Desc_txt = new JTextField(1000);
         Obs_txt = new JTextField(500);
         Valor_txt = new JTextField(10);
         CodProdServ = new JList(); //STRING DOS CODIGOS DE PRODUTOS E SERVIÇOS
         limpar = new JButton("Limpar");
	 cadastrar = new JButton("Cadastrar");
	 fechar = new JButton("Fechar");
         
         try {
             mascaradataent = new MaskFormatter("##/##/####");
	     mascaradataent.setPlaceholderCharacter('_');
             mascaradatafim = new MaskFormatter("##/##/####");
	     mascaradatafim.setPlaceholderCharacter('_');
	 }catch(ParseException excp) {}
		
	     DataEnt_txt = new JFormattedTextField(mascaradataent);
	     DataFim_txt = new JFormattedTextField(mascaradatafim);
                
         CodFunc.setBounds(10,40,70,20);
	 CodFunc.setFont(new Font("Century Gothic", 1, 15));
	 CodCli.setBounds(10,70,70,20);
	 CodCli.setFont(new Font("Century Gothic", 1, 15));
	 CodVel.setBounds(10,100,70,20);
	 CodVel.setFont(new Font("Century Gothic", 1, 15));
	 Desc.setBounds(10,130,70,20);
	 Desc.setFont(new Font("Century Gothic", 1, 15));
	 Obs.setBounds(140,40,70,20);
	 Obs.setFont(new Font("Century Gothic", 1, 15));
	 Valor.setBounds(10,160,150,20);
	 Valor.setFont(new Font("Century Gothic", 1, 15));
	 CodProdServ.setBounds(10,190,150,20);
	 CodProdServ.setFont(new Font("Century Gothic", 1, 15));
	 DataEnt.setBounds(140,190,50,20);
	 DataEnt.setFont(new Font("Century Gothic", 1, 12));
	 DataFim.setBounds(185,190,60,20);
	 DataFim.setFont(new Font("Century Gothic", 1, 12));
         
         CodFunc_txt.setFont(new Font("Century Gothic", 0, 15));
	 CodCli_txt.setFont(new Font("Century Gothic", 0, 16));
	 CodVel_txt.setFont(new Font("Century Gothic", 0, 14));
	 Desc_txt.setFont(new Font("Century Gothic", 0, 14));
	 Obs_txt.setFont(new Font("Century Gothic", 0, 14));
	 Valor_txt.setFont(new Font("Century Gothic", 0, 14));
		
	 CodFunc_txt.setBounds(60,40,75,20);
	 CodCli_txt.setBounds(180,40,50,20);
	 CodVel_txt.setBounds(65,70,165,20);
	 Desc_txt.setBounds(75,100,155,20);
	 Obs_txt.setBounds(155,160,75,20);
	 Valor_txt.setBounds(45,130,185,20);
                
	 limpar.setBounds(10,245,120,20);
	 limpar.setFont(new Font("Century Gothic", 1, 15));
	 cadastrar.setBounds(10,215,120,20);
	 cadastrar.setFont(new Font("Century Gothic", 1, 15));
	 fechar.setBounds(140,215,90,50);
	 fechar.setFont(new Font("Century Gothic", 1, 15));
	 limpar.setBackground(Color.WHITE);
	 fechar.setBackground(Color.WHITE);
	 cadastrar.setBackground(Color.WHITE);
         
         limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CodFunc_txt.setText("");
				CodCli_txt.setText("");
				CodVel_txt.setText("");
				Desc_txt.setText("");
				Obs_txt.setText("");
				Valor_txt.setText("");
			}
		});
	 tela.add(CodFunc);	
         tela.add(CodCli);	
         tela.add(CodVel);	
         tela.add(Desc);	
         tela.add(Obs);	
         tela.add(DataEnt);	
         tela.add(DataFim);	
         tela.add(Valor);	
         tela.add(CodFunc_txt);
         tela.add(CodCli_txt);
         tela.add(CodVel_txt);
         tela.add(Desc_txt);
         tela.add(Obs_txt);
         tela.add(Valor_txt);
         tela.add(CodProdServ);
	 tela.add(limpar);
	 tela.add(cadastrar);
	 tela.add(fechar);
		
	 setSize(250,310);
	 setVisible(true);
     }
}
