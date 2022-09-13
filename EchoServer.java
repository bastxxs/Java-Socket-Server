/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redes;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class EchoServer {

	public static void main(String[] args) throws IOException {

		if (args.length != 1) {
			System.err.println("Forma de uso: java EchoServer <numero da porta>");
			System.exit(1);
		}

		int portNumber = Integer.parseInt(args[0]);
		System.out.println("Servidor ECHO pronto... Pressione CTRL+C para sair. \nAguardando o Cliente...");
		String inputLine;
		ServerSocket serverSocket;
		Socket clientSocket;

		try {
			serverSocket = new ServerSocket(portNumber);
			clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			Usuario usuario1 = new Usuario();

			do {

				System.out.println("Aguardando Mensagem a enviar...");

				while ((inputLine = in.readLine()) != null) {
					System.out.println("Mensagem enviada: " + inputLine);
					out.println(inputLine);
					System.out.println("Digite nova mensagem...");

				}

			} while (Controlador.verificaUsuario(Usuario.getLogin(), Usuario.getSenha()) == false);

		} catch (IOException e) {
			System.out.println("Erro detectado ao tentar ouvir a porta " + portNumber + " ou escutar a conexão.");
			System.out.println(e.getMessage());

		}

	}
}

