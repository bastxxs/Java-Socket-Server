/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes;

import javax.swing.JOptionPane;

public class Usuario {

	public static String login;

	public static String senha;

	
	public Usuario() {

		String login = JOptionPane.showInputDialog("Digite seu login: ");
		String senha = JOptionPane.showInputDialog("Digite sua senha: ");
		
		this.login = login;

		this.senha = senha;

	}

	public static String getLogin() {
		
		return login;
	}

	public void setLogin(String login) {

		this.login = login;
	}

	public static String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {

		this.senha = senha;

	}



}
