
package seminario;

import java.io.*;
import java.net.*;

public class cliente_2 {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Socket cliente = new Socket("192.168.3.107",6666);
            DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
            
            String diretorio = "DIRETORIO DO ARQUIVO A SER ENVIADO.";
            File arquivo = new File(diretorio);
            
            String len = String.valueOf(arquivo.length());
            System.out.println(len);
            
            saida.writeUTF(len);
            
            ////////////////////////////////////////////////////////////////////
            DataOutputStream out  = new DataOutputStream(cliente.getOutputStream());

            //Leitura do arquivo solicitado
            FileInputStream file = new FileInputStream(arquivo);
            //DataInputStream para processar o arquivo solicitado
            DataInputStream a = new DataInputStream(file);
  
            int begin = 0;
            
            System.out.println("enviando");
             
            //Buffer de leitura dos bytes do arquivo
            byte buffer[] = new byte[50];

            int leitura = a.read(buffer);
            //Lendo os bytes do arquivo e enviando para o socket  
            while(leitura != - 1) {
                if(leitura != - 2) {
                    out.write(buffer,begin,leitura);
                    out.flush(); 
                }
                leitura = a.read(buffer);
            }

            System.out.println("arquivo enviado");

            out.close();
            saida.close();
            cliente.close();
        }
        catch(IOException e){ System.out.println(e);}
    }
}
