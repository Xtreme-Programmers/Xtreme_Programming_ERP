/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.MyException;
import gestoras.GestoraProyecto;
import java.util.HashSet;
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
public class ProyectoTest {

    private Proyecto instanceP;
    private Story instanceS;

    public ProyectoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws MyException {
        GestoraProyecto.inicializa();
        instanceP = new Proyecto("aaaa", "lalala");
        instanceS = new Story("aaa", "24", "lalala");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setNombreProyecto method, of class Proyecto.
     */
    @Test
    public void testSetNombreProyecto() throws Exception {
        System.out.println("Si setNombreProyecto");
        String nombreProyecto = "aaaa";
        instanceP.setNombreProyecto(nombreProyecto);
        assertEquals(nombreProyecto, instanceP.getNombreProyecto());
    }

    /**
     * Test of setDescripcion method, of class Proyecto.
     */
    @Test
    public void testSetDescripcion() throws Exception {
        System.out.println("setDescripcion");
        String descripcion = "";
        Proyecto instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoProyecto method, of class Proyecto.
     */
    @Test
    public void testSetEstadoProyecto() throws Exception {
        System.out.println("setEstadoProyecto");
        String estadoProyecto = "";
        Proyecto instance = null;
        instance.setEstadoProyecto(estadoProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProyecto method, of class Proyecto.
     */
    @Test
    public void testGetIdProyecto() {
        System.out.println("getIdProyecto");
        Proyecto instance = null;
        int expResult = 0;
        int result = instance.getIdProyecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProyecto method, of class Proyecto.
     */
    @Test
    public void testGetNombreProyecto() {
        System.out.println("getNombreProyecto");
        Proyecto instance = null;
        String expResult = "";
        String result = instance.getNombreProyecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Proyecto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Proyecto instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoProyecto method, of class Proyecto.
     */
    @Test
    public void testGetEstadoProyecto() {
        System.out.println("getEstadoProyecto");
        Proyecto instance = null;
        String expResult = "";
        String result = instance.getEstadoProyecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaStories method, of class Proyecto.
     */
    @Test
    public void testGetListaStories() {
        System.out.println("getListaStories");
        Proyecto instance = null;
        HashSet<Story> expResult = null;
        HashSet<Story> result = instance.getListaStories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Proyecto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Proyecto instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
