/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.Transient;
import static org.testng.Assert.*;

/**
 *
 * @author f209
 */
public class PruebaRomanos {

    public PruebaRomanos() {
    }

    /**
     * @Todo: Prueba agregada por: Daniel Granados - Natalia Moreno
     */
    @Test(expectedException = Exception.class)
    public void validarCero(){
         Conversor conversor = new Conversor();
        int numero = 0;
        conversor.convertir(numero);
    }
    
    /**
     * @Todo: Prueba agregada por: Daniel Granados - Natalia Moreno
     */
    @Test(expectedException = Exception.class)
    public void validarConversionesDeUnDigito(){
        Conversor conversor = new Conversor();
        String romano = conversor.convertir(1);
        Assert.assertEquals(romano,"I");
        
        romano = conversor.convertir(9);
        Assert.assertEquals(romano,"IX");
        
        romano = conversor.convertir(49);
        Assert.assertEquals(romano,"XLIX");
        
    }
    
    @Test
    public void validarEsNUmero() {
        Conversor conversor = new Conversor();
        int numero = 5;
        Assert.assertTrue(conversor.validarEsNUmero(numero) == true);

    }

    @Test
    public void validarNoEsNUmero() {
        Conversor conversor = new Conversor();
        String numero = "x";
        Assert.assertTrue(conversor.validarEsNUmero(numero) == false);

    }

    @Test
    public void validarEsEntero() {
        Conversor conversor = new Conversor();
        int numero = 5;
        Assert.assertTrue(conversor.validarEsEntero(numero) == true);

    }

    @Test
    public void validarNoEsEntero() {
        Conversor conversor = new Conversor();
        double  numero = 3.3;
        Assert.assertTrue(conversor.validarEsEntero(numero) == false);
    }

    @Test
    public void validarEsPositivo() {
        Conversor conversor = new Conversor();
        int numero = 5;
        Assert.assertTrue(conversor.validarEsPositivo(numero) == true);
    }

    @Test
    public void validarNoEsPositivo() {
        Conversor conversor = new Conversor();
        int numero = -4;
        Assert.assertTrue(conversor.validarEsPositivo(numero) == false);
    }
}
