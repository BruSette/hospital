/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author raphael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Main m = new Main();
       A x = new B();
       m.imprime(x);
      
    }
    
    public void imprime(A x){
        System.out.println("Metodo A");
        x.faz();
    }
    
    public void imprime(B x){
        System.out.println("Metodo B");
        x.faz();
    }
    
    
}
