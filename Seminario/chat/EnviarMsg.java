/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class EnviarMsg extends Thread{
    private Socket cliente;
    
    public EnviarMsg(Socket cliente){
        this.cliente = cliente;
    }
    
    @Override
    public void run(){
        try{
            while (true){
                Scanner scan = new Scanner(System.in);

                String msg = scan.nextLine();

                DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
                
                if (msg.equals("sair")){
                    saida.writeUTF("o cliente desconectou");
                    saida.close();
                    break;
                }
                
                saida.writeUTF(msg);
            }
            cliente.close();
           
        }catch(IOException e){System.out.println("erro no envio");}
    }
}
