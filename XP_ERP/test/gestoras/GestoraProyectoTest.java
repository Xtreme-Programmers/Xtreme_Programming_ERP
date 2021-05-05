/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoras;

import excepciones.MyException;
import java.util.HashSet;
import modelo.MiembroEquipo;
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
    
    private Proyecto instance;
    
    public GestoraProyectoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws MyException {
        instance = new Proyecto("aaaa", "lalala");
        GestoraProyecto.addProyecto(instance);
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of addProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testAddProyectoSi() {
        System.out.println("Si addProyecto nuevo proyecto");
        try{
            instance = new Proyecto("bbbb", "lalala");
        }catch(MyException ex){
            System.out.println("--AddProyectoSi-- " + ex.getMessage());
        }
        assertEquals(true, GestoraProyecto.addProyecto(instance));
    }
    
    @Test
    public void testAddProyectoNo1() {
        System.out.println("No addProyecto proyecto ya existente");
        boolean expResult = false;
        boolean result = GestoraProyecto.addProyecto(instance);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddProyectoNo2() {
        System.out.println("No addProyecto nombre null");
        try{
            instance = new Proyecto(null, "lalala");
        }catch(MyException ex){
            System.out.println("--AddProyectoNo-- " + ex.getMessage());
        }
        assertEquals(false, GestoraProyecto.addProyecto(instance));
    }
    
    @Test
    public void testAddProyectoNo3() {
        System.out.println("No addProyecto descripción null");
        try{
            instance = new Proyecto("cccc", null);
        }catch(MyException ex){
            System.out.println("--AddProyectoNo-- " + ex.getMessage());
        }
        assertEquals(false, GestoraProyecto.addProyecto(instance));
    }

    /**
     * Test of borraProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testBorraProyectoSi() {
        System.out.println("Si borraProyecto");
        boolean expResult = true;
        boolean result = GestoraProyecto.borraProyecto(instance);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBorraProyectoNo() throws MyException {
        System.out.println("No borraProyecto no existe");
        boolean expResult = false;
        instance = new Proyecto("ddddd", "gfaehgeh");
        boolean result = GestoraProyecto.borraProyecto(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumProyectos method, of class GestoraProyecto.
     */
    @Test
    public void testGetNumProyectos() {
        System.out.println("Si getNumProyectos");
        int expResult = 1;
        int result = GestoraProyecto.getNumProyectos();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscaProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testBuscaProyecto() throws Exception {
        System.out.println("Si buscaProyecto");
        String idSt = "0";
        Proyecto expResult = instance;
        Proyecto result = GestoraProyecto.buscaProyecto(idSt);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminaProyecto method, of class GestoraProyecto.
     */
    @Test
    public void testEliminaProyecto() throws Exception {
        System.out.println("Si eliminaProyecto");
        instance = new Proyecto("ddddd", "gfaehgeh");
        GestoraProyecto.addProyecto(instance);
        GestoraProyecto.eliminaProyecto(instance);
    }
    
}
