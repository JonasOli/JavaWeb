package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		try(Connection connection = new ConnectionFactory().getConnection()) {
			System.out.println("Conexão aberta!");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
