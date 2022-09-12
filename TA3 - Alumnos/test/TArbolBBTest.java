/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gpaz1
 */
public class TArbolBBTest {
    TArbolBB arbol;
    public TArbolBBTest() {
    }
    
    
    @Before
    public void setUp() {
        arbol = new TArbolBB();
    }
    
    @After
    public void tearDown() {
        //assertEquals(true, arbol.obtenerAltura()>=0);
    }

   
    @Test
    public void testObtenerAltura() {
        System.out.println("obtenerAltura");
        
        arbol.insertar(new TElementoAB(5, null));
        arbol.insertar(new TElementoAB(8, null));
        arbol.insertar(new TElementoAB(4, null));
        arbol.insertar(new TElementoAB(10, null));       
        int expResult = 2;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);      
        
    }
    @Test
    public void testarbolVacio() {
        System.out.println("arbolVacio");       
        int expResult = -1;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);             
    }
    
    
    
}
