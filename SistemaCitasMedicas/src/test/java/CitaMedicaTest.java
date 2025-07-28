/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDateTime;
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
public class CitaMedicaTest {
    
    public CitaMedicaTest() {
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
     /**
     * Test of getPaciente method, of class CitaMedica.
     */
    @Test
    public void testToString_CM1(){
        Paciente paciente = new Paciente("1234567890", "Axel Roman", "axel@correo.com");
        Medico medico=new Medico("Dra. Susana","Cardiologia");
        LocalDateTime fecha=LocalDateTime.of(2025,8,10,15,30);
        CitaMedica cita=new CitaMedica(paciente,medico,fecha);
        String esperado = "Cita con Dra. Susana - Cardiología para Axel Roman (1234567890) en " + fecha + " [Agendada]";
        String actual = cita.toString();
        assertEquals(esperado, actual);
    }
    /**
     * Test of getPaciente method, of class CitaMedica.
     */
    @Test
    public void testSetEstado_CM2_nullAllowed() {
    Paciente paciente = new Paciente("123", "Axel Roman", "axel@correo.com");
    Medico medico = new Medico("Dra. Susana", "Cardiología");
    LocalDateTime fecha = LocalDateTime.of(2025, 8, 15, 10, 0);
    CitaMedica cita = new CitaMedica(paciente, medico, fecha);

    cita.setEstado(null);
    assertNull(cita.getEstado(), "El estado debería poder asignarse como null");
}
 /**
     * Test of getPaciente method, of class CitaMedica.
     */
   
    
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        CitaMedica instance = null;
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico method, of class CitaMedica.
     */
    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        CitaMedica instance = null;
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaHora method, of class CitaMedica.
     */
    @Test
    public void testGetFechaHora() {
        System.out.println("getFechaHora");
        CitaMedica instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getFechaHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CitaMedica.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class CitaMedica.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        CitaMedica instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CitaMedica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
