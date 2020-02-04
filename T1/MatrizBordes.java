/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author tracs
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese valor de la matriz");
        Scanner reader = new Scanner(System.in);
        int numero = reader.nextInt();
        int matriz[][] = new int[numero][numero];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j]=0;
            }
        }
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if(i == 0 || i==numero-1){
                    matriz[i][j]=1; 
                }
                if(j == 0 || j==numero-1){
                    matriz[i][j]=1; 
                }
            }
        }
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
}
