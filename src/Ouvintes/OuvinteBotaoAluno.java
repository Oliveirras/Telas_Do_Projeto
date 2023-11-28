package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Telas.TelaAluno;

public class OuvinteBotaoAluno implements ActionListener{
	
	private TelaAluno aluno;
	public OuvinteBotaoAluno(TelaAluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public void actionPerformed(ActionEvent clique) {
		String matricula = aluno.getTfMatricula().getText();
		JOptionPane.showMessageDialog(aluno, "Sua mátricula é: " + matricula);
		
	}

}
