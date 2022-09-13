/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.err.println("Forma de uso: java EchoClient <IP Servidor> <número da porta>");
			System.exit(1);

		}
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);
		System.out.println("Cliente ECHO iniciado...");
		String userInput;
		Socket echoSocket;
		BufferedReader in;

		try {
			echoSocket = new Socket(hostName, portNumber);
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			
			JOptionPane.showConfirmDialog(null, "Conectado ao Servidor.");
			
			SendMessage();

			while ((userInput = in.readLine()) != null) {
				System.out.println("Mensagem recebida: " + userInput);

			}
		} catch (UnknownHostException e) {
			System.err.println("Ocorreu um erro ao tentar conectar ao servidor " + hostName);
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Não foi possível conectar ao Servidor " + hostName);
			System.exit(1);
		}

	}

	public static void SendMessage() {

		String Usuario = JOptionPane.showInputDialog("Digite sua mensagem: ");

		
	}

	public void ShowMessage() {

		JOptionPane.showMessageDialog(null, "Chat: ", "Informação", JOptionPane.INFORMATION_MESSAGE);

	}
}
