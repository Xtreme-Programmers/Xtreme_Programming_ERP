/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import gestoras.GestoraEquipo;
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
public class GestoraEquipoTest {
    
    public GestoraEquipoTest() {
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
     * Test of addMiembro method, of class GestoraEquipo.
     */
    @Test
    public void testAddMiembro() {
        System.out.println("addMiembro");
        MiembroEquipo mE = new MiembroEquipo();
        boolean expResult = false;
        boolean result = GestoraEquipo.addMiembro(mE);
        assertEquals(expResult, result);
        fail("¡¡¡El intento de añadir un miembro falló!!!");
    }

    /**
     * Test of borrarMiembroCodigo method, of class GestoraEquipo.
     */
    @Test
    public void testBorrarMiembroCodigo() {
        System.out.println("borrarMiembroCodigo");
        String codigo = "1235";
        boolean expResult = false;
        boolean result = GestoraEquipo.borrarMiembroCodigo(codigo);
        assertEquals(expResult, result);
        fail("¡¡¡El intento de borrar un miembro falló!!!");
    }

    /**
     * Test of loguearMiembro method, of class GestoraEquipo.
     */
    @Test
    public void testLoguearMiembro() {
        System.out.println("loguearMiembro");
        String nick = "";
        String password = "";
        boolean expResult = false;
        boolean result = GestoraEquipo.loguearMiembro(nick, password);
        assertEquals(expResult, result);
        fail("¡¡¡Los datos establecidos para añadir nuevo miembro no han sido aceptados!!!");
    }
    
}
