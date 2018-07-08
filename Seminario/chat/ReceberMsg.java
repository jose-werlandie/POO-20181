/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author lucas
 */
public class ReceberMsg extends Thread{
    Socket cliente;

    public ReceberMsg(Socket cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                DataInputStream entrada = new DataInputStream(cliente.getInputStream());
                
                String msg = entrada.readUTF();
                
                if (msg.equals("o cliente desconectou")){
                    System.out.println("o cliente desconectou");
                    entrada.close();
                    break;
                }
                
                System.out.println("o cliente diz: " + msg);
            }
            cliente.close();
        }
        catch(IOException e){System.out.println("impossivel receber mensagem");}
    }
}
