/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoras;

import java.util.HashSet;
import modelo.Proyecto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tello
 */
public class GestoraProyectoTest {
    
    public GestoraProyectoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inicializa method, of class GestoraProyecto.
     */
    @Test
    public void testInicializa() {
        System.out.println("inicializa");
        GestoraProyecto.inicializa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testAddProyecto() {
        System.out.println("addProyecto");
        Proyecto p = null;
        boolean expResult = false;
        boolean result = GestoraProyecto.addProyecto(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borraProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testBorraProyecto() {
        System.out.println("borraProyecto");
        Proyecto p = null;
        boolean expResult = false;
        boolean result = GestoraProyecto.borraProyecto(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProyectos method, of class GestoraProyecto.
     */
    @Test
    public void testGetListaProyectos() {
        System.out.println("getListaProyectos");
        HashSet<Proyecto> expResult = null;
        HashSet<Proyecto> result = GestoraProyecto.getListaProyectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumProyectos method, of class GestoraProyecto.
     */
    @Test
    public void testGetNumProyectos() {
        System.out.println("getNumProyectos");
        int expResult = 0;
        int result = GestoraProyecto.getNumProyectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testBuscaProyecto() throws Exception {
        System.out.println("buscaProyecto");
        String idSt = "";
        Proyecto expResult = null;
        Proyecto result = GestoraProyecto.buscaProyecto(idSt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testEliminaProyecto() throws Exception {
        System.out.println("eliminaProyecto");
        Proyecto p = null;
        GestoraProyecto.eliminaProyecto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
