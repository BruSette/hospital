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
        
        Paciente paciente1;
        paciente1 = new Paciente();
        paciente1.setNome("Vinicius");
        
        paciente1.setCpf("000.000.111-22");
        
        System.out.println(paciente1.getNome());
        
    }
    
}
