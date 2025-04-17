package informacao.aula;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double imc;
        double peso;
        double altura;
        Scanner input = new Scanner (System.in);

        System.out.println("Olá, vamos fazer seu calculo de imc!");
        System.out.println("Primeiro, quanto pesa? ");
        peso = input.nextDouble();

        System.out.println("Para finalizar, qual sua altura? (em metros) ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu indice de massa corporal é: "+ imc);

        if (imc <  18.5)
        {
            System.out.println("Sua massa corporal está abaixo da média");
        }

        else if (imc <= 24.9 && imc >= 18.5)
        {
            System.out.println("Sua massa corporal está normal!");
        }

        else if (imc >= 25 && imc <= 29.9)
        {
            System.out.println("Sua massa corporal está classificada como sobrepeso, cuidado!");
        }

        else if (imc >= 30 && imc <= 39.9)
        {
            System.out.println("Sua massa corporal está classificada no primeiro grau de obesidade, busque ajuda");
        }

        else if (imc >= 40)
        {
            System.out.println("Você está com uma obesidade grave, busque ajuda imediatamente");
        }

        else {
            System.out.println("Entrada inválida!");
        }

    }

}
