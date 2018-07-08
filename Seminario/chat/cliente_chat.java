/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author lucas
 */
public class cliente_chat {
    public static void main(String[] args) {
        try{   
            Socket cliente = new Socket("192.168.56.1",4444);
            
            EnviarMsg en = new EnviarMsg(cliente);
            en.start();
            ReceberMsg re = new ReceberMsg(cliente);
            re.start();
        }
        catch(IOException e){System.out.println("falha na conexão");}
    }
}
