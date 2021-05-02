/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import excepciones.MyException;
import java.util.HashSet;
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
        
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws MyException {
        instance = new MiembroEquipo("1234", "1234");
        gestoras.GestoraEquipo.addMiembro(instance);   
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIdMiembro method, of class MiembroEquipo.
     */
    @Test
    public void testGetIdMiembro() {
        System.out.println("Si getIdMiembro");
        String expResult = "1234";
        String result = instance.getIdMiembro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdMiembro method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetIdMiembroSi() throws Exception {
        System.out.println("Si setIdMiembro");
        String idMiembro = "12345";
        instance.setIdMiembro(idMiembro);
        assertEquals(idMiembro, instance.getIdMiembro());
    }
    
    @Test
    public void testSetIdMiembroNo() throws Exception {
        System.out.println("No setIdMiembro id vacio");
        String idMiembro = "";
        try{
            instance.setIdMiembro(idMiembro);
        }catch(MyException ex){
            System.out.println("--NoSetId-- " + ex.getMessage());
        }
    }
    
    @Test
    public void testSetIdMiembroNo1() throws Exception {
        System.out.println("No setIdMiembro id null");
        String idMiembro = null;
        try{
            instance.setIdMiembro(idMiembro);
        }catch(MyException ex){
            System.out.println("--NoSetId-- " + ex.getMessage());
        }
    }

    /**
     * Test of getPass method, of class MiembroEquipo.
     */
    @Test
    public void testGetPass() {
        System.out.println("Si getPass");
        String expResult = "1234";
        String result = instance.getPass();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPass method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetPassSi() throws Exception {
        System.out.println("Si setPass");
        String pass = "1234";
        instance.setPass(pass);
        assertEquals(pass, instance.getPass());
    }
    
    @Test
    public void testSetPassNo() throws Exception {
        System.out.println("No setPass pass vacia");
        String pass = "";
        try{
            instance.setPass(pass);
        }catch(MyException ex){
            System.out.println("--NoSetPass-- " + ex.getMessage());
        }
    }
    
    @Test
    public void testSetPassNo1() throws Exception {
        System.out.println("No setPass pass null");
        String pass = null;
        try{
            instance.setPass(pass);
        }catch(MyException ex){
            System.out.println("--NoSetPass-- " + ex.getMessage());
        }
    }

    /**
     * Test of addRol method, of class MiembroEquipo.
     */
    @Test
    public void testAddRol() {
        System.out.println("Si addRol");
        String rol = "Programador";
        boolean expResult = true;
        boolean result = MiembroEquipo.addRol(rol);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeRol method, of class MiembroEquipo.
     */
    @Test
    public void testRemoveRol() {
        System.out.println("Si removeRol");
        String rol = "Programador";
        boolean expResult = true;
        boolean result = MiembroEquipo.removeRol(rol);
        assertEquals(expResult, result);
    }

    /**
     * Test of setRol method, of class MiembroEquipo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetRol() throws Exception {
        System.out.println("No setRol");
        String entradaPorTeclado = "";
        boolean expResult = false;
        boolean result = instance.setRol(entradaPorTeclado);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarRolNombre method, of class MiembroEquipo.
     */
    @Test
    public void testBuscarRolNombre() {
        System.out.println("buscarRolNombre");
        String nombre = "Programador";
        String expResult = "Programador";
        String result = instance.buscarRolNombre(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarRol method, of class MiembroEquipo.
     */
    @Test
    public void testEliminarRol() {
        System.out.println("eliminarRol");
        String codigo = "Programador";
        boolean expResult = false;
        boolean result = instance.eliminarRol(codigo);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class MiembroEquipo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = instance.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MiembroEquipo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
