/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author werlan
 */
public class questão_3 {
    
    public static void main(String[] args) {
        try {
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
