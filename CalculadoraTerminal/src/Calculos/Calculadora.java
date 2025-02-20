package Calculos;

import java.util.Scanner;

public class Calculadora {
    //Atribuição de um Scanner para a entrada de valores
    Scanner leitura = new Scanner(System.in);
    int desejaContinuar;


    //Soma da calculadora
    public double soma(double num1, double num2){
        return (num1 + num2);
    }

    //Subtração da calculadora
    public double subtracao(double num1, double num2){
        return (num1 - num2);
    }

    //Multiplicação da calculadora
    public double multiplicacao(double num1, double num2){
        return (num1 * num2);
    }

    //Divisão da calculadora
    public double divisao(double num1, double num2){
        return (num1 / num2);
    }

    //Porcentagem da calculadora
    public double porcentagem(double num1, double num2){
        return (num1 * (num2/100));
    }

    //Raiz quadrada da calculadora
    public double raizQuadrada(double num1) {
        return (Math.sqrt(num1));
    }

    //Verificação do desejo do usuário de continuar a calcular ou não
    public int desejaContinuar() {
        desejaContinuar = 0;
        while (desejaContinuar != 1 && desejaContinuar != 2) {

            System.out.println("""
                =====================================================
                Deseja realizar outro cálculo?
                1- Sim
                2- Não
                =====================================================
                """);
            desejaContinuar = leitura.nextInt();
        }
        return desejaContinuar;
    }
}

