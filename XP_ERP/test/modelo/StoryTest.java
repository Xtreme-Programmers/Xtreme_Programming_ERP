/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.MyException;
import modelo.MiembroEquipo;
import modelo.Story;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno
 */
public class StoryTest {

    private Story instance;

    public StoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws MyException {
        instance = new Story("1234", "1234", "1234");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTitulo method, of class Story.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        String expResult = "1234";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        assertNotEquals(null, result);
        assertNotEquals("", result);
    }

    /**
     * Test of setTitulo method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetTitulo() throws Exception {
        System.out.println("setTitulo");
        String titulo = "JAIME EL BANCO";
        instance.setTitulo(titulo);
        assertEquals(titulo, instance.getTitulo());
        assertNotEquals(null, instance.getTitulo());
        assertNotEquals("", instance.getTitulo());
    }

    /**
     * Test of getIdStory method, of class Story.
     */
    @Test
    public void testGetIdStory() {
        System.out.println("getIdStory");
        int expResult = 0;
        int result = instance.getIdStory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdStory method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetIdStory() throws Exception {
        System.out.println("setIdStory");
        int idStory = 0;
        instance.setIdStory(idStory);
        assertEquals(idStory, instance.getIdStory());
    }

    /**
     * Test of getMiembroA method, of class Story.
     */
    @Test
    public void testGetMiembroA() {
        System.out.println("getMiembroA");
        MiembroEquipo expResult = null;
        MiembroEquipo result = instance.getMiembroA();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMiembroEquipo method, of class Story.
     *
     * @throws excepciones.MyException
     */
    @Test
    public void testSetMiembroEquipo() throws MyException {
        System.out.println("setMiembroEquipo");
        MiembroEquipo miembroA = new MiembroEquipo("1234","1234");
        MiembroEquipo miembroB = new MiembroEquipo("4321","4321");
        instance.setMiembroEquipo(miembroA, miembroB);
    }

    /**
     * Test of getMiembroB method, of class Story.
     */
    @Test
    public void testGetMiembroB() {
        System.out.println("getMiembroB");
        MiembroEquipo expResult = null;
        MiembroEquipo result = instance.getMiembroB();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHorasEstimadas method, of class Story.
     */
    @Test
    public void testGetHorasEstimadas() {
        System.out.println("getHorasEstimadas");
        int expResult = 1234;
        int result = instance.getHorasEstimadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHorasEstimadas method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetHorasEstimadasString() throws Exception {
        System.out.println("setHorasEstimadas");
        String horasEstimadas = "1234";
        instance.setHorasEstimadas(horasEstimadas);
        assertEquals(Integer.parseInt(horasEstimadas), instance.getHorasEstimadas());
    }

    /**
     * Test of setHorasEstimadas method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetHorasEstimadasInt() throws Exception {
        System.out.println("setHorasEstimadas");
        int horasEstimadas = 0;
        instance.setHorasEstimadas(horasEstimadas);
        assertEquals(horasEstimadas, instance.getHorasEstimadas());
    }

    /**
     * Test of getHorasFinales method, of class Story.
     */
    @Test
    public void testGetHorasFinales() {
        System.out.println("getHorasFinales");
        int expResult = 0;
        int result = instance.getHorasFinales();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHorasFinales method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetHorasFinales() throws Exception {
        System.out.println("setHorasFinales");
        int horasFinales = 0;
        instance.setHorasFinales(horasFinales);
        assertEquals(horasFinales, instance.getHorasFinales());
    }

    /**
     * Test of getContenido method, of class Story.
     */
    @Test
    public void testGetContenido() {
        System.out.println("getContenido");
        String expResult = "1234";
        String result = instance.getContenido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContenido method, of class Story.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetContenido() throws Exception {
        System.out.println("setContenido");
        String contenido = "1234";
        instance.setContenido(contenido);
        assertEquals(contenido, instance.getContenido());
        assertNotEquals("", instance.getContenido());
        assertNotEquals(null, instance.getContenido());
    }

    /**
     * Test of hashCode method, of class Story.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = instance.hashCode();
        assertNotEquals(expResult, result);
    }
}
