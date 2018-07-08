/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author lucas
 */
public class ServidorReceberEnviar extends Thread{
    Socket c_recebido;
    Socket c_enviar;

    public ServidorReceberEnviar(Socket c_recebido, Socket c_enviar) {
        this.c_recebido = c_recebido;
        this.c_enviar = c_enviar;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                DataInputStream entrada = new DataInputStream(c_recebido.getInputStream());
                DataOutputStream saida = new DataOutputStream(c_enviar.getOutputStream());
                
                String msg = entrada.readUTF();
                
                if (msg.equals("o cliente desconectou")){
                    saida.writeUTF("o cliente desconectou");
                    entrada.close();
                    saida.close();
                    break;
                }
                
                saida.writeUTF(msg);
            }
            c_recebido.close();
        }
        catch(IOException e){System.out.println("impossivel receber mensagem");}
    }
}
