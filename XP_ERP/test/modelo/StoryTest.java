/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

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
        instance = new Story("1234","1234", "1234");
        //modelo.Proyecto.CLASERECEPTORA(instance);
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
        String expResult = "";
        String result = instance.getTitulo();
        assertNotEquals(expResult, result);
        //fail("¡¡¡La historia no recibió o carece de titulo!!!");
    }

    /**
     * Test of setTitulo method, of class Story.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetTitulo() throws Exception {
        System.out.println("setTitulo");
        String titulo = "";
        instance.setTitulo(titulo);
        //fail("¡¡¡Fracaso al establecer un titulo a la historia!!!");
    }

    /**
     * Test of getIdStory method, of class Story.
     */
    @Test
    public void testGetIdStory() {
        System.out.println("getIdStory");
        int expResult = 0;
        int result = instance.getIdStory();
        assertNotEquals(expResult, result);
        //fail("¡¡¡La historia no recibió, carece de ID o no es valida!!!");
    }

    /**
     * Test of setIdStory method, of class Story.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetIdStory() throws Exception {
        System.out.println("setIdStory");
        int idStory = 0;
        instance.setIdStory(idStory);
        //fail("¡¡¡Fracaso al establecer ID a la historia!!!");
    }

    /**
     * Test of getMiembroA method, of class Story.
     */
    @Test
    public void testGetMiembroA() {
        System.out.println("getMiembroA");
        Story instance = null;
        MiembroEquipo expResult = null;
        MiembroEquipo result = instance.getMiembroA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiembroEquipo method, of class Story.
     */
    @Test
    public void testSetMiembroEquipo() {
        System.out.println("setMiembroEquipo");
        MiembroEquipo miembroA = null;
        MiembroEquipo miembroB = null;
        instance.setMiembroEquipo(miembroA, miembroB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiembroB method, of class Story.
     */
    @Test
    public void testGetMiembroB() {
        System.out.println("getMiembroB");
        Story instance = null;
        MiembroEquipo expResult = null;
        MiembroEquipo result = instance.getMiembroB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasEstimadas method, of class Story.
     */
    @Test
    public void testGetHorasEstimadas() {
        System.out.println("getHorasEstimadas");
        Story instance = null;
        int expResult = 0;
        int result = instance.getHorasEstimadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasEstimadas method, of class Story.
     */
    @Test
    public void testSetHorasEstimadas_String() throws Exception {
        System.out.println("setHorasEstimadas");
        String horasEstimadas = "";
        Story instance = null;
        instance.setHorasEstimadas(horasEstimadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasEstimadas method, of class Story.
     */
    @Test
    public void testSetHorasEstimadas_int() throws Exception {
        System.out.println("setHorasEstimadas");
        int horasEstimadas = 0;
        Story instance = null;
        instance.setHorasEstimadas(horasEstimadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasFinales method, of class Story.
     */
    @Test
    public void testGetHorasFinales() {
        System.out.println("getHorasFinales");
        Story instance = null;
        int expResult = 0;
        int result = instance.getHorasFinales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasFinales method, of class Story.
     */
    @Test
    public void testSetHorasFinales() throws Exception {
        System.out.println("setHorasFinales");
        int horasFinales = 0;
        Story instance = null;
        instance.setHorasFinales(horasFinales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContenido method, of class Story.
     */
    @Test
    public void testGetContenido() {
        System.out.println("getContenido");
        Story instance = null;
        String expResult = "";
        String result = instance.getContenido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContenido method, of class Story.
     */
    @Test
    public void testSetContenido() throws Exception {
        System.out.println("setContenido");
        String contenido = "";
        Story instance = null;
        instance.setContenido(contenido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Story.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Story instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Story.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Story instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Story.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Story instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
