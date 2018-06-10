/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9;

/**
 *
 * @author werlan
 */
import java.io.*;
import java.util.Scanner;

public class questão_2 {

    public static void main(String[] args) {
        try {
            // Conteudo
            //String content = "werlan";
            Scanner scan = new Scanner( System.in );
            
            // Cria arquivo
            File file = new File("teste3.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Escreve e fecha arquivo
            System.out.println("Escreva seu nome; ");
            
            bw.write(scan.nextLine());
            System.out.println("Escreva sua idade; ");
            
            bw.append("\n" + scan.nextLine());
            System.out.println("Escreva seu livro predileto; ");
            
            bw.append("\n" + scan.nextLine());
            bw.close();
            
            // Le o arquivo
            FileReader ler = new FileReader("teste3.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            // Imprime confirmacao
            System.out.println("Feito =D");

        } catch (IOException e) {
            e.printStackTrace();//ele faz uma fila de execuçãoes em caso de erro , ele exibe o caminho ate chegar no erro.
        }
    }
}
