package aulaExcecoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreveArquivo {
    private String arquivo;
    private String texto;

    public EscreveArquivo(String arquivo, String texto) {
        this.arquivo = arquivo;
        this.texto = texto;
    }

    public void escreverTexto() throws IOException{
        try {
            // Declarar o objeto de manipulação de arquivo para escrita
            FileWriter arq = new FileWriter(arquivo);
            // Declarar o objeto que escreve no arquivo
            PrintWriter saida = new PrintWriter(arq);
            // Escrever no arquivo
            saida.println(texto);
            // Fechar os objetos criados
            arq.close();
            saida.close();
            System.out.println("Texto inserido com sucesso no arquivo!");
        } catch (IOException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}

