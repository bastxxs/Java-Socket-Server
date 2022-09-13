/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes;

public class Controlador {

	
	public static boolean verificaUsuario(String login, String senha) {

		do {
			if (login == Usuario.getLogin() && senha == Usuario.getSenha()) {

				return true;

			} else {

				return false;

			}

		} while (login != Usuario.getLogin() || senha != Usuario.getSenha());

	}
}
