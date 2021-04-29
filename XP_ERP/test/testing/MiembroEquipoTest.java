/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import excepciones.MyException;
import modelo.MiembroEquipo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LopezSamuel
 */
public class MiembroEquipoTest {

    private MiembroEquipo instance;

    public MiembroEquipoTest() throws MyException {
        instance = new MiembroEquipo("1234", "1234");
        gestoras.GestoraEquipo.addMiembro(instance);
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
     * Test of getIdMiembro method, of class MiembroEquipo.
     */
    @Test
    public void testGetIdMiembro() {
        System.out.println("getIdMiembro");
        String expResult = "";
        String result = instance.getIdMiembro();
        assertEquals(expResult, result);
        fail("¡¡¡No se obtuvieron datos del tipo deseado!!!");

    }

    /**
     * Test of setIdMiembro method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetIdMiembro() throws Exception {
        System.out.println("setIdMiembro");
        String idMiembro = "";
        MiembroEquipo instance = new MiembroEquipo("1234", "1234");
        instance.setIdMiembro(idMiembro);
        fail("¡¡¡Los datos que se querían establecer no se añadieron!!!");
    }

    /**
     * Test of getPass method, of class MiembroEquipo.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");

        try {
            String expResult = "";
            String result = instance.getPass();
            assertEquals(expResult, result);
            fail("¡¡¡No se obtuvieron datos del tipo deseado!!!");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * Test of setPass method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetPass() throws Exception {
        System.out.println("setPass");
        String pass = "33211";
        MiembroEquipo instance = new MiembroEquipo();
        instance.setPass(pass);
        fail("¡¡¡Los datos que se querían establecer no se añadieron!!!");
    }

    /**
     * Test of addRol method, of class MiembroEquipo.
     */
    @Test
    public void testAddRol() {
        System.out.println("addRol");
        String rol = "";
        boolean expResult = false;
        boolean result = MiembroEquipo.addRol(rol);
        assertEquals(expResult, result);
        fail("¡¡¡No se encontró rol a añadir!!!");
    }

    /**
     * Test of removeRol method, of class MiembroEquipo.
     */
    @Test
    public void testRemoveRol() {
        System.out.println("removeRol");
        String rol = "";
        boolean expResult = false;
        boolean result = MiembroEquipo.removeRol(rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("¡¡¡No se encontró rol que eliminar!!!");
    }

    /**
     * Test of setRol method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetRol() throws Exception {
        System.out.println("setRol");
        String entradaPorTeclado = "";
        boolean expResult = false;
        boolean result = MiembroEquipo.setRol(entradaPorTeclado);
        assertEquals(expResult, result);
        fail("¡¡¡Los datos que se querían establecer no se añadieron!!!");
    }

    /**
     * Test of buscarRolNombre method, of class MiembroEquipo.
     */
    @Test
    public void testBuscarRolNombre() {
        System.out.println("buscarRolNombre");
        String nombre = "";
        String expResult = "";
        String result = MiembroEquipo.buscarRolNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("¡¡¡Los datos a buscar no son cadena!!!");
    }

    /**
     * Test of eliminarRol method, of class MiembroEquipo.
     */
    @Test
    public void testEliminarRol() {
        System.out.println("eliminarRol");
        String codigo = "";
        MiembroEquipo instance = new MiembroEquipo(codigo, "1234");
        boolean expResult = false;
        boolean result = instance.eliminarRol(codigo);
        assertEquals(expResult, result);
        fail("¡¡¡No se pudo eliminar el rol solicitado!!!");
    }

    /**
     * Test of hashCode method, of class MiembroEquipo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MiembroEquipo instance = new MiembroEquipo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("¡¡¡Hash no generado!!!");
    }

    /**
     * Test of equals method, of class MiembroEquipo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        MiembroEquipo instance = new MiembroEquipo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("¡¡¡No se encontró ningún elemento coincidente!!!");
    }

}
