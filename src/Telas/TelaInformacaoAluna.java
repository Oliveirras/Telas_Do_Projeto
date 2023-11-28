package Telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInformacaoAluna extends JFrame{
	
	public TelaInformacaoAluna() {
		setSize(600,600);
		adicionarTitulo();
		adicionarLabels();
		imagemAluno();
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void adicionarTitulo() {
		JLabel titulo = new JLabel("Perfil");
		titulo.setBounds(220,90,200,30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.green);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font(null,Font.BOLD, 15));
		titulo.setVisible(true);
		titulo.setBorder(BorderFactory.createLineBorder(Color.black));
		add(titulo);
		
	}
	public void adicionarLabels() {
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(50,250,100,30);
		nome.setOpaque(true);
		nome.setBackground(Color.green);
		nome.setBorder(BorderFactory.createLineBorder(Color.black));
		nome.setHorizontalAlignment(JLabel.CENTER);
		nome.setFont(new Font(null,Font.BOLD, 15));
		add(nome);
		JLabel matricula = new JLabel("Idade:");
		matricula.setBounds(50,300,100,30);
		matricula.setOpaque(true);
		matricula.setBackground(Color.green);
		matricula.setBorder(BorderFactory.createLineBorder(Color.black));
		matricula.setHorizontalAlignment(JLabel.CENTER);
		matricula.setFont(new Font(null,Font.BOLD, 15));
		add(matricula);
		JLabel email = new JLabel("Email:");
		email.setBounds(50,350,100,30);
		email.setOpaque(true);
		email.setBackground(Color.green);
		email.setBorder(BorderFactory.createLineBorder(Color.black));
		email.setHorizontalAlignment(JLabel.CENTER);
		email.setFont(new Font(null,Font.BOLD, 15));
		add(email);
		JLabel senha = new JLabel("Matricula:");
		senha.setBounds(50,400,100,30);
		senha.setOpaque(true);
		senha.setBackground(Color.green);
		senha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		senha.setHorizontalAlignment(JLabel.CENTER);
		senha.setFont(new Font(null,Font.BOLD, 15));
		add(senha);
		
	}
	public void mostrarInformacao() {
		
		
	}
	public void imagemAluno() {
		ImageIcon icone = new ImageIcon("Imagens/aluna2.gif");
		JLabel imagemC = new JLabel(icone);
		imagemC.setBounds(220, 90, 200, 200);
		add(imagemC);
	}

}
