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

public class TesteCompra2 extends TestCase {
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
        compraDesc10.setDesconto(calc.calculadesconto(compraDesc10.getValor(),compraDesc10.getIdade()));
        compraDesc10.setTotal(calc.calculatotal(compraDesc10.getValor(),compraDesc10.getDesconto()));
        
      compraDesc1.setValor(3000);
      compraDesc1.setIdade(20);
      compraDesc1.setDesconto(calc.calculadesconto(compraDesc1.getValor(),compraDesc1.getIdade()));
      compraDesc1.setTotal(calc.calculatotal(compraDesc1.getValor(),compraDesc1.getDesconto()));
    
    Assert.assertEquals(1500, compraDesc10.getTotal());
    Assert.assertEquals(2970, compraDesc1.getTotal());
    
    }


}
