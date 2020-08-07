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

import java.util.Scanner;
public class Compra {
    
    CompraModel compra;
    Calculo desc;
    
    public void RealizarCompra() {
        compra = new CompraModel();
        Scanner dados = new Scanner(System.in);
        System.out.println("informe o valor da compra: ");
        compra.setValor(dados.nextInt());
        
        System.out.println("informe a idade: ");
        compra.setIdade(dados.nextInt());
        
        desc = new Calculo();
        compra.setDesconto(desc.calculadesconto(compra.getValor(), compra.getIdade()));
        compra.setTotal(desc.calculatotal(compra.getValor(),compra.getDesconto()));
        
        System.out.println("valor do desconto: "+ compra.getDesconto());
        System.out.println("valor total: "+ compra.getTotal());


}
}
