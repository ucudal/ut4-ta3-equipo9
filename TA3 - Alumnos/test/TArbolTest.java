
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TArbolTest {
    TArbolBB<IElementoAB> arbol1;
    TArbolBB<IElementoAB> arbol2;
    TArbolBB<IElementoAB> arbol3;
    public TArbolTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        /*
        arbol1 = new TArbolBB();
        arbol2 = new TArbolBB<IElementoAB>();
        arbol3 = new TArbolBB<IElementoAB>();

        arbol1.insertar(new TElementoBB("asdadsadads", 1));
        arbol1.insertar(new TElementoBB(" asdads", 2));
        arbol1.insertar(new TElementoBB(3, 5));
        arbol1.insertar(new TElementoBB(4, 8));
        arbol1.insertar(new TElementoBB(5, 10));
        arbol2.insertar(new TElementoBB(1, 2));
        arbol2.insertar(new TElementoBB(2, 4));
        arbol2.insertar(new TElementoBB(3, 5));
        */
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testTamanio() {
        System.out.println("tamanio");
        TArbolBB instance = new TArbolBB();
        //assert(true);
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
