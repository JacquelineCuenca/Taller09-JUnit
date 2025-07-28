/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class MedicoTest {

    public MedicoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // nombre, especialidad
    @Test
    public void testInit1() {
        String nombre = "Juan";
        String especialidad = "Cardiologo";

        Medico medico = new Medico(nombre, especialidad);

        assertEquals(nombre, medico.getNombre());
        assertEquals(especialidad, medico.getEspecialidad());

    }

    // nombre vacío, especialidad
    @Test
    public void testInit2() {
        String nombre = "";
        String especialidad = "Cardiologo";

        Medico medico = new Medico(nombre, especialidad);

        assertEquals(nombre, medico.getNombre());
        assertEquals(especialidad, medico.getEspecialidad());
    }

    /**
     * Test of getNombre method, of class Medico.
     */
    @Test
    public void testGetNombre() {
        System.out.println("testGetNombre");

        Medico instance = new Medico(null, "Cardiología");

        String expResult = "Dr. Juan Pérez";
        String result = instance.getNombre();

        assertEquals(expResult, result);
    }

    /**
     * Test of getEspecialidad method, of class Medico.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("testGetEspecialidad");

        Medico instance = new Medico("Dr. Juan Pérez", "Cardiologia");

        String expResult = "Cardiología";
        String result = instance.getEspecialidad();

        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Medico.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");

        Medico instance = new Medico("Dr. Juan Pérez", "Cardiología");
        String expResult = "Dr. Juan Pérez - Cardiología";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
