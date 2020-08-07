/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio;

/**
 *
 * @author Mathe
 */
public class CompraModel {
        private int idade;
    private int desconto;
    private int valor;
    private int total;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public CompraModel() {
    }

    public CompraModel(int idade, int desconto, int valor, int total) {
        this.idade = idade;
        this.desconto = desconto;
        this.valor = valor;
        this.total = total;
    }


}
