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
public class Almoxarifado {
    private Produto produto;
    private float quantidade;
    private Date validade;
    private Date data;
    private Funcionario funcionario;
    private boolean entradaOuSaida;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isEntradaOuSaida() {
        return entradaOuSaida;
    }

    public void setEntradaOuSaida(boolean entradaOuSaida) {
        this.entradaOuSaida = entradaOuSaida;
    }
    
    
}
