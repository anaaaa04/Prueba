/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador;

/**
 *
 * @author Belen
 */
import java.util.Scanner;

public class Contador {

    private static int totalObjetos = 0;
    public Contador(){
        totalObjetos++;
        System.out.println("Se ha creado el objeto:"+ totalObjetos);
    }
    public static void mostrarTotal(){
        System.out.println("Total:"+ totalObjetos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿cuantos objetos desea crear?");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            Contador c = new Contador();
        }
        Contador.mostrarTotal();
    }
    
}
