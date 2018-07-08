/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author lucas
 */
public class servidor_chat {
    public static void main(String[] args) {
        try{
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("aguardando conexões");
            
            Socket cliente_1 = servidor.accept();
            System.out.println("cliente 1 conectado");
            Socket cliente_2 = servidor.accept();
            System.out.println("cliente 2 conectado");
            
            ServidorReceberEnviar er = new ServidorReceberEnviar(cliente_1, cliente_2);
            er.start();
            
            ServidorReceberEnviar er2 = new ServidorReceberEnviar(cliente_2, cliente_1);
            er2.start();
        }
        catch (IOException ex){System.out.println("impossivel criar servior");}
        }
}
