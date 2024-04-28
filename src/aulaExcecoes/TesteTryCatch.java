package aulaExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Informe o segundo número: ");
            num2 = sc.nextInt();
            System.out.println("A divisão dos dois números é: " + (num1 / num2));
        }catch (ArithmeticException ex) {
            //System.out.println("Divisão por zero??? Sério mesmo???");
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        }catch (InputMismatchException ex) {
            System.out.println("Somente números são aceitos!");
        }
        System.out.println("A soma dos números é: "+ (num1 + num2));
        System.out.println("A subtração dos dois números é: "+ (num1 - num2));
        System.out.println("A multiplicação dos dois números é :"+ (num1 * num2));
    }
}
