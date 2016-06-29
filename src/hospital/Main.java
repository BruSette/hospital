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
        Pessoa[] pessoas = new Pessoa[3];

        Paciente paciente = new Paciente();
        paciente.setNome("Maicon");

        pessoas[0] = paciente;

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");

        pessoas[1] = funcionario;

        Medico medico = new Medico();
        medico.setNome("Klauss");

        pessoas[2] = medico;

        Pessoa pessoa;

        for (int i = 0; i < pessoas.length; i++) {
            pessoa = pessoas[i];
            System.out.println(pessoa.toString());
        }

    }

}
