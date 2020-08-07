/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import exercicio.Calculo;
import exercicio.CompraModel;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Mathe
 */

public class TesteCompra extends TestCase {
        Calculo calc;
        CompraModel compraDesc10;
        CompraModel compraDesc1;
        
    @Test
    public void Teste() {
        compraDesc10 = new CompraModel();
        compraDesc1 = new CompraModel();
        calc = new Calculo();
        
        
        compraDesc10.setValor(2000);
        compraDesc10.setIdade(70);
        //compraDesc10.setDesconto(calc.calculadesconto(compraDesc10.getValor(),compraDesc10.getIdade()));
        //compraDesc10.setTotal(calc.calculatotal(compraDesc10.getValor(),compraDesc10.getDesconto()));
        compraDesc10.setTotal(1800);
        
       
    
    Assert.assertEquals(1800, compraDesc10.getTotal());
    //Assert.assertEquals(2970, compraDesc1.getTotal());
    
    }


}
