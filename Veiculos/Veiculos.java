package com.mycompany.veiculos;

import entidades.Veiculo;
import entidades.Carro;
import entidades.Moto;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Veiculos {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Veiculo v;
        
        System.out.print("Marca do Veiculo: ");
        String marca = s.nextLine();
        
        System.out.print("Modelo do Veiculo: ");
        String modelo = s.nextLine();
        
        System.out.print("É Carro ou Moto?(c/C ou m/M): ");
        char tipo = s.next().charAt(0);
        s.nextLine();
    
        if(tipo == 'c' || tipo == 'C'){
            
            System.out.print("Quantas Portas?: ");
            int numPortas = s.nextInt();
            v = new Carro(marca, modelo, numPortas);
        
        }else{
           
            System.out.print("Quantas Cilindradas?: ");
            int cilindradas = s.nextInt();
            v = new Moto(marca, modelo, cilindradas);
        }  
        v.exibirDetalhes();
        System.out.println(v.Dirigir());
    }
}
