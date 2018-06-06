package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisa {
	public static void main(String[] args) {
		ContatoDao cont = new ContatoDao();
		long num = new Integer(JOptionPane.showInputDialog("informe um numero"));
		Contato c1 = cont.pesquisa(num);
		
		JOptionPane.showMessageDialog(null, "Nome: " + c1.getNome());
	}
}
