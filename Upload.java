/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upload;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class Upload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int mes;

        System.out.println("Digite o número do Mês que deseja : ");
        mes = ler.nextInt();
    

            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                case 2:
                    System.out.println("Fevereiro");
                case 3:
                    System.out.println("Março");
                case 4:
                    System.out.println("Abril");
                case 5:
                    System.out.println("Maio");
                case 6:
                    System.out.println("Junho");
                case 7:
                    System.out.println("Julho");
                case 8:
                    System.out.println("Agosto");
                case 9:
                    System.out.println("Setembro");
                case 10:
                    System.out.println("Outubro");
                case 11:
                    System.out.println("Novembro");
                case 12:
                    System.out.println("Dezembro");
                break;
                default :
                    System.out.println("Este número não representa um mês");
            }
            
        }
    }

