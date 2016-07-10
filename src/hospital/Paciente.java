/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Date;

/**
 *
 * @author raphael
 */
public class Paciente extends Pessoa {

    //Fator RH será imbutido no atributo
    private String tipoSanguineo;
    private Date dataCadastro;
    private long numCadastro;
    private String restricoes;
    private String historico;
    private String observacoes;

    public Paciente() {
        System.out.println("Paciente sem parametro");
        tipoSanguineo = "O-";
    }

    public Paciente(String nome) {
        setNome(nome);
        System.out.println("Paciente com parametro");
    }

    public String getNome(boolean retorna) {
        if (retorna) {
            return super.getNome();
        }
        return null;
    }
    
    public boolean getNome(int a){
        return true;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public long getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(long numCadastro) {
        this.numCadastro = numCadastro;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String toString() {
        return "Paciente:" + getNome();
    }
}
