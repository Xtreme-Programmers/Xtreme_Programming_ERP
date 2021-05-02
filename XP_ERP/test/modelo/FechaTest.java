/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class FechaTest {
    
    private Fecha instance;
    
    public FechaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Fecha(1, 1, 2021);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMesLetras method, of class Fecha.
     */
    @Test
    public void testGetMesLetras() {
        System.out.println("Si getMesLetras");
        int mes = 1;
        String expResult = "enero";
        String result = instance.getMesLetras(mes);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetMesLetrasNo() {
        System.out.println("No getMesLetras mes erroneo");
        int mes = 2;
        String expResult = "enero";
        String result = instance.getMesLetras(mes);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of esCorrecta method, of class Fecha.
     */
    @Test
    public void testEsCorrecta() {
        System.out.println("Si esCorrecta");
        boolean expResult = true;
        boolean result = instance.esCorrecta();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsCorrectaNo() {
        System.out.println("No esCorrecta formato erroneo");
        boolean expResult = false;
        Fecha instance1 = new Fecha(40, 1, 2021);
        assertEquals(expResult, instance1.esCorrecta());
        Fecha instance2 = new Fecha(1, 13, 2021);
        assertEquals(expResult, instance2.esCorrecta());
        Fecha instance3 = new Fecha(1, 1, 1800);
        assertEquals(expResult, instance3.esCorrecta());
    }

    /**
     * Test of muestraFechaLarga method, of class Fecha.
     */
    @Test
    public void testMuestraFechaLargaSi() {
        System.out.println("Si muestraFechaLarga");
        String expResult = "1 de enero de 2021";
        String result = instance.muestraFechaLarga();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMuestraFechaLargaNo() {
        System.out.println("No muestraFechaLarga fecha no correcta");
        Fecha instance1 = new Fecha(40, 1, 2021);
        String expResult = "Fecha incorrecta: \n" + "Dia: 40" + "\n" +  
                "Mes: 1" + "\n" + "Año: 2021";
        String result = instance1.muestraFechaLarga();
        assertEquals(expResult, result);
    }

    /**
     * Test of muestraFechaCorta method, of class Fecha.
     */
    @Test
    public void testMuestraFechaCorta() {
        System.out.println("Si muestraFechaCorta");
        String expResult = "1 de 1 de 2021";
        String result = instance.muestraFechaCorta();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMuestraFechaCortaNo() {
        System.out.println("No muestraFechaCorta fecha no correcta");
        Fecha instance1 = new Fecha(40, 1, 2021);
        String expResult = "Fecha incorrecta: \n" + "Dia: 40" + "\n" +  
                "Mes: 1" + "\n" + "Año: 2021";
        String result = instance1.muestraFechaCorta();
        assertEquals(expResult, result);
    }

    /**
     * Test of muestraFechaFormateada method, of class Fecha.
     */
    @Test
    public void testMuestraFechaFormateadaSi() {
        System.out.println("Si muestraFechaFormateada");
        String expResult = "202111";
        String result = instance.muestraFechaFormateada();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMuestraFechaFormateadaNo() {
        System.out.println("No muestraFechaFormateada fecha distinta a la esperada");
        String expResult = "201911";
        String result = instance.muestraFechaFormateada();
        assertNotEquals(expResult, result);
    }
    
}
