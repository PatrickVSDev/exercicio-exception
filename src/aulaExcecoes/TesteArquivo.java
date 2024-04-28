package aulaExcecoes;

import java.io.IOException;
import java.util.Scanner;

public class TesteArquivo {

    public static void main(String[] args) {
        String arquivo;
        String texto;

        // Esse é o try with resources. Ao usar esse try o Java automaticamente
        // declara o seu Scanner (ou qualquer outro recurso que estiver entre os parênteses)
        // e o fecha após a execução do que está no bloco!

        try(Scanner sc = new Scanner(System.in);) {
            System.out.println("Informe o arquivo que deseja abrir: ");
            arquivo = sc.nextLine();
            System.out.println("Informe o texto que deseja inserir no arquivo: ");
            texto = sc.nextLine();
            EscreveArquivo escreveArquivo = new EscreveArquivo(arquivo, texto);
            try {
                escreveArquivo.escreverTexto();
            } catch (IOException e) {
                System.out.println("Erro ao abrir o arquivo!");
                e.printStackTrace();
            }
//        }finally {
//            System.out.println("O que está no finally executou!");
//            Scanner.close();
        }
    }
}
