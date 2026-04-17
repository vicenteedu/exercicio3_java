package com.mycompany.exercicio3_java;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SIMULADOR DE MIOJO ===");
        System.out.println("A agua ferveu e voce colocou o macarrao na panela.");
        System.out.print("Quantos minutos voce vai deixar cozinhando? ");
        
        // Lendo o tempo que o usuário digitou
        int tempoCozimento = sc.nextInt();
        
        System.out.println("\nAnalisando o resultado...");
        
        // Estrutura de decisão para avaliar o miojo
        if (tempoCozimento < 3) {
            System.out.println("Resultado: O miojo ficou DURO! Crocante demais, parece um tijolo.");
            
        } else if (tempoCozimento == 3) {
            // Se não é menor que 3, checar se é EXATAMENTE 3 
            System.out.println("Resultado: PERFEITO! Você é um verdadeiro mestre culinário do miojo.");
            
        } else {
            System.out.println("Resultado: EMPAPADO! Passou do ponto e virou uma papa triste.");
        }
        
        
        sc.close();
    }
}