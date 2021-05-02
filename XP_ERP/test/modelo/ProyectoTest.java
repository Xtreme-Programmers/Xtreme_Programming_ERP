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
        
        instanceP = new Proyecto("aaaa", "lalala");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setNombreProyecto method, of class Proyecto.
     */
    @Test
    public void testSetNombreProyectoSi() throws Exception {
        System.out.println("Si setNombreProyecto");
        String nombreProyecto = "aaaa";
        instanceP.setNombreProyecto(nombreProyecto);
        assertEquals(nombreProyecto, instanceP.getNombreProyecto());
    }
    
    @Test
    public void testSetNombreProyectoNo1() throws Exception {
        System.out.println("No setNombreProyecto nombre nulo");
        String nombreProyecto = null;
        try{
            instanceP.setNombreProyecto(nombreProyecto);
        }catch(MyException ex){
            System.out.println("--NoSetNombre-- " + ex.getMessage());
        } 
    }
    
    @Test
    public void testSetNombreProyectoNo2() throws Exception {
        System.out.println("No setNombreProyecto nombre vacío");
        String nombreProyecto = "";
        try{
            instanceP.setNombreProyecto(nombreProyecto);
        }catch(MyException ex){
            System.out.println("--NoSetNombre-- " + ex.getMessage());
        } 
    }

    /**
     * Test of setDescripcion method, of class Proyecto.
     */
    @Test
    public void testSetDescripcionSi() throws Exception {
        System.out.println("Si setDescripcion");
        String descripcion = "aaaa";
        instanceP.setDescripcion(descripcion);
        assertEquals(descripcion, instanceP.getDescripcion());
    }
    
    @Test
    public void testSetDescripcionNo1() throws Exception {
        System.out.println("No setDescripcion descripción nula");
        String descripcion = null;
        try{
            instanceP.setDescripcion(descripcion);
        }catch(MyException ex){
            System.out.println("--NoSetNombre-- " + ex.getMessage());
        } 
    }
    
    @Test
    public void testSetDescripcionNo2() throws Exception {
        System.out.println("No setDescripcion descripción vacía");
        String descripcion = "";
        try{
            instanceP.setDescripcion(descripcion);
        }catch(MyException ex){
            System.out.println("--NoSetNombre-- " + ex.getMessage());
        } 
    }

    /**
     * Test of setEstadoProyecto method, of class Proyecto.
     */
    @Test
    public void testSetEstadoProyectoSi() throws Exception {
        System.out.println("Si setEstadoProyecto");
        String estadoProyecto = "enCurso";
        instanceP.setEstadoProyecto(estadoProyecto);
        assertEquals(estadoProyecto, instanceP.getEstadoProyecto());
    }
    
    @Test
    public void testSetEstadoProyectoNo1() throws Exception {
        System.out.println("No setEstadoProyecto estado nulo");
        String estadoProyecto = null;
        try{
            instanceP.setEstadoProyecto(estadoProyecto);
        }catch(MyException ex){
            System.out.println("--NoSetEstadoProyecto-- " + ex.getMessage());
        }
    }
    
    @Test
    public void testSetEstadoProyectoNo2() throws Exception {
        System.out.println("No setEstadoProyecto estado vacío");
        String estadoProyecto = "";
        try{
            instanceP.setEstadoProyecto(estadoProyecto);
        }catch(MyException ex){
            System.out.println("--NoSetEstadoProyecto-- " + ex.getMessage());
        }
    }
    
    @Test
    public void testSetEstadoProyectoNo3() throws Exception {
        System.out.println("No setEstadoProyecto estado no existente");
        String estadoProyecto = "asdfgh";
        try{
            instanceP.setEstadoProyecto(estadoProyecto);
        }catch(MyException ex){
            System.out.println("--NoSetEstadoProyecto-- " + ex.getMessage());
        }
    }

    /**
     * Test of getIdProyecto method, of class Proyecto.
     */
    @Test
    public void testGetIdProyecto() {
        System.out.println("Si getIdProyecto");
        int expResult = 0;
        int result = instanceP.getIdProyecto();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombreProyecto method, of class Proyecto.
     */
    @Test
    public void testGetNombreProyecto() {
        System.out.println("Si getNombreProyecto");
        String expResult = "aaaa";
        String result = instanceP.getNombreProyecto();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescripcion method, of class Proyecto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("Si getDescripcion");
        String expResult = "lalala";
        String result = instanceP.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEstadoProyecto method, of class Proyecto.
     */
    @Test
    public void testGetEstadoProyecto() {
        System.out.println("Si getEstadoProyecto");
        String expResult = "enCurso";
        String result = instanceP.getEstadoProyecto();
        assertEquals(expResult, result);
    }
}
