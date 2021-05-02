/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoras;

import excepciones.MyException;
import gestoras.GestoraEquipo;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private MiembroEquipo instance;
    
    public GestoraEquipoTest() {
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
     * Test of addMiembro method, of class GestoraEquipo.
     */
    @Test
    public void testAddMiembroNo() {
        System.out.println("No addMiembro, ya existe id");
        boolean expResult = false;
        boolean result = GestoraEquipo.addMiembro(instance);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddMiembroSi() {
        System.out.println("Si addMiembro nuevo");
        try {
            instance = new MiembroEquipo("9876", "1234");
        } catch (MyException ex) {
            System.out.println("--AddSi-- " + ex.getMessage());
        }
        assertEquals(true, GestoraEquipo.addMiembro(instance));
    }
    
    @Test
    public void testAddMiembroNoPass() {
        System.out.println("No addMiembro password null");
        try {
            instance = new MiembroEquipo("1234", null);
        } catch (MyException ex) {
            System.out.println("--AddNoPass-- " + ex.getMessage());
        }
        assertEquals(false, GestoraEquipo.addMiembro(instance));
    }
    
    @Test
    public void testAddMiembroNoId() {
        System.out.println("No addMiembro nick null");
        try { 
            instance = new MiembroEquipo(null, "1234");
        } catch (MyException ex) {
            System.out.println("--AddNoId-- " + ex.getMessage());
        }
        assertEquals(false, GestoraEquipo.addMiembro(instance));
    }

    /**
     * Test of borrarMiembroCodigo method, of class GestoraEquipo.
     */
    @Test
    public void testBorrarMiembroCodigoSi() {
        System.out.println("Si borrarMiembroCodigo");
        String codigo = "1234";
        boolean expResult = true;
        boolean result = GestoraEquipo.borrarMiembroCodigo(codigo);
        assertEquals(expResult, result);
    }
    @Test
    public void testBorrarMiembroCodigoNo() {
        System.out.println("No BorrarMiembro codigo no existente");
        String codigo = "4567";
        boolean expResult = false;
        boolean result = GestoraEquipo.borrarMiembroCodigo(codigo);
        assertEquals(expResult, result);
    }

    /**
     * Test of loguearMiembro method, of class GestoraEquipo.
     */
    @Test
    public void testLoguearMiembroSi() {
        System.out.println("Si loguearMiembro");
        String nick = "1234";
        String password = "1234";
        boolean expResult = true;
        boolean result = GestoraEquipo.loguearMiembro(nick, password);
        assertEquals(expResult, result);
    }
    @Test
    public void testLoguearMiembroNoNick() {
        System.out.println("No loguearMiembro nick no existe o null");
        String nick = "6666";
        String password = "1234";
        boolean expResult = false;
        boolean result = GestoraEquipo.loguearMiembro(nick, password);
        assertEquals(expResult, result);
        assertEquals(expResult, GestoraEquipo.loguearMiembro(null, password));
    }
    @Test
    public void testLoguearMiembroNoPass() {
        System.out.println("No loguearMiembro password no coincide o null");
        String nick = "1234";
        String password = "0000";
        boolean expResult = false;
        boolean result = GestoraEquipo.loguearMiembro(nick, password);
        assertEquals(expResult, result);
        assertEquals(expResult, GestoraEquipo.loguearMiembro(nick, null));
    }

}
