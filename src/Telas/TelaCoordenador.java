package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

import Ouvintes.OuvinteBtCadastrar;


public class TelaCoordenador extends TelaPadrao{
	
	private JTextField tfEmail;
	
	public JTextField getTfEmail() {
		return tfEmail;
	}

	private JPasswordField PfSenha, PfConfirme;
	
	
	public JPasswordField getPfSenha() {
		return PfSenha;
	}

	public JPasswordField getPfConfirme() {
		return PfConfirme;
	}

	public TelaCoordenador() {
		super("Coordenador");
		adicionarTitulo();
		adicionarLabels();
		adicionarTextFields();
		adicionarBotoes();
		imagemCoordenador();
		setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void adicionarTitulo() {
		JLabel titulo = new JLabel("Coordenador");
		titulo.setBounds(220,90,200,30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.cyan);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font(null,Font.BOLD, 15));
		titulo.setVisible(true);
		titulo.setBorder(BorderFactory.createLineBorder(Color.black));
		add(titulo);
		
	}
	public void adicionarLabels() {
		JLabel email = new JLabel("Email:");
		email.setBounds(50,200,150,30);
		email.setOpaque(true);
		email.setBackground(Color.cyan);
		email.setBorder(BorderFactory.createLineBorder(Color.black));
		email.setHorizontalAlignment(JLabel.CENTER);
		email.setFont(new Font(null,Font.BOLD, 15));
		add(email);
		JLabel senha = new JLabel("Senha:");
		senha.setBounds(80,250,70,30);
		senha.setOpaque(true);
		senha.setBackground(Color.cyan);
		senha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		senha.setHorizontalAlignment(JLabel.CENTER);
		senha.setFont(new Font(null,Font.BOLD, 15));
		add(senha);
		JLabel confirme = new JLabel("Confirme Senha:");
		confirme.setBounds(50,300,150,30);
		confirme.setOpaque(true);
		confirme.setBackground(Color.cyan);
		confirme.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		confirme.setHorizontalAlignment(JLabel.CENTER);
		confirme.setFont(new Font(null,Font.BOLD, 15));
		add(confirme);
		
	}
	
	public void adicionarTextFields() {
		tfEmail = new JTextField();
		tfEmail.setBounds(220,200,260,30);
		add(tfEmail);
		PfSenha = new JPasswordField();
		PfSenha.setBounds(220,250,150,30);
		add(PfSenha);
		PfConfirme = new JPasswordField();
		PfConfirme.setBounds(220,300,150,30);
		add(PfConfirme);
	}
	
	public void adicionarBotoes() {
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setBounds(200,450,200,30);
		btCadastrar.setFont(new Font(null,Font.BOLD, 15));
		JButton btLogin = new JButton("Login");
		btLogin.setBounds(200,500,200,30);
		btLogin.setFont(new Font(null,Font.BOLD, 15));
		btLogin.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btLogin);
		OuvinteBtCadastrar ouvinte = new OuvinteBtCadastrar(this);
		btCadastrar.addActionListener(ouvinte);
		btCadastrar.addMouseListener(new MouseListener() {
			

			public void mouseExited(MouseEvent e) {
				btCadastrar.setBackground(null);
				
			}
			
			
			public void mouseEntered(MouseEvent e) {
				btCadastrar.setBackground(Color.green);
				
			}
			
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btCadastrar);
	}
	
	
	public void imagemCoordenador() {
		ImageIcon icone = new ImageIcon("Imagens/Coordenador2.gif");
		JLabel imagemC = new JLabel(icone);
		imagemC.setBounds(20, 10, 200, 200);
		add(imagemC);
	}

	
	
	
	

}
