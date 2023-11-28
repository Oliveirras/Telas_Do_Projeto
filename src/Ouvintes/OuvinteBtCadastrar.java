package Ouvintes;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Telas.TelaCoordenador;

public class OuvinteBtCadastrar implements ActionListener{
	
	private TelaCoordenador tela;
	
	public OuvinteBtCadastrar(TelaCoordenador tela) {
		this.tela = tela;
	}
	
	public void actionPerformed(ActionEvent e) { 
		String senha = null;
		if(tela.getPfSenha().getText().length() > 6 && tela.getPfSenha().getText().equals(tela.getPfConfirme().getText())) {
			senha = tela.getPfSenha().getText();
			JOptionPane.showMessageDialog(tela, "Senha Adicionada!");
		}else {
			JOptionPane.showMessageDialog(tela, "No minino 6 caracteres!");
		}
		String email = tela.getTfEmail().getText();
		
		
		
	}
	
	
	

}
