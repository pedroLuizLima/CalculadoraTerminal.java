package Principal;

import Calculos.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parâmetros para a calculadora calcular
        double num1;
        double num2;
        //Condição de existência do loop do programa
        boolean condicaoExistencia = true;
        //Criação do obejto calculadora para aplicar os métodos da classe Calculadora
        Calculadora calculadora = new Calculadora();
        //Variável para a escolha de continuar ou não a executar o programa
        int desejo;
        //Atribuição de um Scanner para a entrada de valores na calculadora
        Scanner leitura = new Scanner(System.in);

        //Menu de escolha do cálculo da calculadora com text block
        String menu =("""
                    =====================================================
                    Bem vindo à calculadora!
                    
                    Qual será a operação a ser realizada?
                    1- Soma;
                    2- Subtração;
                    3- Multiplicação;
                    4- Divisão;
                    5- Porcentagem
                    6- Raiz quadrada
                    =====================================================
                    """);
        //Loop de funcionamento da calculadora
        while (condicaoExistencia){
            System.out.println(menu);

            //Condicional para escolher e fazer o calculo escolhido
            int opcao = leitura.nextInt();
            //Switch case para escolha e execução do cálculo
            switch (opcao) {
                case 1:
                    try{
                        System.out.println("Digite o primeiro número a ser somado: ");
                        num1 = leitura.nextDouble();
                        System.out.println("Agora digite o segundo número: ");
                        num2 = leitura.nextDouble();
                        System.out.println(String.format("%.2f + %.2f = %.2f", num1, num2, calculadora.soma(num1,num2)));
                    }catch (RuntimeException e){
                        System.out.println("Erro ao realizar a soma: " + e.getMessage());
                    }

                    break;
                case 2:
                    try{
                        System.out.println("Digite o minuendo: ");
                        num1 = leitura.nextDouble();
                        System.out.println("Agora digite o subtraendo: ");
                        num2 = leitura.nextDouble();
                        System.out.println(String.format("%.2f - %.2f = %.2f", num1, num2, calculadora.subtracao(num1,num2)));
                    }catch (RuntimeException e){
                        System.out.println("Erro ao realizar a subtração: " + e.getMessage());
                    }

                    break;
                case 3:
                    try{
                        System.out.println("Digite o primeiro número a ser multiplicado: ");
                        num1 = leitura.nextDouble();
                        System.out.println("Agora digite o segundo número: ");
                        num2 = leitura.nextDouble();
                        System.out.println(String.format("%.2f * %.2f = %.2f", num1, num2, calculadora.multiplicacao(num1,num2)));
                    }catch (RuntimeException e){
                        System.out.println("Erro ao realizar a multiplicação: " + e.getMessage());
                    }

                    break;
                case 4:
                    try{
                        System.out.println("Digite o número a ser dividido: ");
                        num1 = leitura.nextDouble();
                        System.out.println("Agora digite o divisor: ");
                        num2 = leitura.nextDouble();
                        System.out.println(String.format("%.2f / %.2f = %.2f", num1, num2, calculadora.divisao(num1,num2)));
                    } catch (RuntimeException e) {
                        System.out.println("Erro ao realizar a divisão: " + e.getMessage());
                    }

                    break;
                case 5:
                    try{
                        System.out.println("Digite o número o qual você deseja retirar a porcentagem: ");
                        num1 = leitura.nextDouble();
                        System.out.println("Agora digite a porcentagem (somente a parte numérica): ");
                        num2 = leitura.nextDouble();
                        System.out.println(String.format("%.2f porcento de %.2f é %.2f", num2, num1, calculadora.porcentagem(num1,num2)));
                    } catch (RuntimeException e) {
                        System.out.println("Erro ao realizar o cálculo de porcentagem: " + e.getMessage());
                    }

                    break;
                case 6:
                    try{
                        System.out.println("Digite o número o qual você deseja retirar a raiz quadrada: ");
                        num1 = leitura.nextDouble();
                        System.out.println(String.format("A raiz quadrada de %.2f é %.2f", num1, calculadora.raizQuadrada(num1)));
                    } catch (RuntimeException e) {
                        System.out.println("Erro ao realizar o cálculo de raiz quadrada: " + e.getMessage());
                    }

                    break;
                default:
                    System.out.println("Por favor insira um valor válido.");
            }
            //Confirmação se deseja realizar outro cálculo ou encerrar o programa
            desejo = calculadora.desejaContinuar();
            if(desejo == 2){
                condicaoExistencia = false;
            }
        }
    }
}