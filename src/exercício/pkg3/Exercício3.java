/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class Exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eNum= new Scanner (System.in);
        Scanner eStr= new Scanner (System.in);
        
        Scanner enter= new Scanner (System.in);
        System.out.println("Digite o valor od lado A: ");
        double a = eNum.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        double b = eNum.nextDouble();
        System.out.println("Digite o valor do lado C:" );
        double c = eNum.nextDouble();
        
        if (!(a+b>c & a+c>b & b+c>a)){
            System.out.println("Não forma um triângulo");
        } else if (a==b && a==c & c==b){
            System.out.println("Equilátero");
        } else if (a!=b && a!=c && b!=c){
            System.out.println("Escaleno");
        } else if (a == b && a != c || b == c && b != a || b == c && b != a) 
            System.out.println("Isósceles");
        }
    }    
            
    

