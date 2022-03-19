package br.com.codandosimples;

import java.io.*;

public class Main {

     // Primeira Forma de Criar e ecrever um arquivo.txt

    /**
    public static void main(String[] args) throws IOException {
        File file = new File("Primeiro.txt");
        OutputStream os = new FileOutputStream(file); // bytes
        OutputStreamWriter osw = new OutputStreamWriter(os); // chars
        BufferedWriter bw = new BufferedWriter(osw);  // String

        bw.write("Primeira Linha..");
        bw.newLine(); // Quebra de Linha
        bw.write("Segunda Linha..");

        bw.close();
    }
     */

    // Segunda Forma de Criar e ecrever um arquivo.txt

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("saida.txt");
        //  ps.println("Primeira Linha..");
        //  ps.println("Segunda Linha..");

        ps.printf("O Numero Do pedido é %d", 10);  // Formatar o Arquivo!

        ps.close();

    }
}