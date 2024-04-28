package aulaExcecoes;

import java.util.Scanner;

public class JogoDados {
    public static void main(String[] args) {
        int valorDado;

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe um valor para a jogada");
            valorDado = sc.nextInt();

            if (valorDado < 1 || valorDado > 6) {
                //throw new Exception("Valor inválido!");
                throw new ValorDadoInvalidoException("Valor inválido!");
            } else {
                System.out.println("O jogador tirou " + valorDado);
            }
//      } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//      }
        }catch (ValorDadoInvalidoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
