package pratica_tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Tat
 */
public class AnoBissextoTest {
    
    public AnoBissextoTest() {
    }
   
    @Test   //classe VALIDA 1
    public void testAnoBissexto_4() {
        AnoBissexto teste = new AnoBissexto();
        int ano = 4;
        
        assertTrue("Teste de ano 0", teste.anoBissexto(ano));
    }

   @Test    //classe VALIDA 2
    public void testAno4_400() {
         AnoBissexto teste = new AnoBissexto();
        int ano = 400;
        
        assertTrue("Teste de ano 0", teste.anoBissexto(ano));
    }
        
   @Test    //classe INVALIDA 1
    public void testAno0() {
         AnoBissexto teste = new AnoBissexto();
        int ano = 0;
        
        assertFalse("Teste de ano 0", teste.anoBissexto(ano));
    }
    
    @Test    //classe INVALIDA 2
    public void testAno4_100() {
         AnoBissexto teste = new AnoBissexto();
        int ano = 1500;
        
        assertFalse("Teste de ano 0", teste.anoBissexto(ano));
    }
    
    @Test    //classe INVALIDA 3
    public void testAnoNaoBissexto() {
         AnoBissexto teste = new AnoBissexto();
        int ano = 2017;
        
        assertFalse("Teste de ano 0", teste.anoBissexto(ano));
    }
}
