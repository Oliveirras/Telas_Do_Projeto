package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Ouvintes.OuvinteBotaoAluno;
import Ouvintes.OuvinteBtCadastrar;

public class TelaAluno extends TelaPadrao{
	
	private JTextField tfEmail, tfNome, tfMatricula;
	private JPasswordField PfSenha, PfConfirme;
	
	
	public JTextField getTfMatricula() {
		return tfMatricula;
	}
	
	public JTextField getTfNome() {
		return tfNome;
	}
	
	public JTextField getTfEmail() {
		return tfEmail;
	}

	public JPasswordField getPfSenha() {
		return PfSenha;
	}

	public JPasswordField getPfConfirme() {
		return PfConfirme;
	}

	public TelaAluno() {
		super("Aluno");
		setSize(600,600);
		adicionarTitulo();
		adicionarLabels();
		adicionarTextFields();
		adicionarBotoes();
		setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void adicionarTitulo() {
		JLabel titulo = new JLabel("Cadastro do Aluno");
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
		nome.setBounds(80,150,70,30);
		nome.setOpaque(true);
		nome.setBackground(Color.green);
		nome.setBorder(BorderFactory.createLineBorder(Color.black));
		nome.setHorizontalAlignment(JLabel.CENTER);
		nome.setFont(new Font(null,Font.BOLD, 15));
		add(nome);
		JLabel matricula = new JLabel("Matricula:");
		matricula.setBounds(70,200,90,30);
		matricula.setOpaque(true);
		matricula.setBackground(Color.green);
		matricula.setBorder(BorderFactory.createLineBorder(Color.black));
		matricula.setHorizontalAlignment(JLabel.CENTER);
		matricula.setFont(new Font(null,Font.BOLD, 15));
		add(matricula);
		JLabel email = new JLabel("Informe Email:");
		email.setBounds(50,250,150,30);
		email.setOpaque(true);
		email.setBackground(Color.green);
		email.setBorder(BorderFactory.createLineBorder(Color.black));
		email.setHorizontalAlignment(JLabel.CENTER);
		email.setFont(new Font(null,Font.BOLD, 15));
		add(email);
		JLabel senha = new JLabel("Senha:");
		senha.setBounds(80,300,70,30);
		senha.setOpaque(true);
		senha.setBackground(Color.green);
		senha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		senha.setHorizontalAlignment(JLabel.CENTER);
		senha.setFont(new Font(null,Font.BOLD, 15));
		add(senha);
		JLabel confirme = new JLabel("Confirme Senha:");
		confirme.setBounds(50,350,150,30);
		confirme.setOpaque(true);
		confirme.setBackground(Color.green);
		confirme.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		confirme.setHorizontalAlignment(JLabel.CENTER);
		confirme.setFont(new Font(null,Font.BOLD, 15));
		add(confirme);
		
	}
	public void adicionarTextFields() {
		tfNome = new JTextField();
		tfNome.setBounds(220,150,200,30);
		add(tfNome);
		tfMatricula = new JTextField();
		tfMatricula.setBounds(220,200,100,30);
		add(tfMatricula);
		tfEmail = new JTextField();
		tfEmail.setBounds(220,250,260,30);
		add(tfEmail);
		PfSenha = new JPasswordField();
		PfSenha.setBounds(220,300,150,30);
		add(PfSenha);
		PfConfirme = new JPasswordField();
		PfConfirme.setBounds(220,350,150,30);
		add(PfConfirme);
	}
	
	public void adicionarBotoes() {
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setBounds(200,450,200,30);
		OuvinteBotaoAluno ouvinte = new OuvinteBotaoAluno(this);
		btCadastrar.addActionListener(ouvinte);
		btCadastrar.setFont(new Font(null,Font.BOLD, 15));
		btCadastrar.addMouseListener(new MouseListener() {
			
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
				btCadastrar.setBackground(null);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btCadastrar.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(btCadastrar);
	}
	public void adicionarSexo() {
		String[] opcoes = {"M", "F"};
		int opcao = JOptionPane.showInternalOptionDialog(null, "Escolhe seu Sexo", "Sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
	}
	

}
